grammar JsonLang;

json	:	object
	|	array
	;

object	:	'{' pair ( ',' pair ) * '}'
	|	'{' '}'
	;

pair	:	STRING ':' value
	;

array	:	'[' value ( ',' value )* ']'
	|	'[' ']'
	;

value	:	STRING
	|	NUMBER
	|	object
	|	array
	|	'true'
	|	'false'
	|	'null'
	;

STRING	:	'"'	( ESC | ~["\\])* '"'	;

fragment ESC	:	'\\' (["\\/bfnrt] | UNICODE )	;
fragment UNICODE	:	'u'	HEX HEX HEX HEX	;
fragment HEX	:	[0-9a-fA-F]	;

NUMBER	:	'-' ? INT '.' INT EXP ?		// 1.35, 1.35E9, 0.3, -4.5
	|	'-' ? INT EXP			// 1e10, -3e4
	|	'-' ? INT			// -3, 45
	;

fragment INT	:	'0' | [1-9] [0-9]*	;	// 除 0 以外的数字不允许以 0 结尾
fragment EXP	: 	[Ee] [+\-] ? INT;		// \- 是对 - 的转义

WS	:	[ \t\n\r]+ -> skip	;



