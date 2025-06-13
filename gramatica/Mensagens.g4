/**
 * Gramática da linguagem de mensagens.
 * 
 * Desenvolvido por Prof. Dr. David Buzatto
 */
grammar Mensagens;

// regras do parser
inicio    : mensagem EOF;

mensagem  : BOLD_OPEN mensagem BOLD_CLOSE       # mensagemNegrito
          | ITALIC_OPEN mensagem ITALIC_CLOSE   # mensagemItalico
          | COLOR_OPEN mensagem COLOR_CLOSE     # mensagemCor
          | texto mensagem*                     # partes
          ;

texto     : STRING ;

// regras do lexer
BOLD_OPEN    : '[b]'  ;
BOLD_CLOSE   : '[/b]' ;
ITALIC_OPEN  : '[i]'  ;
ITALIC_CLOSE : '[/i]' ;
COLOR_OPEN   : '[c #' HEX_NUMBER ']';
COLOR_CLOSE  : '[/c]' ;

STRING : STRING_CHAR+ ;
fragment STRING_CHAR : ~["\\\r\n\][] ; // fragmentos não entram na estrutura da árvore

HEX_NUMBER : HEX_DIGIT+ ;
HEX_DIGIT  : [0-9A-Fa-f] ;

// ignore espaço em branco
//WS  : [ \t\r\n]+ -> skip ;