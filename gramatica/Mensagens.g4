/**
 * Gramática da linguagem de mensagens.
 * 
 * Desenvolvido por Prof. Dr. David Buzatto
 */
grammar Mensagens;

// regras do analisador sintático
inicio   : mensagem EOF;

mensagem : NEG_ESQ mensagem NEG_CLOSE # mensagemNegrito
         | ITA_ESQ mensagem ITA_CLOSE # mensagemItalico
         | COR_ESQ mensagem COR_CLOSE # mensagemCor
         | texto mensagem*            # partes
         ;

texto    : STRING ;

// regras do analisador léxico
NEG_ESQ   : '[b]'  ;
NEG_CLOSE : '[/b]' ;
ITA_ESQ   : '[i]'  ;
ITA_CLOSE : '[/i]' ;
COR_ESQ   : '[c ' NUM_HEX ']';
COR_CLOSE : '[/c]' ;

STRING : CHAR+ ;
CHAR   : ~["\\\r\n\][] ; // qualquer coisa menos ", \, \r, \n, ] e [

NUM_HEX : '#' DIG_HEX DIG_HEX DIG_HEX DIG_HEX DIG_HEX DIG_HEX;
DIG_HEX : [0-9A-Fa-f] ;