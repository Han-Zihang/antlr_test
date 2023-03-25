// Generated from grulev3 by ANTLR 4.12.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class grulev3Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PLUS=2, MINUS=3, DIV=4, MUL=5, MOD=6, DOT=7, SEMICOLON=8, LR_BRACE=9, 
		RR_BRACE=10, LR_BRACKET=11, RR_BRACKET=12, LS_BRACKET=13, RS_BRACKET=14, 
		RULE=15, WHEN=16, THEN=17, AND=18, OR=19, TRUE=20, FALSE=21, NIL_LITERAL=22, 
		NEGATION=23, SALIENCE=24, EQUALS=25, ASSIGN=26, PLUS_ASIGN=27, MINUS_ASIGN=28, 
		DIV_ASIGN=29, MUL_ASIGN=30, GT=31, LT=32, GTE=33, LTE=34, NOTEQUALS=35, 
		BITAND=36, BITOR=37, SIMPLENAME=38, DQUOTA_STRING=39, SQUOTA_STRING=40, 
		DECIMAL_FLOAT_LIT=41, DECIMAL_EXPONENT=42, HEX_FLOAT_LIT=43, HEX_EXPONENT=44, 
		DEC_LIT=45, HEX_LIT=46, OCT_LIT=47, SPACE=48, COMMENT=49, LINE_COMMENT=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
			"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "ISC", 
			"IC", "PLUS", "MINUS", "DIV", "MUL", "MOD", "DOT", "SEMICOLON", "LR_BRACE", 
			"RR_BRACE", "LR_BRACKET", "RR_BRACKET", "LS_BRACKET", "RS_BRACKET", "RULE", 
			"WHEN", "THEN", "AND", "OR", "TRUE", "FALSE", "NIL_LITERAL", "NEGATION", 
			"SALIENCE", "EQUALS", "ASSIGN", "PLUS_ASIGN", "MINUS_ASIGN", "DIV_ASIGN", 
			"MUL_ASIGN", "GT", "LT", "GTE", "LTE", "NOTEQUALS", "BITAND", "BITOR", 
			"SIMPLENAME", "DQUOTA_STRING", "SQUOTA_STRING", "DECIMAL_FLOAT_LIT", 
			"DECIMAL_EXPONENT", "HEX_FLOAT_LIT", "HEX_MANTISA", "HEX_EXPONENT", "DEC_LIT", 
			"HEX_LIT", "OCT_LIT", "HEX_DIGITS", "DEC_DIGITS", "OCT_DIGITS", "DEC_DIGIT", 
			"OCT_DIGIT", "HEX_DIGIT", "SPACE", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'+'", "'-'", "'/'", "'*'", "'%'", "'.'", "';'", "'{'", 
			"'}'", "'('", "')'", "'['", "']'", null, null, null, "'&&'", "'||'", 
			null, null, null, "'!'", null, "'=='", "'='", "'+='", "'-='", "'/='", 
			"'*='", "'>'", "'<'", "'>='", "'<='", "'!='", "'&'", "'|'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "PLUS", "MINUS", "DIV", "MUL", "MOD", "DOT", "SEMICOLON", 
			"LR_BRACE", "RR_BRACE", "LR_BRACKET", "RR_BRACKET", "LS_BRACKET", "RS_BRACKET", 
			"RULE", "WHEN", "THEN", "AND", "OR", "TRUE", "FALSE", "NIL_LITERAL", 
			"NEGATION", "SALIENCE", "EQUALS", "ASSIGN", "PLUS_ASIGN", "MINUS_ASIGN", 
			"DIV_ASIGN", "MUL_ASIGN", "GT", "LT", "GTE", "LTE", "NOTEQUALS", "BITAND", 
			"BITOR", "SIMPLENAME", "DQUOTA_STRING", "SQUOTA_STRING", "DECIMAL_FLOAT_LIT", 
			"DECIMAL_EXPONENT", "HEX_FLOAT_LIT", "HEX_EXPONENT", "DEC_LIT", "HEX_LIT", 
			"OCT_LIT", "SPACE", "COMMENT", "LINE_COMMENT"
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


	public grulev3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grulev3"; }

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
		"\u0004\u00002\u01e4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007"+
		"N\u0002O\u0007O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007"+
		"S\u0002T\u0007T\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u00e6\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!"+
		"\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"1\u00011\u00011\u00011\u00012\u00012\u00013\u00013\u00013\u00013\u0001"+
		"3\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u00015\u00015\u0001"+
		"6\u00016\u00016\u00017\u00017\u00017\u00018\u00018\u00018\u00019\u0001"+
		"9\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001<\u0001=\u0001"+
		"=\u0001=\u0001>\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001"+
		"A\u0005A\u0155\bA\nA\fA\u0158\tA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001"+
		"B\u0005B\u0160\bB\nB\fB\u0163\tB\u0001B\u0001B\u0001C\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0005C\u016d\bC\nC\fC\u0170\tC\u0001C\u0001C\u0001D\u0001"+
		"D\u0001D\u0001D\u0003D\u0178\bD\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0003D\u0180\bD\u0003D\u0182\bD\u0001E\u0001E\u0001E\u0003E\u0187\b"+
		"E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001"+
		"G\u0003G\u0193\bG\u0001G\u0001G\u0001G\u0001G\u0003G\u0199\bG\u0001H\u0001"+
		"H\u0001H\u0003H\u019e\bH\u0001H\u0001H\u0001I\u0001I\u0001I\u0003I\u01a5"+
		"\bI\u0003I\u01a7\bI\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001"+
		"L\u0004L\u01b1\bL\u000bL\fL\u01b2\u0001M\u0004M\u01b6\bM\u000bM\fM\u01b7"+
		"\u0001N\u0004N\u01bb\bN\u000bN\fN\u01bc\u0001O\u0001O\u0001P\u0001P\u0001"+
		"Q\u0001Q\u0001R\u0004R\u01c6\bR\u000bR\fR\u01c7\u0001R\u0001R\u0001S\u0001"+
		"S\u0001S\u0001S\u0005S\u01d0\bS\nS\fS\u01d3\tS\u0001S\u0001S\u0001S\u0001"+
		"S\u0001S\u0001T\u0001T\u0001T\u0001T\u0005T\u01de\bT\nT\fT\u01e1\tT\u0001"+
		"T\u0001T\u0001\u01d1\u0000U\u0001\u0001\u0003\u0000\u0005\u0000\u0007"+
		"\u0000\t\u0000\u000b\u0000\r\u0000\u000f\u0000\u0011\u0000\u0013\u0000"+
		"\u0015\u0000\u0017\u0000\u0019\u0000\u001b\u0000\u001d\u0000\u001f\u0000"+
		"!\u0000#\u0000%\u0000\'\u0000)\u0000+\u0000-\u0000/\u00001\u00003\u0000"+
		"5\u00007\u00009\u0000;\u0002=\u0003?\u0004A\u0005C\u0006E\u0007G\bI\t"+
		"K\nM\u000bO\fQ\rS\u000eU\u000fW\u0010Y\u0011[\u0012]\u0013_\u0014a\u0015"+
		"c\u0016e\u0017g\u0018i\u0019k\u001am\u001bo\u001cq\u001ds\u001eu\u001f"+
		"w y!{\"}#\u007f$\u0081%\u0083&\u0085\'\u0087(\u0089)\u008b*\u008d+\u008f"+
		"\u0000\u0091,\u0093-\u0095.\u0097/\u0099\u0000\u009b\u0000\u009d\u0000"+
		"\u009f\u0000\u00a1\u0000\u00a3\u0000\u00a50\u00a71\u00a92\u0001\u0000"+
		"$\u0002\u0000AAaa\u0002\u0000BBbb\u0002\u0000CCcc\u0002\u0000DDdd\u0002"+
		"\u0000EEee\u0002\u0000FFff\u0002\u0000GGgg\u0002\u0000HHhh\u0002\u0000"+
		"IIii\u0002\u0000JJjj\u0002\u0000KKkk\u0002\u0000LLll\u0002\u0000MMmm\u0002"+
		"\u0000NNnn\u0002\u0000OOoo\u0002\u0000PPpp\u0002\u0000QQqq\u0002\u0000"+
		"RRrr\u0002\u0000SSss\u0002\u0000TTtt\u0002\u0000UUuu\u0002\u0000VVvv\u0002"+
		"\u0000WWww\u0002\u0000XXxx\u0002\u0000YYyy\u0002\u0000ZZzz\r\u0000AZa"+
		"z\u00c0\u00d6\u00d8\u00f6\u00f8\u02ff\u0370\u037d\u037f\u1fff\u200c\u200d"+
		"\u2070\u218f\u2c00\u2fef\u3001\u8000\ud7ff\u8000\uf900\u8000\ufdcf\u8000"+
		"\ufdf0\u8000\ufffd\u0005\u000009__\u00b7\u00b7\u0300\u036f\u203f\u2040"+
		"\u0002\u0000\"\"\\\\\u0002\u0000\'\'\\\\\u0001\u000019\u0001\u000009\u0001"+
		"\u000007\u0003\u000009AFaf\u0003\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u01db"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000"+
		"=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001"+
		"\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000"+
		"\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000"+
		"K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001"+
		"\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000"+
		"\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000"+
		"Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001"+
		"\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000"+
		"\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0000"+
		"g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000k\u0001"+
		"\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001\u0000\u0000"+
		"\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000\u0000\u0000"+
		"u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000y\u0001"+
		"\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001\u0000\u0000"+
		"\u0000\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001\u0000\u0000"+
		"\u0000\u0000\u0083\u0001\u0000\u0000\u0000\u0000\u0085\u0001\u0000\u0000"+
		"\u0000\u0000\u0087\u0001\u0000\u0000\u0000\u0000\u0089\u0001\u0000\u0000"+
		"\u0000\u0000\u008b\u0001\u0000\u0000\u0000\u0000\u008d\u0001\u0000\u0000"+
		"\u0000\u0000\u0091\u0001\u0000\u0000\u0000\u0000\u0093\u0001\u0000\u0000"+
		"\u0000\u0000\u0095\u0001\u0000\u0000\u0000\u0000\u0097\u0001\u0000\u0000"+
		"\u0000\u0000\u00a5\u0001\u0000\u0000\u0000\u0000\u00a7\u0001\u0000\u0000"+
		"\u0000\u0000\u00a9\u0001\u0000\u0000\u0000\u0001\u00ab\u0001\u0000\u0000"+
		"\u0000\u0003\u00ad\u0001\u0000\u0000\u0000\u0005\u00af\u0001\u0000\u0000"+
		"\u0000\u0007\u00b1\u0001\u0000\u0000\u0000\t\u00b3\u0001\u0000\u0000\u0000"+
		"\u000b\u00b5\u0001\u0000\u0000\u0000\r\u00b7\u0001\u0000\u0000\u0000\u000f"+
		"\u00b9\u0001\u0000\u0000\u0000\u0011\u00bb\u0001\u0000\u0000\u0000\u0013"+
		"\u00bd\u0001\u0000\u0000\u0000\u0015\u00bf\u0001\u0000\u0000\u0000\u0017"+
		"\u00c1\u0001\u0000\u0000\u0000\u0019\u00c3\u0001\u0000\u0000\u0000\u001b"+
		"\u00c5\u0001\u0000\u0000\u0000\u001d\u00c7\u0001\u0000\u0000\u0000\u001f"+
		"\u00c9\u0001\u0000\u0000\u0000!\u00cb\u0001\u0000\u0000\u0000#\u00cd\u0001"+
		"\u0000\u0000\u0000%\u00cf\u0001\u0000\u0000\u0000\'\u00d1\u0001\u0000"+
		"\u0000\u0000)\u00d3\u0001\u0000\u0000\u0000+\u00d5\u0001\u0000\u0000\u0000"+
		"-\u00d7\u0001\u0000\u0000\u0000/\u00d9\u0001\u0000\u0000\u00001\u00db"+
		"\u0001\u0000\u0000\u00003\u00dd\u0001\u0000\u0000\u00005\u00df\u0001\u0000"+
		"\u0000\u00007\u00e1\u0001\u0000\u0000\u00009\u00e5\u0001\u0000\u0000\u0000"+
		";\u00e7\u0001\u0000\u0000\u0000=\u00e9\u0001\u0000\u0000\u0000?\u00eb"+
		"\u0001\u0000\u0000\u0000A\u00ed\u0001\u0000\u0000\u0000C\u00ef\u0001\u0000"+
		"\u0000\u0000E\u00f1\u0001\u0000\u0000\u0000G\u00f3\u0001\u0000\u0000\u0000"+
		"I\u00f5\u0001\u0000\u0000\u0000K\u00f7\u0001\u0000\u0000\u0000M\u00f9"+
		"\u0001\u0000\u0000\u0000O\u00fb\u0001\u0000\u0000\u0000Q\u00fd\u0001\u0000"+
		"\u0000\u0000S\u00ff\u0001\u0000\u0000\u0000U\u0101\u0001\u0000\u0000\u0000"+
		"W\u0106\u0001\u0000\u0000\u0000Y\u010b\u0001\u0000\u0000\u0000[\u0110"+
		"\u0001\u0000\u0000\u0000]\u0113\u0001\u0000\u0000\u0000_\u0116\u0001\u0000"+
		"\u0000\u0000a\u011b\u0001\u0000\u0000\u0000c\u0121\u0001\u0000\u0000\u0000"+
		"e\u0125\u0001\u0000\u0000\u0000g\u0127\u0001\u0000\u0000\u0000i\u0130"+
		"\u0001\u0000\u0000\u0000k\u0133\u0001\u0000\u0000\u0000m\u0135\u0001\u0000"+
		"\u0000\u0000o\u0138\u0001\u0000\u0000\u0000q\u013b\u0001\u0000\u0000\u0000"+
		"s\u013e\u0001\u0000\u0000\u0000u\u0141\u0001\u0000\u0000\u0000w\u0143"+
		"\u0001\u0000\u0000\u0000y\u0145\u0001\u0000\u0000\u0000{\u0148\u0001\u0000"+
		"\u0000\u0000}\u014b\u0001\u0000\u0000\u0000\u007f\u014e\u0001\u0000\u0000"+
		"\u0000\u0081\u0150\u0001\u0000\u0000\u0000\u0083\u0152\u0001\u0000\u0000"+
		"\u0000\u0085\u0159\u0001\u0000\u0000\u0000\u0087\u0166\u0001\u0000\u0000"+
		"\u0000\u0089\u0181\u0001\u0000\u0000\u0000\u008b\u0183\u0001\u0000\u0000"+
		"\u0000\u008d\u018a\u0001\u0000\u0000\u0000\u008f\u0198\u0001\u0000\u0000"+
		"\u0000\u0091\u019a\u0001\u0000\u0000\u0000\u0093\u01a6\u0001\u0000\u0000"+
		"\u0000\u0095\u01a8\u0001\u0000\u0000\u0000\u0097\u01ac\u0001\u0000\u0000"+
		"\u0000\u0099\u01b0\u0001\u0000\u0000\u0000\u009b\u01b5\u0001\u0000\u0000"+
		"\u0000\u009d\u01ba\u0001\u0000\u0000\u0000\u009f\u01be\u0001\u0000\u0000"+
		"\u0000\u00a1\u01c0\u0001\u0000\u0000\u0000\u00a3\u01c2\u0001\u0000\u0000"+
		"\u0000\u00a5\u01c5\u0001\u0000\u0000\u0000\u00a7\u01cb\u0001\u0000\u0000"+
		"\u0000\u00a9\u01d9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005,\u0000\u0000"+
		"\u00ac\u0002\u0001\u0000\u0000\u0000\u00ad\u00ae\u0007\u0000\u0000\u0000"+
		"\u00ae\u0004\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0001\u0000\u0000"+
		"\u00b0\u0006\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0002\u0000\u0000"+
		"\u00b2\b\u0001\u0000\u0000\u0000\u00b3\u00b4\u0007\u0003\u0000\u0000\u00b4"+
		"\n\u0001\u0000\u0000\u0000\u00b5\u00b6\u0007\u0004\u0000\u0000\u00b6\f"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\u0005\u0000\u0000\u00b8\u000e"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007\u0006\u0000\u0000\u00ba\u0010"+
		"\u0001\u0000\u0000\u0000\u00bb\u00bc\u0007\u0007\u0000\u0000\u00bc\u0012"+
		"\u0001\u0000\u0000\u0000\u00bd\u00be\u0007\b\u0000\u0000\u00be\u0014\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0007\t\u0000\u0000\u00c0\u0016\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0007\n\u0000\u0000\u00c2\u0018\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0007\u000b\u0000\u0000\u00c4\u001a\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0007\f\u0000\u0000\u00c6\u001c\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0007\r\u0000\u0000\u00c8\u001e\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0007\u000e\u0000\u0000\u00ca \u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0007\u000f\u0000\u0000\u00cc\"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0007"+
		"\u0010\u0000\u0000\u00ce$\u0001\u0000\u0000\u0000\u00cf\u00d0\u0007\u0011"+
		"\u0000\u0000\u00d0&\u0001\u0000\u0000\u0000\u00d1\u00d2\u0007\u0012\u0000"+
		"\u0000\u00d2(\u0001\u0000\u0000\u0000\u00d3\u00d4\u0007\u0013\u0000\u0000"+
		"\u00d4*\u0001\u0000\u0000\u0000\u00d5\u00d6\u0007\u0014\u0000\u0000\u00d6"+
		",\u0001\u0000\u0000\u0000\u00d7\u00d8\u0007\u0015\u0000\u0000\u00d8.\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0007\u0016\u0000\u0000\u00da0\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0007\u0017\u0000\u0000\u00dc2\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0007\u0018\u0000\u0000\u00de4\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0007\u0019\u0000\u0000\u00e06\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0007\u001a\u0000\u0000\u00e28\u0001\u0000\u0000\u0000\u00e3\u00e6"+
		"\u00037\u001b\u0000\u00e4\u00e6\u0007\u001b\u0000\u0000\u00e5\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6:\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e8\u0005+\u0000\u0000\u00e8<\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0005-\u0000\u0000\u00ea>\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0005/\u0000\u0000\u00ec@\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005*"+
		"\u0000\u0000\u00eeB\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005%\u0000\u0000"+
		"\u00f0D\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005.\u0000\u0000\u00f2F"+
		"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005;\u0000\u0000\u00f4H\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f6\u0005{\u0000\u0000\u00f6J\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0005}\u0000\u0000\u00f8L\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0005(\u0000\u0000\u00faN\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005)"+
		"\u0000\u0000\u00fcP\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005[\u0000\u0000"+
		"\u00feR\u0001\u0000\u0000\u0000\u00ff\u0100\u0005]\u0000\u0000\u0100T"+
		"\u0001\u0000\u0000\u0000\u0101\u0102\u0003%\u0012\u0000\u0102\u0103\u0003"+
		"+\u0015\u0000\u0103\u0104\u0003\u0019\f\u0000\u0104\u0105\u0003\u000b"+
		"\u0005\u0000\u0105V\u0001\u0000\u0000\u0000\u0106\u0107\u0003/\u0017\u0000"+
		"\u0107\u0108\u0003\u0011\b\u0000\u0108\u0109\u0003\u000b\u0005\u0000\u0109"+
		"\u010a\u0003\u001d\u000e\u0000\u010aX\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0003)\u0014\u0000\u010c\u010d\u0003\u0011\b\u0000\u010d\u010e\u0003"+
		"\u000b\u0005\u0000\u010e\u010f\u0003\u001d\u000e\u0000\u010fZ\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0005&\u0000\u0000\u0111\u0112\u0005&\u0000\u0000"+
		"\u0112\\\u0001\u0000\u0000\u0000\u0113\u0114\u0005|\u0000\u0000\u0114"+
		"\u0115\u0005|\u0000\u0000\u0115^\u0001\u0000\u0000\u0000\u0116\u0117\u0003"+
		")\u0014\u0000\u0117\u0118\u0003%\u0012\u0000\u0118\u0119\u0003+\u0015"+
		"\u0000\u0119\u011a\u0003\u000b\u0005\u0000\u011a`\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0003\r\u0006\u0000\u011c\u011d\u0003\u0003\u0001\u0000\u011d"+
		"\u011e\u0003\u0019\f\u0000\u011e\u011f\u0003\'\u0013\u0000\u011f\u0120"+
		"\u0003\u000b\u0005\u0000\u0120b\u0001\u0000\u0000\u0000\u0121\u0122\u0003"+
		"\u001d\u000e\u0000\u0122\u0123\u0003\u0013\t\u0000\u0123\u0124\u0003\u0019"+
		"\f\u0000\u0124d\u0001\u0000\u0000\u0000\u0125\u0126\u0005!\u0000\u0000"+
		"\u0126f\u0001\u0000\u0000\u0000\u0127\u0128\u0003\'\u0013\u0000\u0128"+
		"\u0129\u0003\u0003\u0001\u0000\u0129\u012a\u0003\u0019\f\u0000\u012a\u012b"+
		"\u0003\u0013\t\u0000\u012b\u012c\u0003\u000b\u0005\u0000\u012c\u012d\u0003"+
		"\u001d\u000e\u0000\u012d\u012e\u0003\u0007\u0003\u0000\u012e\u012f\u0003"+
		"\u000b\u0005\u0000\u012fh\u0001\u0000\u0000\u0000\u0130\u0131\u0005=\u0000"+
		"\u0000\u0131\u0132\u0005=\u0000\u0000\u0132j\u0001\u0000\u0000\u0000\u0133"+
		"\u0134\u0005=\u0000\u0000\u0134l\u0001\u0000\u0000\u0000\u0135\u0136\u0005"+
		"+\u0000\u0000\u0136\u0137\u0005=\u0000\u0000\u0137n\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0005-\u0000\u0000\u0139\u013a\u0005=\u0000\u0000\u013a"+
		"p\u0001\u0000\u0000\u0000\u013b\u013c\u0005/\u0000\u0000\u013c\u013d\u0005"+
		"=\u0000\u0000\u013dr\u0001\u0000\u0000\u0000\u013e\u013f\u0005*\u0000"+
		"\u0000\u013f\u0140\u0005=\u0000\u0000\u0140t\u0001\u0000\u0000\u0000\u0141"+
		"\u0142\u0005>\u0000\u0000\u0142v\u0001\u0000\u0000\u0000\u0143\u0144\u0005"+
		"<\u0000\u0000\u0144x\u0001\u0000\u0000\u0000\u0145\u0146\u0005>\u0000"+
		"\u0000\u0146\u0147\u0005=\u0000\u0000\u0147z\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0005<\u0000\u0000\u0149\u014a\u0005=\u0000\u0000\u014a|\u0001"+
		"\u0000\u0000\u0000\u014b\u014c\u0005!\u0000\u0000\u014c\u014d\u0005=\u0000"+
		"\u0000\u014d~\u0001\u0000\u0000\u0000\u014e\u014f\u0005&\u0000\u0000\u014f"+
		"\u0080\u0001\u0000\u0000\u0000\u0150\u0151\u0005|\u0000\u0000\u0151\u0082"+
		"\u0001\u0000\u0000\u0000\u0152\u0156\u00037\u001b\u0000\u0153\u0155\u0003"+
		"9\u001c\u0000\u0154\u0153\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0084\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0159\u0161\u0005\"\u0000\u0000\u015a\u015b\u0005\\\u0000"+
		"\u0000\u015b\u0160\t\u0000\u0000\u0000\u015c\u015d\u0005\"\u0000\u0000"+
		"\u015d\u0160\u0005\"\u0000\u0000\u015e\u0160\b\u001c\u0000\u0000\u015f"+
		"\u015a\u0001\u0000\u0000\u0000\u015f\u015c\u0001\u0000\u0000\u0000\u015f"+
		"\u015e\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162"+
		"\u0164\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0005\"\u0000\u0000\u0165\u0086\u0001\u0000\u0000\u0000\u0166\u016e"+
		"\u0005\'\u0000\u0000\u0167\u0168\u0005\\\u0000\u0000\u0168\u016d\t\u0000"+
		"\u0000\u0000\u0169\u016a\u0005\'\u0000\u0000\u016a\u016d\u0005\'\u0000"+
		"\u0000\u016b\u016d\b\u001d\u0000\u0000\u016c\u0167\u0001\u0000\u0000\u0000"+
		"\u016c\u0169\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000"+
		"\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000"+
		"\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0171\u0001\u0000\u0000\u0000"+
		"\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0172\u0005\'\u0000\u0000\u0172"+
		"\u0088\u0001\u0000\u0000\u0000\u0173\u0174\u0003\u0093I\u0000\u0174\u0175"+
		"\u0003E\"\u0000\u0175\u0177\u0003\u009bM\u0000\u0176\u0178\u0003\u008b"+
		"E\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000"+
		"\u0000\u0178\u0182\u0001\u0000\u0000\u0000\u0179\u017a\u0003\u0093I\u0000"+
		"\u017a\u017b\u0003\u008bE\u0000\u017b\u0182\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0003E\"\u0000\u017d\u017f\u0003\u009bM\u0000\u017e\u0180\u0003"+
		"\u008bE\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u0182\u0001\u0000\u0000\u0000\u0181\u0173\u0001\u0000"+
		"\u0000\u0000\u0181\u0179\u0001\u0000\u0000\u0000\u0181\u017c\u0001\u0000"+
		"\u0000\u0000\u0182\u008a\u0001\u0000\u0000\u0000\u0183\u0186\u0003\u000b"+
		"\u0005\u0000\u0184\u0187\u0003;\u001d\u0000\u0185\u0187\u0003=\u001e\u0000"+
		"\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000"+
		"\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000"+
		"\u0188\u0189\u0003\u009bM\u0000\u0189\u008c\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u00050\u0000\u0000\u018b\u018c\u00031\u0018\u0000\u018c\u018d\u0003"+
		"\u008fG\u0000\u018d\u018e\u0003\u0091H\u0000\u018e\u008e\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0003\u0099L\u0000\u0190\u0192\u0003E\"\u0000\u0191"+
		"\u0193\u0003\u0099L\u0000\u0192\u0191\u0001\u0000\u0000\u0000\u0192\u0193"+
		"\u0001\u0000\u0000\u0000\u0193\u0199\u0001\u0000\u0000\u0000\u0194\u0199"+
		"\u0003\u0099L\u0000\u0195\u0196\u0003E\"\u0000\u0196\u0197\u0003\u0099"+
		"L\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u018f\u0001\u0000\u0000"+
		"\u0000\u0198\u0194\u0001\u0000\u0000\u0000\u0198\u0195\u0001\u0000\u0000"+
		"\u0000\u0199\u0090\u0001\u0000\u0000\u0000\u019a\u019d\u0003!\u0010\u0000"+
		"\u019b\u019e\u0003;\u001d\u0000\u019c\u019e\u0003=\u001e\u0000\u019d\u019b"+
		"\u0001\u0000\u0000\u0000\u019d\u019c\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0"+
		"\u0003\u009bM\u0000\u01a0\u0092\u0001\u0000\u0000\u0000\u01a1\u01a7\u0005"+
		"0\u0000\u0000\u01a2\u01a4\u0007\u001e\u0000\u0000\u01a3\u01a5\u0003\u009b"+
		"M\u0000\u01a4\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a7\u0001\u0000\u0000\u0000\u01a6\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a2\u0001\u0000\u0000\u0000\u01a7\u0094\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a9\u00050\u0000\u0000\u01a9\u01aa\u00031\u0018\u0000\u01aa"+
		"\u01ab\u0003\u0099L\u0000\u01ab\u0096\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u00050\u0000\u0000\u01ad\u01ae\u0003\u009dN\u0000\u01ae\u0098\u0001\u0000"+
		"\u0000\u0000\u01af\u01b1\u0003\u00a3Q\u0000\u01b0\u01af\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u009a\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b6\u0003\u009fO\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u009c\u0001\u0000\u0000\u0000"+
		"\u01b9\u01bb\u0003\u00a1P\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bb"+
		"\u01bc\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bd\u0001\u0000\u0000\u0000\u01bd\u009e\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u0007\u001f\u0000\u0000\u01bf\u00a0\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0007 \u0000\u0000\u01c1\u00a2\u0001\u0000\u0000\u0000\u01c2\u01c3"+
		"\u0007!\u0000\u0000\u01c3\u00a4\u0001\u0000\u0000\u0000\u01c4\u01c6\u0007"+
		"\"\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0006R\u0000"+
		"\u0000\u01ca\u00a6\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005/\u0000\u0000"+
		"\u01cc\u01cd\u0005*\u0000\u0000\u01cd\u01d1\u0001\u0000\u0000\u0000\u01ce"+
		"\u01d0\t\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0\u01d3"+
		"\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d4\u0001\u0000\u0000\u0000\u01d3\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005*\u0000\u0000\u01d5\u01d6\u0005"+
		"/\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01d8\u0006S\u0000"+
		"\u0000\u01d8\u00a8\u0001\u0000\u0000\u0000\u01d9\u01da\u0005/\u0000\u0000"+
		"\u01da\u01db\u0005/\u0000\u0000\u01db\u01df\u0001\u0000\u0000\u0000\u01dc"+
		"\u01de\b#\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de\u01e1"+
		"\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e0\u01e2\u0001\u0000\u0000\u0000\u01e1\u01df"+
		"\u0001\u0000\u0000\u0000\u01e2\u01e3\u0006T\u0000\u0000\u01e3\u00aa\u0001"+
		"\u0000\u0000\u0000\u0016\u0000\u00e5\u0156\u015f\u0161\u016c\u016e\u0177"+
		"\u017f\u0181\u0186\u0192\u0198\u019d\u01a4\u01a6\u01b2\u01b7\u01bc\u01c7"+
		"\u01d1\u01df\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}