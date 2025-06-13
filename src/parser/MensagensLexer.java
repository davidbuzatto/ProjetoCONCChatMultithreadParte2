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
		BOLD_OPEN=1, BOLD_CLOSE=2, ITALIC_OPEN=3, ITALIC_CLOSE=4, COLOR_OPEN=5, 
		COLOR_CLOSE=6, STRING=7, HEX_NUMBER=8, HEX_DIGIT=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BOLD_OPEN", "BOLD_CLOSE", "ITALIC_OPEN", "ITALIC_CLOSE", "COLOR_OPEN", 
			"COLOR_CLOSE", "STRING", "STRING_CHAR", "HEX_NUMBER", "HEX_DIGIT"
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
		"\u0004\u0000\tB\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0004"+
		"\u00066\b\u0006\u000b\u0006\f\u00067\u0001\u0007\u0001\u0007\u0001\b\u0004"+
		"\b=\b\b\u000b\b\f\b>\u0001\t\u0001\t\u0000\u0000\n\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\u0000\u0011"+
		"\b\u0013\t\u0001\u0000\u0002\u0004\u0000\n\n\r\r\"\"[]\u0003\u000009A"+
		"FafB\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0001\u0015\u0001\u0000\u0000\u0000\u0003"+
		"\u0019\u0001\u0000\u0000\u0000\u0005\u001e\u0001\u0000\u0000\u0000\u0007"+
		"\"\u0001\u0000\u0000\u0000\t\'\u0001\u0000\u0000\u0000\u000b/\u0001\u0000"+
		"\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000"+
		"\u0011<\u0001\u0000\u0000\u0000\u0013@\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0005[\u0000\u0000\u0016\u0017\u0005b\u0000\u0000\u0017\u0018\u0005]"+
		"\u0000\u0000\u0018\u0002\u0001\u0000\u0000\u0000\u0019\u001a\u0005[\u0000"+
		"\u0000\u001a\u001b\u0005/\u0000\u0000\u001b\u001c\u0005b\u0000\u0000\u001c"+
		"\u001d\u0005]\u0000\u0000\u001d\u0004\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0005[\u0000\u0000\u001f \u0005i\u0000\u0000 !\u0005]\u0000\u0000!\u0006"+
		"\u0001\u0000\u0000\u0000\"#\u0005[\u0000\u0000#$\u0005/\u0000\u0000$%"+
		"\u0005i\u0000\u0000%&\u0005]\u0000\u0000&\b\u0001\u0000\u0000\u0000\'"+
		"(\u0005[\u0000\u0000()\u0005c\u0000\u0000)*\u0005 \u0000\u0000*+\u0005"+
		"#\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0003\u0011\b\u0000-.\u0005"+
		"]\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005[\u0000\u000001\u0005"+
		"/\u0000\u000012\u0005c\u0000\u000023\u0005]\u0000\u00003\f\u0001\u0000"+
		"\u0000\u000046\u0003\u000f\u0007\u000054\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8\u000e\u0001\u0000\u0000\u00009:\b\u0000\u0000\u0000:\u0010\u0001\u0000"+
		"\u0000\u0000;=\u0003\u0013\t\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0012"+
		"\u0001\u0000\u0000\u0000@A\u0007\u0001\u0000\u0000A\u0014\u0001\u0000"+
		"\u0000\u0000\u0003\u00007>\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}