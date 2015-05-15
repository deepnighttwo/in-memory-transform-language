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
		DIV=24, ADD=25, SUB=26, MAP=27, REDUCE=28, HexLiteral=29, DecimalLiteral=30, 
		OctalLiteral=31, FloatingPointLiteral=32, CharacterLiteral=33, StringLiteral=34, 
		ID=35, WS=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", "SMALLEROREQ", "NOTEQUAL", 
		"NOT", "AND", "OR", "SELECT", "COMMA", "FROM", "WHERE", "AS", "LPAREN", 
		"RPAREN", "DOT", "LBRACK", "RBRACK", "TRUE", "FALSE", "NULL", "MUL", "DIV", 
		"ADD", "SUB", "MAP", "REDUCE", "HexLiteral", "DecimalLiteral", "OctalLiteral", 
		"HexDigit", "IntegerTypeSuffix", "FloatingPointLiteral", "Exponent", "FloatTypeSuffix", 
		"CharacterLiteral", "StringLiteral", "EscapeSequence", "OctalEscape", 
		"UnicodeEscape", "ID", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'not'", "'and'", "'or'", 
		"'select'", "','", "'from'", "'where'", "'as'", "'('", "')'", "'.'", "'['", 
		"']'", "'true'", "'false'", "'null'", "'*'", "'/'", "'+'", "'-'", "'map'", 
		"'reduce'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", "SMALLEROREQ", "NOTEQUAL", 
		"NOT", "AND", "OR", "SELECT", "COMMA", "FROM", "WHERE", "AS", "LPAREN", 
		"RPAREN", "DOT", "LBRACK", "RBRACK", "TRUE", "FALSE", "NULL", "MUL", "DIV", 
		"ADD", "SUB", "MAP", "REDUCE", "HexLiteral", "DecimalLiteral", "OctalLiteral", 
		"FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "ID", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u016d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\6\36\u00bb\n\36\r\36\16\36\u00bc\3"+
		"\36\5\36\u00c0\n\36\3\37\3\37\3\37\7\37\u00c5\n\37\f\37\16\37\u00c8\13"+
		"\37\5\37\u00ca\n\37\3\37\5\37\u00cd\n\37\3 \3 \6 \u00d1\n \r \16 \u00d2"+
		"\3 \5 \u00d6\n \3!\3!\3\"\3\"\3#\6#\u00dd\n#\r#\16#\u00de\3#\3#\7#\u00e3"+
		"\n#\f#\16#\u00e6\13#\3#\5#\u00e9\n#\3#\5#\u00ec\n#\3#\3#\6#\u00f0\n#\r"+
		"#\16#\u00f1\3#\5#\u00f5\n#\3#\5#\u00f8\n#\3#\6#\u00fb\n#\r#\16#\u00fc"+
		"\3#\3#\5#\u0101\n#\3#\6#\u0104\n#\r#\16#\u0105\3#\3#\3#\3#\3#\5#\u010d"+
		"\n#\3#\7#\u0110\n#\f#\16#\u0113\13#\3#\3#\7#\u0117\n#\f#\16#\u011a\13"+
		"#\5#\u011c\n#\3#\3#\5#\u0120\n#\3#\6#\u0123\n#\r#\16#\u0124\3#\5#\u0128"+
		"\n#\5#\u012a\n#\3$\3$\5$\u012e\n$\3$\6$\u0131\n$\r$\16$\u0132\3%\3%\3"+
		"&\3&\3&\5&\u013a\n&\3&\3&\3\'\3\'\3\'\7\'\u0141\n\'\f\'\16\'\u0144\13"+
		"\'\3\'\3\'\3(\3(\3(\3(\5(\u014c\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0157"+
		"\n)\3*\3*\3*\3*\3*\3*\3*\3+\3+\7+\u0162\n+\f+\16+\u0165\13+\3,\6,\u0168"+
		"\n,\r,\16,\u0169\3,\3,\2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\2C\2E\"G\2I\2K#M$O\2Q\2S\2U%W&\3\2\17"+
		"\4\2ZZzz\5\2\62;CHch\4\2NNnn\4\2RRrr\4\2--//\4\2GGgg\6\2FFHHffhh\4\2)"+
		")^^\4\2$$^^\n\2$$))^^ddhhppttvv\4\2C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\""+
		"\"\u018c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2E\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13"+
		"b\3\2\2\2\re\3\2\2\2\17h\3\2\2\2\21l\3\2\2\2\23p\3\2\2\2\25s\3\2\2\2\27"+
		"z\3\2\2\2\31|\3\2\2\2\33\u0081\3\2\2\2\35\u0087\3\2\2\2\37\u008a\3\2\2"+
		"\2!\u008c\3\2\2\2#\u008e\3\2\2\2%\u0090\3\2\2\2\'\u0092\3\2\2\2)\u0094"+
		"\3\2\2\2+\u0099\3\2\2\2-\u009f\3\2\2\2/\u00a4\3\2\2\2\61\u00a6\3\2\2\2"+
		"\63\u00a8\3\2\2\2\65\u00aa\3\2\2\2\67\u00ac\3\2\2\29\u00b0\3\2\2\2;\u00b7"+
		"\3\2\2\2=\u00c9\3\2\2\2?\u00ce\3\2\2\2A\u00d7\3\2\2\2C\u00d9\3\2\2\2E"+
		"\u0129\3\2\2\2G\u012b\3\2\2\2I\u0134\3\2\2\2K\u0136\3\2\2\2M\u013d\3\2"+
		"\2\2O\u014b\3\2\2\2Q\u0156\3\2\2\2S\u0158\3\2\2\2U\u015f\3\2\2\2W\u0167"+
		"\3\2\2\2YZ\7?\2\2Z\4\3\2\2\2[\\\7@\2\2\\\6\3\2\2\2]^\7>\2\2^\b\3\2\2\2"+
		"_`\7@\2\2`a\7?\2\2a\n\3\2\2\2bc\7>\2\2cd\7?\2\2d\f\3\2\2\2ef\7#\2\2fg"+
		"\7?\2\2g\16\3\2\2\2hi\7p\2\2ij\7q\2\2jk\7v\2\2k\20\3\2\2\2lm\7c\2\2mn"+
		"\7p\2\2no\7f\2\2o\22\3\2\2\2pq\7q\2\2qr\7t\2\2r\24\3\2\2\2st\7u\2\2tu"+
		"\7g\2\2uv\7n\2\2vw\7g\2\2wx\7e\2\2xy\7v\2\2y\26\3\2\2\2z{\7.\2\2{\30\3"+
		"\2\2\2|}\7h\2\2}~\7t\2\2~\177\7q\2\2\177\u0080\7o\2\2\u0080\32\3\2\2\2"+
		"\u0081\u0082\7y\2\2\u0082\u0083\7j\2\2\u0083\u0084\7g\2\2\u0084\u0085"+
		"\7t\2\2\u0085\u0086\7g\2\2\u0086\34\3\2\2\2\u0087\u0088\7c\2\2\u0088\u0089"+
		"\7u\2\2\u0089\36\3\2\2\2\u008a\u008b\7*\2\2\u008b \3\2\2\2\u008c\u008d"+
		"\7+\2\2\u008d\"\3\2\2\2\u008e\u008f\7\60\2\2\u008f$\3\2\2\2\u0090\u0091"+
		"\7]\2\2\u0091&\3\2\2\2\u0092\u0093\7_\2\2\u0093(\3\2\2\2\u0094\u0095\7"+
		"v\2\2\u0095\u0096\7t\2\2\u0096\u0097\7w\2\2\u0097\u0098\7g\2\2\u0098*"+
		"\3\2\2\2\u0099\u009a\7h\2\2\u009a\u009b\7c\2\2\u009b\u009c\7n\2\2\u009c"+
		"\u009d\7u\2\2\u009d\u009e\7g\2\2\u009e,\3\2\2\2\u009f\u00a0\7p\2\2\u00a0"+
		"\u00a1\7w\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7n\2\2\u00a3.\3\2\2\2\u00a4"+
		"\u00a5\7,\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\62\3\2\2\2\u00a8"+
		"\u00a9\7-\2\2\u00a9\64\3\2\2\2\u00aa\u00ab\7/\2\2\u00ab\66\3\2\2\2\u00ac"+
		"\u00ad\7o\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7r\2\2\u00af8\3\2\2\2\u00b0"+
		"\u00b1\7t\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7f\2\2\u00b3\u00b4\7w\2\2"+
		"\u00b4\u00b5\7e\2\2\u00b5\u00b6\7g\2\2\u00b6:\3\2\2\2\u00b7\u00b8\7\62"+
		"\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00bb\5A!\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00c0\5C\"\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0<\3\2\2\2\u00c1"+
		"\u00ca\7\62\2\2\u00c2\u00c6\4\63;\2\u00c3\u00c5\4\62;\2\u00c4\u00c3\3"+
		"\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c2\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00cd\5C\"\2\u00cc\u00cb\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd>\3\2\2\2\u00ce\u00d0\7\62\2\2\u00cf\u00d1\4\629\2"+
		"\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3"+
		"\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d6\5C\"\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6@\3\2\2\2\u00d7\u00d8\t\3\2\2\u00d8B\3\2\2\2\u00d9"+
		"\u00da\t\4\2\2\u00daD\3\2\2\2\u00db\u00dd\4\62;\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e4\7\60\2\2\u00e1\u00e3\4\62;\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e8"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e9\5G$\2\u00e8\u00e7\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00ec\5I%\2\u00eb\u00ea\3\2\2"+
		"\2\u00eb\u00ec\3\2\2\2\u00ec\u012a\3\2\2\2\u00ed\u00ef\7\60\2\2\u00ee"+
		"\u00f0\4\62;\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f5\5G$\2\u00f4\u00f3"+
		"\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f8\5I%\2\u00f7"+
		"\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u012a\3\2\2\2\u00f9\u00fb\4\62"+
		";\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\5G$\2\u00ff\u0101\5I%\2"+
		"\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u012a\3\2\2\2\u0102\u0104"+
		"\4\62;\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u012a\5I%\2\u0108\u0109\7\62"+
		"\2\2\u0109\u010d\7z\2\2\u010a\u010b\7\62\2\2\u010b\u010d\7Z\2\2\u010c"+
		"\u0108\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u0111\3\2\2\2\u010e\u0110\5A"+
		"!\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u011b\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0118\7\60"+
		"\2\2\u0115\u0117\5A!\2\u0116\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u0114\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\t\5"+
		"\2\2\u011e\u0120\t\6\2\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0122\3\2\2\2\u0121\u0123\4\62;\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2"+
		"\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\3\2\2\2\u0126"+
		"\u0128\5I%\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2"+
		"\2\u0129\u00dc\3\2\2\2\u0129\u00ed\3\2\2\2\u0129\u00fa\3\2\2\2\u0129\u0103"+
		"\3\2\2\2\u0129\u010c\3\2\2\2\u012aF\3\2\2\2\u012b\u012d\t\7\2\2\u012c"+
		"\u012e\t\6\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2"+
		"\2\2\u012f\u0131\4\62;\2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133H\3\2\2\2\u0134\u0135\t\b\2\2"+
		"\u0135J\3\2\2\2\u0136\u0139\7)\2\2\u0137\u013a\5O(\2\u0138\u013a\n\t\2"+
		"\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c"+
		"\7)\2\2\u013cL\3\2\2\2\u013d\u0142\7$\2\2\u013e\u0141\5O(\2\u013f\u0141"+
		"\n\n\2\2\u0140\u013e\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0146\7$\2\2\u0146N\3\2\2\2\u0147\u0148\7^\2\2\u0148\u014c"+
		"\t\13\2\2\u0149\u014c\5S*\2\u014a\u014c\5Q)\2\u014b\u0147\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014b\u014a\3\2\2\2\u014cP\3\2\2\2\u014d\u014e\7^\2\2\u014e"+
		"\u014f\4\62\65\2\u014f\u0150\4\629\2\u0150\u0157\4\629\2\u0151\u0152\7"+
		"^\2\2\u0152\u0153\4\629\2\u0153\u0157\4\629\2\u0154\u0155\7^\2\2\u0155"+
		"\u0157\4\629\2\u0156\u014d\3\2\2\2\u0156\u0151\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0157R\3\2\2\2\u0158\u0159\7^\2\2\u0159\u015a\7w\2\2\u015a\u015b"+
		"\5A!\2\u015b\u015c\5A!\2\u015c\u015d\5A!\2\u015d\u015e\5A!\2\u015eT\3"+
		"\2\2\2\u015f\u0163\t\f\2\2\u0160\u0162\t\r\2\2\u0161\u0160\3\2\2\2\u0162"+
		"\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164V\3\2\2\2"+
		"\u0165\u0163\3\2\2\2\u0166\u0168\t\16\2\2\u0167\u0166\3\2\2\2\u0168\u0169"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\b,\2\2\u016cX\3\2\2\2%\2\u00bc\u00bf\u00c6\u00c9\u00cc\u00d2\u00d5"+
		"\u00de\u00e4\u00e8\u00eb\u00f1\u00f4\u00f7\u00fc\u0100\u0105\u010c\u0111"+
		"\u0118\u011b\u011f\u0124\u0127\u0129\u012d\u0132\u0139\u0140\u0142\u014b"+
		"\u0156\u0163\u0169\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}