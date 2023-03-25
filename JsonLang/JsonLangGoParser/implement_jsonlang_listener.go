package parser

import (
	"fmt"
	"github.com/antlr/antlr4/runtime/Go/antlr/v4"
	"strconv"
)

const (
	typeJson   = "json"
	typeObject = "obj"
	typeArray  = "arr"
	typePair   = "pair"
	typeValue  = "val"
	typeString = "str"
	typeNumber = "num"
	typeBool   = "bool"
	typeNull   = "null"
	typeIgnore = "pass"
)

type node struct {
	tp      string
	val     *value
	payload interface{}
}

type object []*pair

func (obj object) getPayload() interface{} {
	m := make(map[string]interface{}, len(obj))
	for i := range obj {
		if pr := obj[i]; pr != nil {
			m[pr.k] = pr.v.getPayload()
		}
	}
	return m
}

type pair struct {
	k string
	v *value
}

func (pr *pair) getPayload() interface{} {
	if pr == nil {
		return nil
	}
	return map[string]interface{}{
		pr.k: pr.v.getPayload(),
	}
}

type array []*value

func (arr array) getPayload() interface{} {
	tmp := make([]interface{}, 0, len(arr))
	for i := range arr {
		if obj := arr[i]; obj != nil {
			tmp = append(tmp, obj.getPayload())
		}
	}
	return tmp
}

type value struct {
	tp      string
	str     string
	num     float64
	obj     object
	arr     array
	boolean bool
	null    interface{}
	pair    *pair
}

func (v *value) getValue() interface{} {
	if v == nil {
		return nil
	}
	switch v.tp {
	case typeString:
		return v.str
	case typeNumber:
		return v.num
	case typeObject:
		return v.obj
	case typeArray:
		return v.arr
	case typeBool:
		return v.boolean
	case typeNull:
		return nil
	default:
		return nil
	}
}

func (v *value) getPayload() interface{} {
	if v == nil {
		return nil
	}
	switch v.tp {
	case typeString:
		return v.str
	case typeNumber:
		return v.num
	case typeObject:
		return v.obj.getPayload()
	case typeArray:
		return v.arr.getPayload()
	case typeBool:
		return v.boolean
	case typeNull:
		return nil
	case typePair:
		return map[string]interface{}{
			v.pair.k: v.pair.v.getPayload(),
		}
	default:
		return nil
	}
}

type stack struct {
	cur *node
	pre *stack
}

type JsonLangListenerImplement struct {
	BaseJsonLangListener

	stop bool

	// 记录前几个遍历过的 token, 用来 debug
	preTokens []string

	stack *stack
}

/*
	implement
*/

func (s *JsonLangListenerImplement) VisitTerminal(n antlr.TerminalNode) {
	s.addPreTokens(n.GetText())
	s.terminalReceiver(n)
}

func (s *JsonLangListenerImplement) VisitErrorNode(node antlr.ErrorNode) {}

func (s *JsonLangListenerImplement) EnterEveryRule(ctx antlr.ParserRuleContext) {}

func (s *JsonLangListenerImplement) ExitEveryRule(ctx antlr.ParserRuleContext) {}

func (s *JsonLangListenerImplement) EnterJson(ctx *JsonContext) {
	s.addPreTokens(ctx.GetText())
	nd := &node{
		tp: typeJson,
	}
	s.push(nd)
}

func (s *JsonLangListenerImplement) ExitJson(ctx *JsonContext) {
	s.shouldStop()
}

func (s *JsonLangListenerImplement) EnterObject(ctx *ObjectContext) {
	s.addPreTokens(ctx.GetText())
	nd := &node{
		tp: typeObject,
	}
	s.push(nd)
}

func (s *JsonLangListenerImplement) ExitObject(ctx *ObjectContext) {
	s.shouldStop()
	s.objectReceiver()
	s.pop()
}

func (s *JsonLangListenerImplement) EnterPair(ctx *PairContext) {
	s.addPreTokens(ctx.GetText())
	nd := &node{
		tp: typePair,
	}
	s.push(nd)
}

func (s *JsonLangListenerImplement) ExitPair(ctx *PairContext) {
	s.shouldStop()
	s.pairReceiver()
	s.pop()
}

func (s *JsonLangListenerImplement) EnterArray(ctx *ArrayContext) {
	s.addPreTokens(ctx.GetText())
	nd := &node{
		tp: typeArray,
	}
	s.push(nd)
}

func (s *JsonLangListenerImplement) ExitArray(ctx *ArrayContext) {
	s.shouldStop()
	s.arrayReceiver()
	s.pop()
}

func (s *JsonLangListenerImplement) EnterValue(ctx *ValueContext) {
	s.addPreTokens(ctx.GetText())
	nd := &node{
		tp: typeValue,
	}
	s.push(nd)
}

func (s *JsonLangListenerImplement) ExitValue(ctx *ValueContext) {
	s.shouldStop()
	s.valueReceiver()
	s.pop()
}

/*
	tools
*/

func (s *JsonLangListenerImplement) pop() {
	s.stack = s.stack.pre
}

func (s *JsonLangListenerImplement) push(nd *node) {
	if s.stack != nil {
		tmp := s.stack
		s.stack = &stack{
			cur: nd,
			pre: tmp,
		}
	}
	if s.stack == nil {
		s.stack = &stack{
			cur: nd,
		}
	}
}

func (s *JsonLangListenerImplement) shouldStop() {
	if s.stop {
		panic(fmt.Sprintf(" break | preTokens:%v ", s.preTokens))
	}
}

func (s *JsonLangListenerImplement) addPreTokens(text string) {
	s.preTokens = append(s.preTokens, text)
	if len(s.preTokens) > 5 {
		s.preTokens = s.preTokens[1:]
	}
}

func (s *JsonLangListenerImplement) getCurPayload() interface{} {
	if s.stack == nil || s.stack.cur == nil {
		return nil
	}
	return s.stack.cur.payload
}

func getInterfaceToFloat64(t interface{}) float64 {
	var t2 float64
	switch t1 := t.(type) {
	case uint:
		t2 = float64(t1)
	case int8:
		t2 = float64(t1)
	case uint8:
		t2 = float64(t1)
	case int16:
		t2 = float64(t1)
	case uint16:
		t2 = float64(t1)
	case int32:
		t2 = float64(t1)
	case uint32:
		t2 = float64(t1)
	case int:
		t2 = float64(t1)
	case uint64:
		t2 = float64(t1)
	case float32:
		t2 = float64(t1)
	case float64:
		t2 = t1
	case string:
		t2, _ = strconv.ParseFloat(t1, 64)
	case []uint8:
		t2, _ = strconv.ParseFloat(string(t1), 64)
	default:
		t2, _ = t.(float64)
	}
	return t2
}
