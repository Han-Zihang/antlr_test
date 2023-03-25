package parser

import (
	"encoding/json"
	"fmt"
	"github.com/antlr/antlr4/runtime/Go/antlr/v4"
	"testing"
)

func TestJsonLang(t *testing.T) {
	jsonStr := `
	{
        "id": "1111",
        "name": "Tom",
        "city": {
                "coutry": "Chnia",
                "province": "Shanghai",
                "city": "Shanghai" 
        },
        "age": 20,
        "parents":[
                {
                        "id": "00002",
                        "name": "Father"
                },
                {
                        "id": "00003",
                        "name": "Mother"
                }
        ]
}
`

	is := antlr.NewInputStream(jsonStr)
	lexer := NewJsonLangLexer(is)
	stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

	psr := NewJsonLangParser(stream)
	psr.BuildParseTrees = true
	tree := psr.Json()

	listener := &JsonLangListenerImplement{}
	antlr.ParseTreeWalkerDefault.Walk(listener, tree)

	payload := listener.getCurPayload()
	fmt.Println(payload)

	bs, _ := json.Marshal(payload)
	fmt.Println(string(bs))
}
