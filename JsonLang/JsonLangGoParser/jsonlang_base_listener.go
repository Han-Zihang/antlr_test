// Code generated from JsonLang.txt by ANTLR 4.12.0. DO NOT EDIT.

package parser // JsonLang

import "github.com/antlr/antlr4/runtime/Go/antlr/v4"

// BaseJsonLangListener is a complete listener for a parse tree produced by JsonLangParser.
type BaseJsonLangListener struct{}

var _ JsonLangListener = &BaseJsonLangListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseJsonLangListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseJsonLangListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseJsonLangListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseJsonLangListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterJson is called when production json is entered.
func (s *BaseJsonLangListener) EnterJson(ctx *JsonContext) {}

// ExitJson is called when production json is exited.
func (s *BaseJsonLangListener) ExitJson(ctx *JsonContext) {}

// EnterObject is called when production object is entered.
func (s *BaseJsonLangListener) EnterObject(ctx *ObjectContext) {}

// ExitObject is called when production object is exited.
func (s *BaseJsonLangListener) ExitObject(ctx *ObjectContext) {}

// EnterPair is called when production pair is entered.
func (s *BaseJsonLangListener) EnterPair(ctx *PairContext) {}

// ExitPair is called when production pair is exited.
func (s *BaseJsonLangListener) ExitPair(ctx *PairContext) {}

// EnterArray is called when production array is entered.
func (s *BaseJsonLangListener) EnterArray(ctx *ArrayContext) {}

// ExitArray is called when production array is exited.
func (s *BaseJsonLangListener) ExitArray(ctx *ArrayContext) {}

// EnterValue is called when production value is entered.
func (s *BaseJsonLangListener) EnterValue(ctx *ValueContext) {}

// ExitValue is called when production value is exited.
func (s *BaseJsonLangListener) ExitValue(ctx *ValueContext) {}
