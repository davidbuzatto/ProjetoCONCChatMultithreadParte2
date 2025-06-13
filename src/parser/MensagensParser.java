// Generated from gramatica/Mensagens.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MensagensParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOLD_OPEN=1, BOLD_CLOSE=2, ITALIC_OPEN=3, ITALIC_CLOSE=4, COLOR_OPEN=5, 
		COLOR_CLOSE=6, STRING=7, HEX_NUMBER=8, HEX_DIGIT=9;
	public static final int
		RULE_inicio = 0, RULE_mensagem = 1, RULE_texto = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "mensagem", "texto"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'[b]'", "'[/b]'", "'[i]'", "'[/i]'", null, "'[/c]'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOLD_OPEN", "BOLD_CLOSE", "ITALIC_OPEN", "ITALIC_CLOSE", "COLOR_OPEN", 
			"COLOR_CLOSE", "STRING", "HEX_NUMBER", "HEX_DIGIT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Mensagens.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MensagensParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public MensagemContext mensagem() {
			return getRuleContext(MensagemContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MensagensParser.EOF, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MensagensVisitor ) return ((MensagensVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			mensagem();
			setState(7);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MensagemContext extends ParserRuleContext {
		public MensagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mensagem; }
	 
		public MensagemContext() { }
		public void copyFrom(MensagemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MensagemCorContext extends MensagemContext {
		public TerminalNode COLOR_OPEN() { return getToken(MensagensParser.COLOR_OPEN, 0); }
		public MensagemContext mensagem() {
			return getRuleContext(MensagemContext.class,0);
		}
		public TerminalNode COLOR_CLOSE() { return getToken(MensagensParser.COLOR_CLOSE, 0); }
		public MensagemCorContext(MensagemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).enterMensagemCor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).exitMensagemCor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MensagensVisitor ) return ((MensagensVisitor<? extends T>)visitor).visitMensagemCor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MensagemItalicoContext extends MensagemContext {
		public TerminalNode ITALIC_OPEN() { return getToken(MensagensParser.ITALIC_OPEN, 0); }
		public MensagemContext mensagem() {
			return getRuleContext(MensagemContext.class,0);
		}
		public TerminalNode ITALIC_CLOSE() { return getToken(MensagensParser.ITALIC_CLOSE, 0); }
		public MensagemItalicoContext(MensagemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).enterMensagemItalico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).exitMensagemItalico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MensagensVisitor ) return ((MensagensVisitor<? extends T>)visitor).visitMensagemItalico(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PartesContext extends MensagemContext {
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public List<MensagemContext> mensagem() {
			return getRuleContexts(MensagemContext.class);
		}
		public MensagemContext mensagem(int i) {
			return getRuleContext(MensagemContext.class,i);
		}
		public PartesContext(MensagemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).enterPartes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).exitPartes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MensagensVisitor ) return ((MensagensVisitor<? extends T>)visitor).visitPartes(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MensagemNegritoContext extends MensagemContext {
		public TerminalNode BOLD_OPEN() { return getToken(MensagensParser.BOLD_OPEN, 0); }
		public MensagemContext mensagem() {
			return getRuleContext(MensagemContext.class,0);
		}
		public TerminalNode BOLD_CLOSE() { return getToken(MensagensParser.BOLD_CLOSE, 0); }
		public MensagemNegritoContext(MensagemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).enterMensagemNegrito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).exitMensagemNegrito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MensagensVisitor ) return ((MensagensVisitor<? extends T>)visitor).visitMensagemNegrito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MensagemContext mensagem() throws RecognitionException {
		MensagemContext _localctx = new MensagemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mensagem);
		try {
			int _alt;
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOLD_OPEN:
				_localctx = new MensagemNegritoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				match(BOLD_OPEN);
				setState(10);
				mensagem();
				setState(11);
				match(BOLD_CLOSE);
				}
				break;
			case ITALIC_OPEN:
				_localctx = new MensagemItalicoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(13);
				match(ITALIC_OPEN);
				setState(14);
				mensagem();
				setState(15);
				match(ITALIC_CLOSE);
				}
				break;
			case COLOR_OPEN:
				_localctx = new MensagemCorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				match(COLOR_OPEN);
				setState(18);
				mensagem();
				setState(19);
				match(COLOR_CLOSE);
				}
				break;
			case STRING:
				_localctx = new PartesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(21);
				texto();
				setState(25);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(22);
						mensagem();
						}
						} 
					}
					setState(27);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MensagensParser.STRING, 0); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MensagensListener ) ((MensagensListener)listener).exitTexto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MensagensVisitor ) return ((MensagensVisitor<? extends T>)visitor).visitTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\t!\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0000\u0000\u0003\u0000"+
		"\u0002\u0004\u0000\u0000!\u0000\u0006\u0001\u0000\u0000\u0000\u0002\u001c"+
		"\u0001\u0000\u0000\u0000\u0004\u001e\u0001\u0000\u0000\u0000\u0006\u0007"+
		"\u0003\u0002\u0001\u0000\u0007\b\u0005\u0000\u0000\u0001\b\u0001\u0001"+
		"\u0000\u0000\u0000\t\n\u0005\u0001\u0000\u0000\n\u000b\u0003\u0002\u0001"+
		"\u0000\u000b\f\u0005\u0002\u0000\u0000\f\u001d\u0001\u0000\u0000\u0000"+
		"\r\u000e\u0005\u0003\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f"+
		"\u0010\u0005\u0004\u0000\u0000\u0010\u001d\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005\u0005\u0000\u0000\u0012\u0013\u0003\u0002\u0001\u0000\u0013"+
		"\u0014\u0005\u0006\u0000\u0000\u0014\u001d\u0001\u0000\u0000\u0000\u0015"+
		"\u0019\u0003\u0004\u0002\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c"+
		"\t\u0001\u0000\u0000\u0000\u001c\r\u0001\u0000\u0000\u0000\u001c\u0011"+
		"\u0001\u0000\u0000\u0000\u001c\u0015\u0001\u0000\u0000\u0000\u001d\u0003"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0007\u0000\u0000\u001f\u0005"+
		"\u0001\u0000\u0000\u0000\u0002\u0019\u001c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}