// Code generated from JsonLang.txt by ANTLR 4.12.0. DO NOT EDIT.

package parser // JsonLang

import "github.com/antlr/antlr4/runtime/Go/antlr/v4"

// JsonLangListener is a complete listener for a parse tree produced by JsonLangParser.
type JsonLangListener interface {
	antlr.ParseTreeListener

	// EnterJson is called when entering the json production.
	EnterJson(c *JsonContext)

	// EnterObject is called when entering the object production.
	EnterObject(c *ObjectContext)

	// EnterPair is called when entering the pair production.
	EnterPair(c *PairContext)

	// EnterArray is called when entering the array production.
	EnterArray(c *ArrayContext)

	// EnterValue is called when entering the value production.
	EnterValue(c *ValueContext)

	// ExitJson is called when exiting the json production.
	ExitJson(c *JsonContext)

	// ExitObject is called when exiting the object production.
	ExitObject(c *ObjectContext)

	// ExitPair is called when exiting the pair production.
	ExitPair(c *PairContext)

	// ExitArray is called when exiting the array production.
	ExitArray(c *ArrayContext)

	// ExitValue is called when exiting the value production.
	ExitValue(c *ValueContext)
}
