// Generated from gramatica/Mensagens.g4 by ANTLR 4.13.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MensagensLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEG_ESQ=1, NEG_DIR=2, ITA_ESQ=3, ITA_DIR=4, COR_ESQ=5, COR_DIR=6, STRING=7, 
		CHAR=8, NUM_HEX=9, DIG_HEX=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEG_ESQ", "NEG_DIR", "ITA_ESQ", "ITA_DIR", "COR_ESQ", "COR_DIR", "STRING", 
			"CHAR", "NUM_HEX", "DIG_HEX"
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
			null, "NEG_ESQ", "NEG_DIR", "ITA_ESQ", "ITA_DIR", "COR_ESQ", "COR_DIR", 
			"STRING", "CHAR", "NUM_HEX", "DIG_HEX"
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


	public MensagensLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Mensagens.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\nD\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004\u00065\b"+
		"\u0006\u000b\u0006\f\u00066\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0000\u0000"+
		"\n\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0001\u0000\u0002\u0004\u0000\n\n\r\r"+
		"\"\"[]\u0003\u000009AFafD\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0001\u0015\u0001\u0000\u0000\u0000\u0003\u0019\u0001\u0000"+
		"\u0000\u0000\u0005\u001e\u0001\u0000\u0000\u0000\u0007\"\u0001\u0000\u0000"+
		"\u0000\t\'\u0001\u0000\u0000\u0000\u000b.\u0001\u0000\u0000\u0000\r4\u0001"+
		"\u0000\u0000\u0000\u000f8\u0001\u0000\u0000\u0000\u0011:\u0001\u0000\u0000"+
		"\u0000\u0013B\u0001\u0000\u0000\u0000\u0015\u0016\u0005[\u0000\u0000\u0016"+
		"\u0017\u0005b\u0000\u0000\u0017\u0018\u0005]\u0000\u0000\u0018\u0002\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005[\u0000\u0000\u001a\u001b\u0005/\u0000"+
		"\u0000\u001b\u001c\u0005b\u0000\u0000\u001c\u001d\u0005]\u0000\u0000\u001d"+
		"\u0004\u0001\u0000\u0000\u0000\u001e\u001f\u0005[\u0000\u0000\u001f \u0005"+
		"i\u0000\u0000 !\u0005]\u0000\u0000!\u0006\u0001\u0000\u0000\u0000\"#\u0005"+
		"[\u0000\u0000#$\u0005/\u0000\u0000$%\u0005i\u0000\u0000%&\u0005]\u0000"+
		"\u0000&\b\u0001\u0000\u0000\u0000\'(\u0005[\u0000\u0000()\u0005c\u0000"+
		"\u0000)*\u0005 \u0000\u0000*+\u0001\u0000\u0000\u0000+,\u0003\u0011\b"+
		"\u0000,-\u0005]\u0000\u0000-\n\u0001\u0000\u0000\u0000./\u0005[\u0000"+
		"\u0000/0\u0005/\u0000\u000001\u0005c\u0000\u000012\u0005]\u0000\u0000"+
		"2\f\u0001\u0000\u0000\u000035\u0003\u000f\u0007\u000043\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u00007\u000e\u0001\u0000\u0000\u000089\b\u0000\u0000\u00009\u0010"+
		"\u0001\u0000\u0000\u0000:;\u0005#\u0000\u0000;<\u0003\u0013\t\u0000<="+
		"\u0003\u0013\t\u0000=>\u0003\u0013\t\u0000>?\u0003\u0013\t\u0000?@\u0003"+
		"\u0013\t\u0000@A\u0003\u0013\t\u0000A\u0012\u0001\u0000\u0000\u0000BC"+
		"\u0007\u0001\u0000\u0000C\u0014\u0001\u0000\u0000\u0000\u0002\u00006\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}