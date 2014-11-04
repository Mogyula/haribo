grammar Waipr;

options {
	output=AST;
	ASTLabelType=CommonTree;
}

tokens{
	TEST;
}

@header {
	package waiprprog;
}

prog:   machine+;

machine : 'Machine' ID '{' block* '}' -> ^(ID block*);

block	: 'Statuses' '{' statdefs*  '}' -> ^('Statuses' statdefs*)
	| 'Triggers' '{' triggers* '}' -> ^('Triggers' triggers*)
	| ('Behaviors' | 'Behaviours') '{' behaviordef* '}' -> ^('Behaviors' behaviordef*) //USA-UK
	| 'Handlers' '{' handler* '}' -> ^('Handlers' handler*)
	;

handler	: ID '(' triggersource ')' '{' statement* '}' -> ^(ID triggersource statement*);


triggersource
	: sender '.' trigger -> ^(sender trigger);
	
sender : ID;
	
trigger	: sh=ID -> TEST[$sh];

statdefs: statdef (',' statdef)* ';' -> statdef*;

triggers: trigger (',' trigger)* ';' -> trigger*;

statdef	: ID;

behaviordef: ID '(' stats* ')' '{' statement* '}' -> ^(ID stats* statement*);

stats	:(stat (',' stat)*) -> stat*;

stat	: globalstat
	| localstat;

globalstat : '!' ID -> ^(ID '!');

localstat 
	: ID -> ID;

statement
	: behavior ';'!;
	
behavior: ID^ '('! invals ')'! ;

invals	: inval (',' inval)* -> inval*;

inval	: (ID | NUMBER | TEXT);

// START:tokens	
ID  : ('a'..'z'|'A'..'Z')+ ;
IE  :	';' ;
NUMBER :   ('0'..'9')+ ('.' ('0'..'9')+)? ;
WS : (('//' .+ ('\r'? '\n'))|' '| '\t'| '\n'| '\r')+ {skip();} ;
TEXT
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;

// END:tokens
