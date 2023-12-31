// Generated from /Users/trobalik/Development/dependency-analysis-android-gradle-plugin/shadowed/antlr/src/main/antlr/com/autonomousapps/internal/grammar/GradleGroovyScriptLexer.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GradleGroovyScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEPENDENCIES=1, FILE=2, FILES=3, TEST_FIXTURES=4, PROJECT=5, BUILDSCRIPT=6,
		BRACE_OPEN=7, BRACE_CLOSE=8, PARENS_OPEN=9, PARENS_CLOSE=10, QUOTE_SINGLE=11,
		QUOTE_DOUBLE=12, EQUALS=13, SEMI=14, BACKSLASH=15, UNICODE_LATIN=16, ID=17,
		NAME=18, DIGIT=19, COMMENT=20, LINE_COMMENT=21, WS=22, IGNORE=23;
	public static final int
		WHITESPACE=2, COMMENTS=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "WHITESPACE", "COMMENTS"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DEPENDENCIES", "FILE", "FILES", "TEST_FIXTURES", "PROJECT", "BUILDSCRIPT",
			"BRACE_OPEN", "BRACE_CLOSE", "PARENS_OPEN", "PARENS_CLOSE", "QUOTE_SINGLE",
			"QUOTE_DOUBLE", "EQUALS", "SEMI", "BACKSLASH", "UNICODE_LATIN", "ID",
			"NAME", "DIGIT", "Letter", "LetterOrDigit", "LetterOrDigitEtc", "COMMENT",
			"LINE_COMMENT", "WS", "IGNORE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'file('", "'files('", "'testFixtures('", "'project'", "'buildscript'",
			"'{'", "'}'", "'('", "')'", "'''", "'\"'", "'='", "';'", "'\\'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEPENDENCIES", "FILE", "FILES", "TEST_FIXTURES", "PROJECT", "BUILDSCRIPT",
			"BRACE_OPEN", "BRACE_CLOSE", "PARENS_OPEN", "PARENS_CLOSE", "QUOTE_SINGLE",
			"QUOTE_DOUBLE", "EQUALS", "SEMI", "BACKSLASH", "UNICODE_LATIN", "ID",
			"NAME", "DIGIT", "COMMENT", "LINE_COMMENT", "WS", "IGNORE"
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


	public GradleGroovyScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GradleGroovyScriptLexer.g4"; }

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
		"\u0004\u0000\u0017\u00d4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000D\b\u0000\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0090\b\u0010\n\u0010\f\u0010\u0093\t\u0010\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0097\b\u0011\n\u0011\f\u0011\u009a\t\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00a2"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u00a6\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u00aa\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u00b0\b\u0016\n\u0016\f\u0016\u00b3\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u00be\b\u0017\n\u0017\f\u0017"+
		"\u00c1\t\u0017\u0001\u0017\u0003\u0017\u00c4\b\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0004\u0018\u00cb\b\u0018\u000b"+
		"\u0018\f\u0018\u00cc\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u00b1\u0000\u001a\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0000)\u0000+\u0000-\u0014/\u00151\u00163\u0017\u0001"+
		"\u0000\b\u0001\u000009\u0005\u0000$$::AZ__az\u0002\u0000\u0000\u007f\u8000"+
		"\ud800\u8000\udbff\u0001\u0000\u8000\ud800\u8000\udbff\u0001\u0000\u8000"+
		"\udc00\u8000\udfff\u0005\u0000$$++-/{{}}\u0002\u0000\n\n\r\r\u0003\u0000"+
		"\t\n\f\r  \u00db\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001"+
		"\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000"+
		"\u0000\u00015\u0001\u0000\u0000\u0000\u0003J\u0001\u0000\u0000\u0000\u0005"+
		"P\u0001\u0000\u0000\u0000\u0007W\u0001\u0000\u0000\u0000\te\u0001\u0000"+
		"\u0000\u0000\u000bm\u0001\u0000\u0000\u0000\ry\u0001\u0000\u0000\u0000"+
		"\u000f{\u0001\u0000\u0000\u0000\u0011}\u0001\u0000\u0000\u0000\u0013\u007f"+
		"\u0001\u0000\u0000\u0000\u0015\u0081\u0001\u0000\u0000\u0000\u0017\u0083"+
		"\u0001\u0000\u0000\u0000\u0019\u0085\u0001\u0000\u0000\u0000\u001b\u0087"+
		"\u0001\u0000\u0000\u0000\u001d\u0089\u0001\u0000\u0000\u0000\u001f\u008b"+
		"\u0001\u0000\u0000\u0000!\u008d\u0001\u0000\u0000\u0000#\u0094\u0001\u0000"+
		"\u0000\u0000%\u009b\u0001\u0000\u0000\u0000\'\u00a1\u0001\u0000\u0000"+
		"\u0000)\u00a5\u0001\u0000\u0000\u0000+\u00a9\u0001\u0000\u0000\u0000-"+
		"\u00ab\u0001\u0000\u0000\u0000/\u00b9\u0001\u0000\u0000\u00001\u00ca\u0001"+
		"\u0000\u0000\u00003\u00d0\u0001\u0000\u0000\u000056\u0005d\u0000\u0000"+
		"67\u0005e\u0000\u000078\u0005p\u0000\u000089\u0005e\u0000\u00009:\u0005"+
		"n\u0000\u0000:;\u0005d\u0000\u0000;<\u0005e\u0000\u0000<=\u0005n\u0000"+
		"\u0000=>\u0005c\u0000\u0000>?\u0005i\u0000\u0000?@\u0005e\u0000\u0000"+
		"@A\u0005s\u0000\u0000AE\u0001\u0000\u0000\u0000BD\u00031\u0018\u0000C"+
		"B\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000HI\u0003\r\u0006\u0000I\u0002\u0001\u0000\u0000\u0000JK\u0005"+
		"f\u0000\u0000KL\u0005i\u0000\u0000LM\u0005l\u0000\u0000MN\u0005e\u0000"+
		"\u0000NO\u0005(\u0000\u0000O\u0004\u0001\u0000\u0000\u0000PQ\u0005f\u0000"+
		"\u0000QR\u0005i\u0000\u0000RS\u0005l\u0000\u0000ST\u0005e\u0000\u0000"+
		"TU\u0005s\u0000\u0000UV\u0005(\u0000\u0000V\u0006\u0001\u0000\u0000\u0000"+
		"WX\u0005t\u0000\u0000XY\u0005e\u0000\u0000YZ\u0005s\u0000\u0000Z[\u0005"+
		"t\u0000\u0000[\\\u0005F\u0000\u0000\\]\u0005i\u0000\u0000]^\u0005x\u0000"+
		"\u0000^_\u0005t\u0000\u0000_`\u0005u\u0000\u0000`a\u0005r\u0000\u0000"+
		"ab\u0005e\u0000\u0000bc\u0005s\u0000\u0000cd\u0005(\u0000\u0000d\b\u0001"+
		"\u0000\u0000\u0000ef\u0005p\u0000\u0000fg\u0005r\u0000\u0000gh\u0005o"+
		"\u0000\u0000hi\u0005j\u0000\u0000ij\u0005e\u0000\u0000jk\u0005c\u0000"+
		"\u0000kl\u0005t\u0000\u0000l\n\u0001\u0000\u0000\u0000mn\u0005b\u0000"+
		"\u0000no\u0005u\u0000\u0000op\u0005i\u0000\u0000pq\u0005l\u0000\u0000"+
		"qr\u0005d\u0000\u0000rs\u0005s\u0000\u0000st\u0005c\u0000\u0000tu\u0005"+
		"r\u0000\u0000uv\u0005i\u0000\u0000vw\u0005p\u0000\u0000wx\u0005t\u0000"+
		"\u0000x\f\u0001\u0000\u0000\u0000yz\u0005{\u0000\u0000z\u000e\u0001\u0000"+
		"\u0000\u0000{|\u0005}\u0000\u0000|\u0010\u0001\u0000\u0000\u0000}~\u0005"+
		"(\u0000\u0000~\u0012\u0001\u0000\u0000\u0000\u007f\u0080\u0005)\u0000"+
		"\u0000\u0080\u0014\u0001\u0000\u0000\u0000\u0081\u0082\u0005\'\u0000\u0000"+
		"\u0082\u0016\u0001\u0000\u0000\u0000\u0083\u0084\u0005\"\u0000\u0000\u0084"+
		"\u0018\u0001\u0000\u0000\u0000\u0085\u0086\u0005=\u0000\u0000\u0086\u001a"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005;\u0000\u0000\u0088\u001c\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0005\\\u0000\u0000\u008a\u001e\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0002!~\u0000\u008c \u0001\u0000\u0000\u0000"+
		"\u008d\u0091\u0003\'\u0013\u0000\u008e\u0090\u0003+\u0015\u0000\u008f"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091"+
		"\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092"+
		"\"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0098"+
		"\u0003\'\u0013\u0000\u0095\u0097\u0003)\u0014\u0000\u0096\u0095\u0001"+
		"\u0000\u0000\u0000\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099$\u0001\u0000"+
		"\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0000"+
		"\u0000\u0000\u009c&\u0001\u0000\u0000\u0000\u009d\u00a2\u0007\u0001\u0000"+
		"\u0000\u009e\u00a2\b\u0002\u0000\u0000\u009f\u00a0\u0007\u0003\u0000\u0000"+
		"\u00a0\u00a2\u0007\u0004\u0000\u0000\u00a1\u009d\u0001\u0000\u0000\u0000"+
		"\u00a1\u009e\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2(\u0001\u0000\u0000\u0000\u00a3\u00a6\u0003\'\u0013\u0000\u00a4"+
		"\u00a6\u0007\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6*\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0003)\u0014\u0000\u00a8\u00aa\u0007\u0005\u0000\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa,\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005/\u0000\u0000\u00ac\u00ad\u0005*\u0000\u0000"+
		"\u00ad\u00b1\u0001\u0000\u0000\u0000\u00ae\u00b0\t\u0000\u0000\u0000\u00af"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b5\u0005*\u0000\u0000\u00b5\u00b6\u0005/\u0000\u0000\u00b6\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0006\u0016\u0000\u0000\u00b8.\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005/\u0000\u0000\u00ba\u00bb\u0005/\u0000\u0000"+
		"\u00bb\u00bf\u0001\u0000\u0000\u0000\u00bc\u00be\b\u0006\u0000\u0000\u00bd"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c4\u0005\r\u0000\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0005\n\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0006"+
		"\u0017\u0000\u0000\u00c80\u0001\u0000\u0000\u0000\u00c9\u00cb\u0007\u0007"+
		"\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cf\u0006\u0018"+
		"\u0001\u0000\u00cf2\u0001\u0000\u0000\u0000\u00d0\u00d1\t\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0006\u0019\u0002"+
		"\u0000\u00d34\u0001\u0000\u0000\u0000\u000b\u0000E\u0091\u0098\u00a1\u00a5"+
		"\u00a9\u00b1\u00bf\u00c3\u00cc\u0003\u0000\u0003\u0000\u0000\u0002\u0000"+
		"\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
