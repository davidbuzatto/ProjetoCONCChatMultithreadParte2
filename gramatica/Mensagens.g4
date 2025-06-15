/**
 * Gramática da linguagem de mensagens.
 * 
 * Desenvolvido por Prof. Dr. David Buzatto
 */
grammar Mensagens;

// regras do analisador sintático
inicio   : mensagem EOF;

mensagem : NEG_ESQ  mensagem  NEG_DIR   # mensagemNegrito
         | ITA_ESQ  mensagem  ITA_DIR   # mensagemItalico
         | COR_ESQ  mensagem  COR_DIR   # mensagemCor
         | texto    mensagem*           # partes
         ;

texto    : STRING ;

// regras do analisador léxico
NEG_ESQ : '[b]'  ;
NEG_DIR : '[/b]' ;
ITA_ESQ : '[i]'  ;
ITA_DIR : '[/i]' ;
COR_ESQ : '[c ' NUM_HEX ']';
COR_DIR : '[/c]' ;

STRING : CHAR+ ;
CHAR   : ~["\\\r\n\][] ; // qualquer coisa menos ", \, \r, \n, ] e [

NUM_HEX : '#' DIG_HEX DIG_HEX DIG_HEX DIG_HEX DIG_HEX DIG_HEX;
DIG_HEX : [0-9A-Fa-f] ;