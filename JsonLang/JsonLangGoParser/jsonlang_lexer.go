// Code generated from JsonLang.txt by ANTLR 4.12.0. DO NOT EDIT.

package parser

import (
	"fmt"
	"sync"
	"unicode"

	"github.com/antlr/antlr4/runtime/Go/antlr/v4"
)

// Suppress unused import error
var _ = fmt.Printf
var _ = sync.Once{}
var _ = unicode.IsLetter

type JsonLangLexer struct {
	*antlr.BaseLexer
	channelNames []string
	modeNames    []string
	// TODO: EOF string
}

var jsonlanglexerLexerStaticData struct {
	once                   sync.Once
	serializedATN          []int32
	channelNames           []string
	modeNames              []string
	literalNames           []string
	symbolicNames          []string
	ruleNames              []string
	predictionContextCache *antlr.PredictionContextCache
	atn                    *antlr.ATN
	decisionToDFA          []*antlr.DFA
}

func jsonlanglexerLexerInit() {
	staticData := &jsonlanglexerLexerStaticData
	staticData.channelNames = []string{
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN",
	}
	staticData.modeNames = []string{
		"DEFAULT_MODE",
	}
	staticData.literalNames = []string{
		"", "'{'", "','", "'}'", "':'", "'['", "']'", "'true'", "'false'", "'null'",
	}
	staticData.symbolicNames = []string{
		"", "", "", "", "", "", "", "", "", "", "STRING", "NUMBER", "WS",
	}
	staticData.ruleNames = []string{
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
		"STRING", "ESC", "UNICODE", "HEX", "NUMBER", "INT", "EXP", "WS",
	}
	staticData.predictionContextCache = antlr.NewPredictionContextCache()
	staticData.serializedATN = []int32{
		4, 0, 12, 130, 6, -1, 2, 0, 7, 0, 2, 1, 7, 1, 2, 2, 7, 2, 2, 3, 7, 3, 2,
		4, 7, 4, 2, 5, 7, 5, 2, 6, 7, 6, 2, 7, 7, 7, 2, 8, 7, 8, 2, 9, 7, 9, 2,
		10, 7, 10, 2, 11, 7, 11, 2, 12, 7, 12, 2, 13, 7, 13, 2, 14, 7, 14, 2, 15,
		7, 15, 2, 16, 7, 16, 1, 0, 1, 0, 1, 1, 1, 1, 1, 2, 1, 2, 1, 3, 1, 3, 1,
		4, 1, 4, 1, 5, 1, 5, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 7, 1, 7, 1, 7, 1,
		7, 1, 7, 1, 7, 1, 8, 1, 8, 1, 8, 1, 8, 1, 8, 1, 9, 1, 9, 1, 9, 5, 9, 67,
		8, 9, 10, 9, 12, 9, 70, 9, 9, 1, 9, 1, 9, 1, 10, 1, 10, 1, 10, 3, 10, 77,
		8, 10, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 11, 1, 12, 1, 12, 1, 13, 3,
		13, 88, 8, 13, 1, 13, 1, 13, 1, 13, 1, 13, 3, 13, 94, 8, 13, 1, 13, 3,
		13, 97, 8, 13, 1, 13, 1, 13, 1, 13, 1, 13, 3, 13, 103, 8, 13, 1, 13, 3,
		13, 106, 8, 13, 1, 14, 1, 14, 1, 14, 5, 14, 111, 8, 14, 10, 14, 12, 14,
		114, 9, 14, 3, 14, 116, 8, 14, 1, 15, 1, 15, 3, 15, 120, 8, 15, 1, 15,
		1, 15, 1, 16, 4, 16, 125, 8, 16, 11, 16, 12, 16, 126, 1, 16, 1, 16, 0,
		0, 17, 1, 1, 3, 2, 5, 3, 7, 4, 9, 5, 11, 6, 13, 7, 15, 8, 17, 9, 19, 10,
		21, 0, 23, 0, 25, 0, 27, 11, 29, 0, 31, 0, 33, 12, 1, 0, 8, 2, 0, 34, 34,
		92, 92, 8, 0, 34, 34, 47, 47, 92, 92, 98, 98, 102, 102, 110, 110, 114,
		114, 116, 116, 3, 0, 48, 57, 65, 70, 97, 102, 1, 0, 49, 57, 1, 0, 48, 57,
		2, 0, 69, 69, 101, 101, 2, 0, 43, 43, 45, 45, 3, 0, 9, 10, 13, 13, 32,
		32, 137, 0, 1, 1, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 5, 1, 0, 0, 0, 0, 7, 1,
		0, 0, 0, 0, 9, 1, 0, 0, 0, 0, 11, 1, 0, 0, 0, 0, 13, 1, 0, 0, 0, 0, 15,
		1, 0, 0, 0, 0, 17, 1, 0, 0, 0, 0, 19, 1, 0, 0, 0, 0, 27, 1, 0, 0, 0, 0,
		33, 1, 0, 0, 0, 1, 35, 1, 0, 0, 0, 3, 37, 1, 0, 0, 0, 5, 39, 1, 0, 0, 0,
		7, 41, 1, 0, 0, 0, 9, 43, 1, 0, 0, 0, 11, 45, 1, 0, 0, 0, 13, 47, 1, 0,
		0, 0, 15, 52, 1, 0, 0, 0, 17, 58, 1, 0, 0, 0, 19, 63, 1, 0, 0, 0, 21, 73,
		1, 0, 0, 0, 23, 78, 1, 0, 0, 0, 25, 84, 1, 0, 0, 0, 27, 105, 1, 0, 0, 0,
		29, 115, 1, 0, 0, 0, 31, 117, 1, 0, 0, 0, 33, 124, 1, 0, 0, 0, 35, 36,
		5, 123, 0, 0, 36, 2, 1, 0, 0, 0, 37, 38, 5, 44, 0, 0, 38, 4, 1, 0, 0, 0,
		39, 40, 5, 125, 0, 0, 40, 6, 1, 0, 0, 0, 41, 42, 5, 58, 0, 0, 42, 8, 1,
		0, 0, 0, 43, 44, 5, 91, 0, 0, 44, 10, 1, 0, 0, 0, 45, 46, 5, 93, 0, 0,
		46, 12, 1, 0, 0, 0, 47, 48, 5, 116, 0, 0, 48, 49, 5, 114, 0, 0, 49, 50,
		5, 117, 0, 0, 50, 51, 5, 101, 0, 0, 51, 14, 1, 0, 0, 0, 52, 53, 5, 102,
		0, 0, 53, 54, 5, 97, 0, 0, 54, 55, 5, 108, 0, 0, 55, 56, 5, 115, 0, 0,
		56, 57, 5, 101, 0, 0, 57, 16, 1, 0, 0, 0, 58, 59, 5, 110, 0, 0, 59, 60,
		5, 117, 0, 0, 60, 61, 5, 108, 0, 0, 61, 62, 5, 108, 0, 0, 62, 18, 1, 0,
		0, 0, 63, 68, 5, 34, 0, 0, 64, 67, 3, 21, 10, 0, 65, 67, 8, 0, 0, 0, 66,
		64, 1, 0, 0, 0, 66, 65, 1, 0, 0, 0, 67, 70, 1, 0, 0, 0, 68, 66, 1, 0, 0,
		0, 68, 69, 1, 0, 0, 0, 69, 71, 1, 0, 0, 0, 70, 68, 1, 0, 0, 0, 71, 72,
		5, 34, 0, 0, 72, 20, 1, 0, 0, 0, 73, 76, 5, 92, 0, 0, 74, 77, 7, 1, 0,
		0, 75, 77, 3, 23, 11, 0, 76, 74, 1, 0, 0, 0, 76, 75, 1, 0, 0, 0, 77, 22,
		1, 0, 0, 0, 78, 79, 5, 117, 0, 0, 79, 80, 3, 25, 12, 0, 80, 81, 3, 25,
		12, 0, 81, 82, 3, 25, 12, 0, 82, 83, 3, 25, 12, 0, 83, 24, 1, 0, 0, 0,
		84, 85, 7, 2, 0, 0, 85, 26, 1, 0, 0, 0, 86, 88, 5, 45, 0, 0, 87, 86, 1,
		0, 0, 0, 87, 88, 1, 0, 0, 0, 88, 89, 1, 0, 0, 0, 89, 90, 3, 29, 14, 0,
		90, 91, 5, 46, 0, 0, 91, 93, 3, 29, 14, 0, 92, 94, 3, 31, 15, 0, 93, 92,
		1, 0, 0, 0, 93, 94, 1, 0, 0, 0, 94, 106, 1, 0, 0, 0, 95, 97, 5, 45, 0,
		0, 96, 95, 1, 0, 0, 0, 96, 97, 1, 0, 0, 0, 97, 98, 1, 0, 0, 0, 98, 99,
		3, 29, 14, 0, 99, 100, 3, 31, 15, 0, 100, 106, 1, 0, 0, 0, 101, 103, 5,
		45, 0, 0, 102, 101, 1, 0, 0, 0, 102, 103, 1, 0, 0, 0, 103, 104, 1, 0, 0,
		0, 104, 106, 3, 29, 14, 0, 105, 87, 1, 0, 0, 0, 105, 96, 1, 0, 0, 0, 105,
		102, 1, 0, 0, 0, 106, 28, 1, 0, 0, 0, 107, 116, 5, 48, 0, 0, 108, 112,
		7, 3, 0, 0, 109, 111, 7, 4, 0, 0, 110, 109, 1, 0, 0, 0, 111, 114, 1, 0,
		0, 0, 112, 110, 1, 0, 0, 0, 112, 113, 1, 0, 0, 0, 113, 116, 1, 0, 0, 0,
		114, 112, 1, 0, 0, 0, 115, 107, 1, 0, 0, 0, 115, 108, 1, 0, 0, 0, 116,
		30, 1, 0, 0, 0, 117, 119, 7, 5, 0, 0, 118, 120, 7, 6, 0, 0, 119, 118, 1,
		0, 0, 0, 119, 120, 1, 0, 0, 0, 120, 121, 1, 0, 0, 0, 121, 122, 3, 29, 14,
		0, 122, 32, 1, 0, 0, 0, 123, 125, 7, 7, 0, 0, 124, 123, 1, 0, 0, 0, 125,
		126, 1, 0, 0, 0, 126, 124, 1, 0, 0, 0, 126, 127, 1, 0, 0, 0, 127, 128,
		1, 0, 0, 0, 128, 129, 6, 16, 0, 0, 129, 34, 1, 0, 0, 0, 13, 0, 66, 68,
		76, 87, 93, 96, 102, 105, 112, 115, 119, 126, 1, 6, 0, 0,
	}
	deserializer := antlr.NewATNDeserializer(nil)
	staticData.atn = deserializer.Deserialize(staticData.serializedATN)
	atn := staticData.atn
	staticData.decisionToDFA = make([]*antlr.DFA, len(atn.DecisionToState))
	decisionToDFA := staticData.decisionToDFA
	for index, state := range atn.DecisionToState {
		decisionToDFA[index] = antlr.NewDFA(state, index)
	}
}

