// Generated from G:/mymise/in-memory-transfer-language/core/src/main/java/com/dnt/itl/grammar\ITL.g4 by ANTLR 4.5
package com.dnt.itl.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ITLLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            EQUALS = 1, BIGGER = 2, SMALLER = 3, BIGGEROREQ = 4, SMALLEROREQ = 5, NOTEQUAL = 6,
            NOT = 7, AND = 8, OR = 9, SELECT = 10, COMMA = 11, FROM = 12, WHERE = 13, AS = 14, LPAREN = 15,
            RPAREN = 16, DOT = 17, LBRACK = 18, RBRACK = 19, TRUE = 20, FALSE = 21, NULL = 22, MUL = 23,
            DIV = 24, ADD = 25, SUB = 26, HexLiteral = 27, DecimalLiteral = 28, OctalLiteral = 29,
            FloatingPointLiteral = 30, CharacterLiteral = 31, StringLiteral = 32, ID = 33,
            WS = 34;
    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    public static final String[] ruleNames = {
            "EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", "SMALLEROREQ", "NOTEQUAL",
            "NOT", "AND", "OR", "SELECT", "COMMA", "FROM", "WHERE", "AS", "LPAREN",
            "RPAREN", "DOT", "LBRACK", "RBRACK", "TRUE", "FALSE", "NULL", "MUL", "DIV",
            "ADD", "SUB", "HexLiteral", "DecimalLiteral", "OctalLiteral", "HexDigit",
            "IntegerTypeSuffix", "FloatingPointLiteral", "Exponent", "FloatTypeSuffix",
            "CharacterLiteral", "StringLiteral", "EscapeSequence", "OctalEscape",
            "UnicodeEscape", "ID", "WS"
    };

    private static final String[] _LITERAL_NAMES = {
            null, "'='", "'>'", "'<'", "'>='", "'<='", "'!='", "'not'", "'and'", "'or'",
            "'select'", "','", "'from'", "'where'", "'as'", "'('", "')'", "'.'", "'['",
            "']'", "'true'", "'false'", "'null'", "'*'", "'/'", "'+'", "'-'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "EQUALS", "BIGGER", "SMALLER", "BIGGEROREQ", "SMALLEROREQ", "NOTEQUAL",
            "NOT", "AND", "OR", "SELECT", "COMMA", "FROM", "WHERE", "AS", "LPAREN",
            "RPAREN", "DOT", "LBRACK", "RBRACK", "TRUE", "FALSE", "NULL", "MUL", "DIV",
            "ADD", "SUB", "HexLiteral", "DecimalLiteral", "OctalLiteral", "FloatingPointLiteral",
            "CharacterLiteral", "StringLiteral", "ID", "WS"
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
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "ITL.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u015e\b\1\4\2\t" +
                    "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13" +
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22" +
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" +
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!" +
                    "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2" +
                    "\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3" +
                    "\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f" +
                    "\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20" +
                    "\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25" +
                    "\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31" +
                    "\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\6\34\u00ac\n\34\r\34\16\34\u00ad" +
                    "\3\34\5\34\u00b1\n\34\3\35\3\35\3\35\7\35\u00b6\n\35\f\35\16\35\u00b9" +
                    "\13\35\5\35\u00bb\n\35\3\35\5\35\u00be\n\35\3\36\3\36\6\36\u00c2\n\36" +
                    "\r\36\16\36\u00c3\3\36\5\36\u00c7\n\36\3\37\3\37\3 \3 \3!\6!\u00ce\n!" +
                    "\r!\16!\u00cf\3!\3!\7!\u00d4\n!\f!\16!\u00d7\13!\3!\5!\u00da\n!\3!\5!" +
                    "\u00dd\n!\3!\3!\6!\u00e1\n!\r!\16!\u00e2\3!\5!\u00e6\n!\3!\5!\u00e9\n" +
                    "!\3!\6!\u00ec\n!\r!\16!\u00ed\3!\3!\5!\u00f2\n!\3!\6!\u00f5\n!\r!\16!" +
                    "\u00f6\3!\3!\3!\3!\3!\5!\u00fe\n!\3!\7!\u0101\n!\f!\16!\u0104\13!\3!\3" +
                    "!\7!\u0108\n!\f!\16!\u010b\13!\5!\u010d\n!\3!\3!\5!\u0111\n!\3!\6!\u0114" +
                    "\n!\r!\16!\u0115\3!\5!\u0119\n!\5!\u011b\n!\3\"\3\"\5\"\u011f\n\"\3\"" +
                    "\6\"\u0122\n\"\r\"\16\"\u0123\3#\3#\3$\3$\3$\5$\u012b\n$\3$\3$\3%\3%\3" +
                    "%\7%\u0132\n%\f%\16%\u0135\13%\3%\3%\3&\3&\3&\3&\5&\u013d\n&\3\'\3\'\3" +
                    "\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0148\n\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\7" +
                    ")\u0153\n)\f)\16)\u0156\13)\3*\6*\u0159\n*\r*\16*\u015a\3*\3*\2\2+\3\3" +
                    "\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21" +
                    "!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37=\2?" +
                    "\2A C\2E\2G!I\"K\2M\2O\2Q#S$\3\2\17\4\2ZZzz\5\2\62;CHch\4\2NNnn\4\2RR" +
                    "rr\4\2--//\4\2GGgg\6\2FFHHffhh\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\4\2" +
                    "C\\c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\u017d\2\3\3\2\2\2\2\5\3\2\2\2\2" +
                    "\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2" +
                    "\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2" +
                    "\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2" +
                    "\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2" +
                    "\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2A\3\2\2\2\2G\3\2\2" +
                    "\2\2I\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7Y\3\2\2\2\t" +
                    "[\3\2\2\2\13^\3\2\2\2\ra\3\2\2\2\17d\3\2\2\2\21h\3\2\2\2\23l\3\2\2\2\25" +
                    "o\3\2\2\2\27v\3\2\2\2\31x\3\2\2\2\33}\3\2\2\2\35\u0083\3\2\2\2\37\u0086" +
                    "\3\2\2\2!\u0088\3\2\2\2#\u008a\3\2\2\2%\u008c\3\2\2\2\'\u008e\3\2\2\2" +
                    ")\u0090\3\2\2\2+\u0095\3\2\2\2-\u009b\3\2\2\2/\u00a0\3\2\2\2\61\u00a2" +
                    "\3\2\2\2\63\u00a4\3\2\2\2\65\u00a6\3\2\2\2\67\u00a8\3\2\2\29\u00ba\3\2" +
                    "\2\2;\u00bf\3\2\2\2=\u00c8\3\2\2\2?\u00ca\3\2\2\2A\u011a\3\2\2\2C\u011c" +
                    "\3\2\2\2E\u0125\3\2\2\2G\u0127\3\2\2\2I\u012e\3\2\2\2K\u013c\3\2\2\2M" +
                    "\u0147\3\2\2\2O\u0149\3\2\2\2Q\u0150\3\2\2\2S\u0158\3\2\2\2UV\7?\2\2V" +
                    "\4\3\2\2\2WX\7@\2\2X\6\3\2\2\2YZ\7>\2\2Z\b\3\2\2\2[\\\7@\2\2\\]\7?\2\2" +
                    "]\n\3\2\2\2^_\7>\2\2_`\7?\2\2`\f\3\2\2\2ab\7#\2\2bc\7?\2\2c\16\3\2\2\2" +
                    "de\7p\2\2ef\7q\2\2fg\7v\2\2g\20\3\2\2\2hi\7c\2\2ij\7p\2\2jk\7f\2\2k\22" +
                    "\3\2\2\2lm\7q\2\2mn\7t\2\2n\24\3\2\2\2op\7u\2\2pq\7g\2\2qr\7n\2\2rs\7" +
                    "g\2\2st\7e\2\2tu\7v\2\2u\26\3\2\2\2vw\7.\2\2w\30\3\2\2\2xy\7h\2\2yz\7" +
                    "t\2\2z{\7q\2\2{|\7o\2\2|\32\3\2\2\2}~\7y\2\2~\177\7j\2\2\177\u0080\7g" +
                    "\2\2\u0080\u0081\7t\2\2\u0081\u0082\7g\2\2\u0082\34\3\2\2\2\u0083\u0084" +
                    "\7c\2\2\u0084\u0085\7u\2\2\u0085\36\3\2\2\2\u0086\u0087\7*\2\2\u0087 " +
                    "\3\2\2\2\u0088\u0089\7+\2\2\u0089\"\3\2\2\2\u008a\u008b\7\60\2\2\u008b" +
                    "$\3\2\2\2\u008c\u008d\7]\2\2\u008d&\3\2\2\2\u008e\u008f\7_\2\2\u008f(" +
                    "\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7t\2\2\u0092\u0093\7w\2\2\u0093" +
                    "\u0094\7g\2\2\u0094*\3\2\2\2\u0095\u0096\7h\2\2\u0096\u0097\7c\2\2\u0097" +
                    "\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a,\3\2\2\2\u009b" +
                    "\u009c\7p\2\2\u009c\u009d\7w\2\2\u009d\u009e\7n\2\2\u009e\u009f\7n\2\2" +
                    "\u009f.\3\2\2\2\u00a0\u00a1\7,\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7\61\2" +
                    "\2\u00a3\62\3\2\2\2\u00a4\u00a5\7-\2\2\u00a5\64\3\2\2\2\u00a6\u00a7\7" +
                    "/\2\2\u00a7\66\3\2\2\2\u00a8\u00a9\7\62\2\2\u00a9\u00ab\t\2\2\2\u00aa" +
                    "\u00ac\5=\37\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2" +
                    "\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af\u00b1\5? \2\u00b0\u00af" +
                    "\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b18\3\2\2\2\u00b2\u00bb\7\62\2\2\u00b3" +
                    "\u00b7\4\63;\2\u00b4\u00b6\4\62;\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2" +
                    "\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9" +
                    "\u00b7\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b3\3\2\2\2\u00bb\u00bd\3\2" +
                    "\2\2\u00bc\u00be\5? \2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be:" +
                    "\3\2\2\2\u00bf\u00c1\7\62\2\2\u00c0\u00c2\4\629\2\u00c1\u00c0\3\2\2\2" +
                    "\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6" +
                    "\3\2\2\2\u00c5\u00c7\5? \2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7" +
                    "<\3\2\2\2\u00c8\u00c9\t\3\2\2\u00c9>\3\2\2\2\u00ca\u00cb\t\4\2\2\u00cb" +
                    "@\3\2\2\2\u00cc\u00ce\4\62;\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2" +
                    "\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5" +
                    "\7\60\2\2\u00d2\u00d4\4\62;\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2" +
                    "\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5" +
                    "\3\2\2\2\u00d8\u00da\5C\"\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da" +
                    "\u00dc\3\2\2\2\u00db\u00dd\5E#\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2" +
                    "\2\u00dd\u011b\3\2\2\2\u00de\u00e0\7\60\2\2\u00df\u00e1\4\62;\2\u00e0" +
                    "\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2" +
                    "\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e6\5C\"\2\u00e5\u00e4\3\2\2\2\u00e5" +
                    "\u00e6\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e9\5E#\2\u00e8\u00e7\3\2\2" +
                    "\2\u00e8\u00e9\3\2\2\2\u00e9\u011b\3\2\2\2\u00ea\u00ec\4\62;\2\u00eb\u00ea" +
                    "\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee" +
                    "\u00ef\3\2\2\2\u00ef\u00f1\5C\"\2\u00f0\u00f2\5E#\2\u00f1\u00f0\3\2\2" +
                    "\2\u00f1\u00f2\3\2\2\2\u00f2\u011b\3\2\2\2\u00f3\u00f5\4\62;\2\u00f4\u00f3" +
                    "\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7" +
                    "\u00f8\3\2\2\2\u00f8\u011b\5E#\2\u00f9\u00fa\7\62\2\2\u00fa\u00fe\7z\2" +
                    "\2\u00fb\u00fc\7\62\2\2\u00fc\u00fe\7Z\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fb" +
                    "\3\2\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101\5=\37\2\u0100\u00ff\3\2\2\2\u0101" +
                    "\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u010c\3\2" +
                    "\2\2\u0104\u0102\3\2\2\2\u0105\u0109\7\60\2\2\u0106\u0108\5=\37\2\u0107" +
                    "\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2" +
                    "\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0105\3\2\2\2\u010c" +
                    "\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\t\5\2\2\u010f\u0111\t\6" +
                    "\2\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112" +
                    "\u0114\4\62;\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2" +
                    "\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0119\5E#\2\u0118\u0117" +
                    "\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\3\2\2\2\u011a\u00cd\3\2\2\2\u011a" +
                    "\u00de\3\2\2\2\u011a\u00eb\3\2\2\2\u011a\u00f4\3\2\2\2\u011a\u00fd\3\2" +
                    "\2\2\u011bB\3\2\2\2\u011c\u011e\t\7\2\2\u011d\u011f\t\6\2\2\u011e\u011d" +
                    "\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u0122\4\62;\2\u0121" +
                    "\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2" +
                    "\2\2\u0124D\3\2\2\2\u0125\u0126\t\b\2\2\u0126F\3\2\2\2\u0127\u012a\7)" +
                    "\2\2\u0128\u012b\5K&\2\u0129\u012b\n\t\2\2\u012a\u0128\3\2\2\2\u012a\u0129" +
                    "\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7)\2\2\u012dH\3\2\2\2\u012e\u0133" +
                    "\7$\2\2\u012f\u0132\5K&\2\u0130\u0132\n\n\2\2\u0131\u012f\3\2\2\2\u0131" +
                    "\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2" +
                    "\2\2\u0134\u0136\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7$\2\2\u0137" +
                    "J\3\2\2\2\u0138\u0139\7^\2\2\u0139\u013d\t\13\2\2\u013a\u013d\5O(\2\u013b" +
                    "\u013d\5M\'\2\u013c\u0138\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2" +
                    "\2\2\u013dL\3\2\2\2\u013e\u013f\7^\2\2\u013f\u0140\4\62\65\2\u0140\u0141" +
                    "\4\629\2\u0141\u0148\4\629\2\u0142\u0143\7^\2\2\u0143\u0144\4\629\2\u0144" +
                    "\u0148\4\629\2\u0145\u0146\7^\2\2\u0146\u0148\4\629\2\u0147\u013e\3\2" +
                    "\2\2\u0147\u0142\3\2\2\2\u0147\u0145\3\2\2\2\u0148N\3\2\2\2\u0149\u014a" +
                    "\7^\2\2\u014a\u014b\7w\2\2\u014b\u014c\5=\37\2\u014c\u014d\5=\37\2\u014d" +
                    "\u014e\5=\37\2\u014e\u014f\5=\37\2\u014fP\3\2\2\2\u0150\u0154\t\f\2\2" +
                    "\u0151\u0153\t\r\2\2\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152" +
                    "\3\2\2\2\u0154\u0155\3\2\2\2\u0155R\3\2\2\2\u0156\u0154\3\2\2\2\u0157" +
                    "\u0159\t\16\2\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3" +
                    "\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\b*\2\2\u015d" +
                    "T\3\2\2\2%\2\u00ad\u00b0\u00b7\u00ba\u00bd\u00c3\u00c6\u00cf\u00d5\u00d9" +
                    "\u00dc\u00e2\u00e5\u00e8\u00ed\u00f1\u00f6\u00fd\u0102\u0109\u010c\u0110" +
                    "\u0115\u0118\u011a\u011e\u0123\u012a\u0131\u0133\u013c\u0147\u0154\u015a" +
                    "\3\b\2\2";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}