package parser

import "github.com/antlr/antlr4/runtime/Go/antlr/v4"

func (s *JsonLangListenerImplement) jsonReceiver() {
	cur := s.stack.cur
	pre := s.stack.pre
	if pre == nil {
		return
	}
	pre.cur = cur
}

func (s *JsonLangListenerImplement) objectReceiver() {
	cur := s.stack.cur
	pre := s.stack.pre
	if pre == nil {
		return
	}

	fa := pre.cur

	switch fa.tp {
	case typeValue, typeJson:
		fa.val = cur.val
	}

	fa.payload = fa.val.getPayload()
}

func (s *JsonLangListenerImplement) pairReceiver() {
	cur := s.stack.cur
	pre := s.stack.pre
	if pre == nil {
		return
	}

	fa := pre.cur
	if fa.val == nil {
		fa.val = &value{
			tp: typeObject,
		}
	}

	switch fa.tp {
	case typeObject:
		fa.val.obj = append(fa.val.obj, cur.val.pair)
	}

	fa.payload = fa.val.getPayload()
}

func (s *JsonLangListenerImplement) arrayReceiver() {
	cur := s.stack.cur
	pre := s.stack.pre
	if pre == nil {
		return
	}

	fa := pre.cur

	switch fa.tp {
	case typeValue, typeJson:
		fa.val = cur.val
	}

	fa.payload = fa.val.getPayload()
}

func (s *JsonLangListenerImplement) valueReceiver() {
	cur := s.stack.cur
	pre := s.stack.pre
	if pre == nil {
		return
	}

	fa := pre.cur

	if fa.val == nil {
		fa.val = &value{
			tp: typeArray,
		}
	}

	switch fa.tp {
	case typeArray:
		fa.val.arr = append(fa.val.arr, cur.val)
	case typePair:
		fa.val.pair.v = cur.val
	}

	fa.payload = fa.val.getPayload()
}

func (s *JsonLangListenerImplement) terminalReceiver(n antlr.TerminalNode) {
	tk := n.GetSymbol()
	tp := tk.GetTokenType()
	text := tk.GetText()
	var v *value

	switch tp {
	case 10:
		text = text[1 : len(text)-1] // 去掉双引号
		v = &value{
			tp:  typeString,
			str: text,
		}
	case 11:
		v = &value{
			tp:  typeNumber,
			num: getInterfaceToFloat64(text),
		}
	case 7, 8:
		v = &value{
			tp:      typeBool,
			boolean: text == "true",
		}
	case 9:
		v = &value{
			tp: typeNull,
		}
	default:
		return
	}

	cur := s.stack.cur
	cur.val = &value{
		tp: cur.tp,
	}
	switch cur.tp {
	case typeValue:
		cur.val = v
	case typeArray:
		cur.val.arr = append(cur.val.arr, v)
	case typePair:
		cur.val.pair = &pair{
			k: v.str,
		}
	}
	cur.payload = cur.val.getPayload()
}