// JsonLangLexerInit initializes any static state used to implement JsonLangLexer. By default the
// static state used to implement the lexer is lazily initialized during the first call to
// NewJsonLangLexer(). You can call this function if you wish to initialize the static state ahead
// of time.
func JsonLangLexerInit() {
	staticData := &jsonlanglexerLexerStaticData
	staticData.once.Do(jsonlanglexerLexerInit)
}

// NewJsonLangLexer produces a new lexer instance for the optional input antlr.CharStream.
func NewJsonLangLexer(input antlr.CharStream) *JsonLangLexer {
	JsonLangLexerInit()
	l := new(JsonLangLexer)
	l.BaseLexer = antlr.NewBaseLexer(input)
	staticData := &jsonlanglexerLexerStaticData
	l.Interpreter = antlr.NewLexerATNSimulator(l, staticData.atn, staticData.decisionToDFA, staticData.predictionContextCache)
	l.channelNames = staticData.channelNames
	l.modeNames = staticData.modeNames
	l.RuleNames = staticData.ruleNames
	l.LiteralNames = staticData.literalNames
	l.SymbolicNames = staticData.symbolicNames
	l.GrammarFileName = "JsonLang.txt"
	// TODO: l.EOF = antlr.TokenEOF

	return l
}

// JsonLangLexer tokens.
const (
	JsonLangLexerT__0   = 1
	JsonLangLexerT__1   = 2
	JsonLangLexerT__2   = 3
	JsonLangLexerT__3   = 4
	JsonLangLexerT__4   = 5
	JsonLangLexerT__5   = 6
	JsonLangLexerT__6   = 7
	JsonLangLexerT__7   = 8
	JsonLangLexerT__8   = 9
	JsonLangLexerSTRING = 10
	JsonLangLexerNUMBER = 11
	JsonLangLexerWS     = 12
)
