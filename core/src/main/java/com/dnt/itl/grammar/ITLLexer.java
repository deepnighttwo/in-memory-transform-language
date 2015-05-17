// Generated from G:/mymise/in-memory-transfer-language/core/src/main/java/com/dnt/itl/grammar\ITL.g4 by ANTLR 4.5
package com.dnt.itl.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ITLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUALS=1, BIGGER=2, SMALLER=3, BIGGEROREQ=4, SMALLEROREQ=5, NOTEQUAL=6, 
		NOT=7, AND=8, OR=9, SELECT=10, COMMA=11, FROM=12, WHERE=13, AS=14, LPAREN=15, 
		RPAREN=16, DOT=17, LBRACK=18, RBRACK=19, TRUE=20, FALSE=21, NULL=22, MUL=23, 
		DIV=24, ADD=25, SUB=26, MAP=27, REDUCE=28, ON=29, USING=30, HexLiteral=31, 
		DecimalLiteral=32, OctalLiteral=33, FloatingPointLiteral=34, CharacterLiteral=35, 
		StringLiteral=36, ID=37, WS=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", "SMALLEROREQ", "NOTEQUAL", 
		"NOT", "AND", "OR", "SELECT", "COMMA", "FROM", "WHERE", "AS", "LPAREN", 
		"RPAREN", "DOT", "LBRACK", "RBRACK", "TRUE", "FALSE", "NULL", "MUL", "DIV", 
		"ADD", "SUB", "MAP", "REDUCE", "ON", "USING", "HexLiteral", "DecimalLiteral", 
		"OctalLiteral", "HexDigit", "IntegerTypeSuffix", "FloatingPointLiteral", 
		"Exponent", "FloatTypeSuffix", "CharacterLiteral", "StringLiteral", "EscapeSequence", 
		"OctalEscape", "UnicodeEscape", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'not'", "'and'", "'or'", 
		"'select'", "','", "'from'", "'where'", "'as'", "'('", "')'", "'.'", "'['", 
		"']'", "'true'", "'false'", "'null'", "'*'", "'/'", "'+'", "'-'", "'map'", 
		"'reduce'", "'on'", "'using'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", "SMALLEROREQ", "NOTEQUAL", 
		"NOT", "AND", "OR", "SELECT", "COMMA", "FROM", "WHERE", "AS", "LPAREN", 
		"RPAREN", "DOT", "LBRACK", "RBRACK", "TRUE", "FALSE", "NULL", "MUL", "DIV", 
		"ADD", "SUB", "MAP", "REDUCE", "ON", "USING", "HexLiteral", "DecimalLiteral", 
		"OctalLiteral", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", 
		"ID", "WS"
	};
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
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ITLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ITL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u017a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \6 \u00c8\n \r \16 \u00c9\3 \5 \u00cd\n \3!\3!\3!\7!"+
		"\u00d2\n!\f!\16!\u00d5\13!\5!\u00d7\n!\3!\5!\u00da\n!\3\"\3\"\6\"\u00de"+
		"\n\"\r\"\16\"\u00df\3\"\5\"\u00e3\n\"\3#\3#\3$\3$\3%\6%\u00ea\n%\r%\16"+
		"%\u00eb\3%\3%\7%\u00f0\n%\f%\16%\u00f3\13%\3%\5%\u00f6\n%\3%\5%\u00f9"+
		"\n%\3%\3%\6%\u00fd\n%\r%\16%\u00fe\3%\5%\u0102\n%\3%\5%\u0105\n%\3%\6"+
		"%\u0108\n%\r%\16%\u0109\3%\3%\5%\u010e\n%\3%\6%\u0111\n%\r%\16%\u0112"+
		"\3%\3%\3%\3%\3%\5%\u011a\n%\3%\7%\u011d\n%\f%\16%\u0120\13%\3%\3%\7%\u0124"+
		"\n%\f%\16%\u0127\13%\5%\u0129\n%\3%\3%\5%\u012d\n%\3%\6%\u0130\n%\r%\16"+
		"%\u0131\3%\5%\u0135\n%\5%\u0137\n%\3&\3&\5&\u013b\n&\3&\6&\u013e\n&\r"+
		"&\16&\u013f\3\'\3\'\3(\3(\3(\5(\u0147\n(\3(\3(\3)\3)\3)\7)\u014e\n)\f"+
		")\16)\u0151\13)\3)\3)\3*\3*\3*\3*\5*\u0159\n*\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u0164\n+\3,\3,\3,\3,\3,\3,\3,\3-\3-\7-\u016f\n-\f-\16-\u0172\13"+
		"-\3.\6.\u0175\n.\r.\16.\u0176\3.\3.\2\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2I$K\2M\2O%Q&S\2"+
		"U\2W\2Y\'[(\3\2\17\4\2ZZzz\5\2\62;CHch\4\2NNnn\4\2RRrr\4\2--//\4\2GGg"+
		"g\6\2FFHHffhh\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\4\2C\\c|\5\2\62;C\\"+
		"c|\5\2\13\f\17\17\"\"\u0199\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2I\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2"+
		"\2\2\5_\3\2\2\2\7a\3\2\2\2\tc\3\2\2\2\13f\3\2\2\2\ri\3\2\2\2\17l\3\2\2"+
		"\2\21p\3\2\2\2\23t\3\2\2\2\25w\3\2\2\2\27~\3\2\2\2\31\u0080\3\2\2\2\33"+
		"\u0085\3\2\2\2\35\u008b\3\2\2\2\37\u008e\3\2\2\2!\u0090\3\2\2\2#\u0092"+
		"\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2)\u0098\3\2\2\2+\u009d\3\2\2\2"+
		"-\u00a3\3\2\2\2/\u00a8\3\2\2\2\61\u00aa\3\2\2\2\63\u00ac\3\2\2\2\65\u00ae"+
		"\3\2\2\2\67\u00b0\3\2\2\29\u00b4\3\2\2\2;\u00bb\3\2\2\2=\u00be\3\2\2\2"+
		"?\u00c4\3\2\2\2A\u00d6\3\2\2\2C\u00db\3\2\2\2E\u00e4\3\2\2\2G\u00e6\3"+
		"\2\2\2I\u0136\3\2\2\2K\u0138\3\2\2\2M\u0141\3\2\2\2O\u0143\3\2\2\2Q\u014a"+
		"\3\2\2\2S\u0158\3\2\2\2U\u0163\3\2\2\2W\u0165\3\2\2\2Y\u016c\3\2\2\2["+
		"\u0174\3\2\2\2]^\7?\2\2^\4\3\2\2\2_`\7@\2\2`\6\3\2\2\2ab\7>\2\2b\b\3\2"+
		"\2\2cd\7@\2\2de\7?\2\2e\n\3\2\2\2fg\7>\2\2gh\7?\2\2h\f\3\2\2\2ij\7#\2"+
		"\2jk\7?\2\2k\16\3\2\2\2lm\7p\2\2mn\7q\2\2no\7v\2\2o\20\3\2\2\2pq\7c\2"+
		"\2qr\7p\2\2rs\7f\2\2s\22\3\2\2\2tu\7q\2\2uv\7t\2\2v\24\3\2\2\2wx\7u\2"+
		"\2xy\7g\2\2yz\7n\2\2z{\7g\2\2{|\7e\2\2|}\7v\2\2}\26\3\2\2\2~\177\7.\2"+
		"\2\177\30\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7t\2\2\u0082\u0083\7"+
		"q\2\2\u0083\u0084\7o\2\2\u0084\32\3\2\2\2\u0085\u0086\7y\2\2\u0086\u0087"+
		"\7j\2\2\u0087\u0088\7g\2\2\u0088\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a"+
		"\34\3\2\2\2\u008b\u008c\7c\2\2\u008c\u008d\7u\2\2\u008d\36\3\2\2\2\u008e"+
		"\u008f\7*\2\2\u008f \3\2\2\2\u0090\u0091\7+\2\2\u0091\"\3\2\2\2\u0092"+
		"\u0093\7\60\2\2\u0093$\3\2\2\2\u0094\u0095\7]\2\2\u0095&\3\2\2\2\u0096"+
		"\u0097\7_\2\2\u0097(\3\2\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a"+
		"\u009b\7w\2\2\u009b\u009c\7g\2\2\u009c*\3\2\2\2\u009d\u009e\7h\2\2\u009e"+
		"\u009f\7c\2\2\u009f\u00a0\7n\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7g\2\2"+
		"\u00a2,\3\2\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7n\2"+
		"\2\u00a6\u00a7\7n\2\2\u00a7.\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\60\3\2\2"+
		"\2\u00aa\u00ab\7\61\2\2\u00ab\62\3\2\2\2\u00ac\u00ad\7-\2\2\u00ad\64\3"+
		"\2\2\2\u00ae\u00af\7/\2\2\u00af\66\3\2\2\2\u00b0\u00b1\7o\2\2\u00b1\u00b2"+
		"\7c\2\2\u00b2\u00b3\7r\2\2\u00b38\3\2\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00b7\7f\2\2\u00b7\u00b8\7w\2\2\u00b8\u00b9\7e\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba:\3\2\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7p\2\2\u00bd"+
		"<\3\2\2\2\u00be\u00bf\7w\2\2\u00bf\u00c0\7u\2\2\u00c0\u00c1\7k\2\2\u00c1"+
		"\u00c2\7p\2\2\u00c2\u00c3\7i\2\2\u00c3>\3\2\2\2\u00c4\u00c5\7\62\2\2\u00c5"+
		"\u00c7\t\2\2\2\u00c6\u00c8\5E#\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00cd"+
		"\5G$\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd@\3\2\2\2\u00ce\u00d7"+
		"\7\62\2\2\u00cf\u00d3\4\63;\2\u00d0\u00d2\4\62;\2\u00d1\u00d0\3\2\2\2"+
		"\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d7"+
		"\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00da\5G$\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2"+
		"\2\u00daB\3\2\2\2\u00db\u00dd\7\62\2\2\u00dc\u00de\4\629\2\u00dd\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
		"\u00e2\3\2\2\2\u00e1\u00e3\5G$\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2"+
		"\2\u00e3D\3\2\2\2\u00e4\u00e5\t\3\2\2\u00e5F\3\2\2\2\u00e6\u00e7\t\4\2"+
		"\2\u00e7H\3\2\2\2\u00e8\u00ea\4\62;\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f1\7\60\2\2\u00ee\u00f0\4\62;\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3"+
		"\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3"+
		"\u00f1\3\2\2\2\u00f4\u00f6\5K&\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2"+
		"\2\u00f6\u00f8\3\2\2\2\u00f7\u00f9\5M\'\2\u00f8\u00f7\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u0137\3\2\2\2\u00fa\u00fc\7\60\2\2\u00fb\u00fd\4\62;\2"+
		"\u00fc\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff"+
		"\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u0102\5K&\2\u0101\u0100\3\2\2\2\u0101"+
		"\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0105\5M\'\2\u0104\u0103\3\2"+
		"\2\2\u0104\u0105\3\2\2\2\u0105\u0137\3\2\2\2\u0106\u0108\4\62;\2\u0107"+
		"\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\u010d\5K&\2\u010c\u010e\5M\'\2\u010d\u010c"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0137\3\2\2\2\u010f\u0111\4\62;\2\u0110"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0137\5M\'\2\u0115\u0116\7\62\2\2\u0116"+
		"\u011a\7z\2\2\u0117\u0118\7\62\2\2\u0118\u011a\7Z\2\2\u0119\u0115\3\2"+
		"\2\2\u0119\u0117\3\2\2\2\u011a\u011e\3\2\2\2\u011b\u011d\5E#\2\u011c\u011b"+
		"\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0128\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0125\7\60\2\2\u0122\u0124\5"+
		"E#\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0121\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c\t\5\2\2\u012b"+
		"\u012d\t\6\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2"+
		"\2\2\u012e\u0130\4\62;\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135\5M"+
		"\'\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136"+
		"\u00e9\3\2\2\2\u0136\u00fa\3\2\2\2\u0136\u0107\3\2\2\2\u0136\u0110\3\2"+
		"\2\2\u0136\u0119\3\2\2\2\u0137J\3\2\2\2\u0138\u013a\t\7\2\2\u0139\u013b"+
		"\t\6\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013e\4\62;\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140L\3\2\2\2\u0141\u0142\t\b\2\2\u0142N\3\2"+
		"\2\2\u0143\u0146\7)\2\2\u0144\u0147\5S*\2\u0145\u0147\n\t\2\2\u0146\u0144"+
		"\3\2\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7)\2\2\u0149"+
		"P\3\2\2\2\u014a\u014f\7$\2\2\u014b\u014e\5S*\2\u014c\u014e\n\n\2\2\u014d"+
		"\u014b\3\2\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152"+
		"\u0153\7$\2\2\u0153R\3\2\2\2\u0154\u0155\7^\2\2\u0155\u0159\t\13\2\2\u0156"+
		"\u0159\5W,\2\u0157\u0159\5U+\2\u0158\u0154\3\2\2\2\u0158\u0156\3\2\2\2"+
		"\u0158\u0157\3\2\2\2\u0159T\3\2\2\2\u015a\u015b\7^\2\2\u015b\u015c\4\62"+
		"\65\2\u015c\u015d\4\629\2\u015d\u0164\4\629\2\u015e\u015f\7^\2\2\u015f"+
		"\u0160\4\629\2\u0160\u0164\4\629\2\u0161\u0162\7^\2\2\u0162\u0164\4\62"+
		"9\2\u0163\u015a\3\2\2\2\u0163\u015e\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"V\3\2\2\2\u0165\u0166\7^\2\2\u0166\u0167\7w\2\2\u0167\u0168\5E#\2\u0168"+
		"\u0169\5E#\2\u0169\u016a\5E#\2\u016a\u016b\5E#\2\u016bX\3\2\2\2\u016c"+
		"\u0170\t\f\2\2\u016d\u016f\t\r\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2"+
		"\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171Z\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0173\u0175\t\16\2\2\u0174\u0173\3\2\2\2\u0175\u0176\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"+
		"\b.\2\2\u0179\\\3\2\2\2%\2\u00c9\u00cc\u00d3\u00d6\u00d9\u00df\u00e2\u00eb"+
		"\u00f1\u00f5\u00f8\u00fe\u0101\u0104\u0109\u010d\u0112\u0119\u011e\u0125"+
		"\u0128\u012c\u0131\u0134\u0136\u013a\u013f\u0146\u014d\u014f\u0158\u0163"+
		"\u0170\u0176\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}