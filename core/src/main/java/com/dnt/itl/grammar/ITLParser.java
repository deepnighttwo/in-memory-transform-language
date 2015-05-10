// Generated from G:/mymise/in-memory-transfer-language/core/src/main/java/com/dnt/itl/grammar\ITL.g4 by ANTLR 4.5
package com.dnt.itl.grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ITLParser extends Parser {
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
    public static final int
            RULE_ql = 0, RULE_select = 1, RULE_from = 2, RULE_where = 3, RULE_propsSel = 4,
            RULE_propVar = 5, RULE_propFullName = 6, RULE_propName = 7, RULE_boolExpr = 8,
            RULE_integerLiteral = 9, RULE_booleanLiteral = 10;
    public static final String[] ruleNames = {
            "ql", "select", "from", "where", "propsSel", "propVar", "propFullName",
            "propName", "boolExpr", "integerLiteral", "booleanLiteral"
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
    public ATN getATN() {
        return _ATN;
    }

    public ITLParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class QlContext extends ParserRuleContext {
        public SelectContext select() {
            return getRuleContext(SelectContext.class, 0);
        }

        public FromContext from() {
            return getRuleContext(FromContext.class, 0);
        }

        public WhereContext where() {
            return getRuleContext(WhereContext.class, 0);
        }

        public QlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ql;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterQl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitQl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitQl(this);
            else return visitor.visitChildren(this);
        }
    }

    public final QlContext ql() throws RecognitionException {
        QlContext _localctx = new QlContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_ql);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(22);
                select();
                setState(23);
                from();
                setState(25);
                _la = _input.LA(1);
                if (_la == WHERE) {
                    {
                        setState(24);
                        where();
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SelectContext extends ParserRuleContext {
        public TerminalNode SELECT() {
            return getToken(ITLParser.SELECT, 0);
        }

        public List<PropsSelContext> propsSel() {
            return getRuleContexts(PropsSelContext.class);
        }

        public PropsSelContext propsSel(int i) {
            return getRuleContext(PropsSelContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ITLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ITLParser.COMMA, i);
        }

        public SelectContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterSelect(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitSelect(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitSelect(this);
            else return visitor.visitChildren(this);
        }
    }

    public final SelectContext select() throws RecognitionException {
        SelectContext _localctx = new SelectContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_select);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(27);
                match(SELECT);
                setState(28);
                propsSel();
                setState(33);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(29);
                            match(COMMA);
                            setState(30);
                            propsSel();
                        }
                    }
                    setState(35);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class FromContext extends ParserRuleContext {
        public Token fromSource;
        public Token fromAlias;

        public TerminalNode FROM() {
            return getToken(ITLParser.FROM, 0);
        }

        public List<TerminalNode> ID() {
            return getTokens(ITLParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(ITLParser.ID, i);
        }

        public TerminalNode AS() {
            return getToken(ITLParser.AS, 0);
        }

        public FromContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_from;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterFrom(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitFrom(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitFrom(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FromContext from() throws RecognitionException {
        FromContext _localctx = new FromContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_from);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(36);
                match(FROM);
                setState(37);
                ((FromContext) _localctx).fromSource = match(ID);
                setState(40);
                _la = _input.LA(1);
                if (_la == AS) {
                    {
                        setState(38);
                        match(AS);
                        setState(39);
                        ((FromContext) _localctx).fromAlias = match(ID);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WhereContext extends ParserRuleContext {
        public TerminalNode WHERE() {
            return getToken(ITLParser.WHERE, 0);
        }

        public BoolExprContext boolExpr() {
            return getRuleContext(BoolExprContext.class, 0);
        }

        public WhereContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_where;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterWhere(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitWhere(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitWhere(this);
            else return visitor.visitChildren(this);
        }
    }

    public final WhereContext where() throws RecognitionException {
        WhereContext _localctx = new WhereContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_where);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(42);
                match(WHERE);
                setState(43);
                boolExpr(0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PropsSelContext extends ParserRuleContext {
        public PropVarContext propVar() {
            return getRuleContext(PropVarContext.class, 0);
        }

        public TerminalNode AS() {
            return getToken(ITLParser.AS, 0);
        }

        public TerminalNode ID() {
            return getToken(ITLParser.ID, 0);
        }

        public PropsSelContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_propsSel;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterPropsSel(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitPropsSel(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitPropsSel(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PropsSelContext propsSel() throws RecognitionException {
        PropsSelContext _localctx = new PropsSelContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_propsSel);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(45);
                propVar(0);
                setState(48);
                _la = _input.LA(1);
                if (_la == AS) {
                    {
                        setState(46);
                        match(AS);
                        setState(47);
                        match(ID);
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PropVarContext extends ParserRuleContext {
        public PropVarContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_propVar;
        }

        public PropVarContext() {
        }

        public void copyFrom(PropVarContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class FloatVarContext extends PropVarContext {
        public TerminalNode FloatingPointLiteral() {
            return getToken(ITLParser.FloatingPointLiteral, 0);
        }

        public FloatVarContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterFloatVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitFloatVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitFloatVar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NullVarContext extends PropVarContext {
        public TerminalNode NULL() {
            return getToken(ITLParser.NULL, 0);
        }

        public NullVarContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterNullVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitNullVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitNullVar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class CharVarContext extends PropVarContext {
        public TerminalNode CharacterLiteral() {
            return getToken(ITLParser.CharacterLiteral, 0);
        }

        public CharVarContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterCharVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitCharVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitCharVar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FuncVarContext extends PropVarContext {
        public TerminalNode ID() {
            return getToken(ITLParser.ID, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(ITLParser.LPAREN, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ITLParser.RPAREN, 0);
        }

        public List<PropFullNameContext> propFullName() {
            return getRuleContexts(PropFullNameContext.class);
        }

        public PropFullNameContext propFullName(int i) {
            return getRuleContext(PropFullNameContext.class, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(ITLParser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(ITLParser.COMMA, i);
        }

        public FuncVarContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterFuncVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitFuncVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitFuncVar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class MulDivContext extends PropVarContext {
        public Token op;

        public List<PropVarContext> propVar() {
            return getRuleContexts(PropVarContext.class);
        }

        public PropVarContext propVar(int i) {
            return getRuleContext(PropVarContext.class, i);
        }

        public TerminalNode MUL() {
            return getToken(ITLParser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(ITLParser.DIV, 0);
        }

        public MulDivContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterMulDiv(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitMulDiv(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitMulDiv(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AddSubContext extends PropVarContext {
        public Token op;

        public List<PropVarContext> propVar() {
            return getRuleContexts(PropVarContext.class);
        }

        public PropVarContext propVar(int i) {
            return getRuleContext(PropVarContext.class, i);
        }

        public TerminalNode ADD() {
            return getToken(ITLParser.ADD, 0);
        }

        public TerminalNode SUB() {
            return getToken(ITLParser.SUB, 0);
        }

        public AddSubContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterAddSub(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitAddSub(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitAddSub(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParensContext extends PropVarContext {
        public TerminalNode LPAREN() {
            return getToken(ITLParser.LPAREN, 0);
        }

        public PropVarContext propVar() {
            return getRuleContext(PropVarContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ITLParser.RPAREN, 0);
        }

        public ParensContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterParens(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitParens(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitParens(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class DirectPropVarContext extends PropVarContext {
        public PropFullNameContext propFullName() {
            return getRuleContext(PropFullNameContext.class, 0);
        }

        public DirectPropVarContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterDirectPropVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitDirectPropVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitDirectPropVar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntVarContext extends PropVarContext {
        public IntegerLiteralContext integerLiteral() {
            return getRuleContext(IntegerLiteralContext.class, 0);
        }

        public IntVarContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterIntVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitIntVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitIntVar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class BooleanVarContext extends PropVarContext {
        public BooleanLiteralContext booleanLiteral() {
            return getRuleContext(BooleanLiteralContext.class, 0);
        }

        public BooleanVarContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterBooleanVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitBooleanVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitBooleanVar(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringVarContext extends PropVarContext {
        public TerminalNode StringLiteral() {
            return getToken(ITLParser.StringLiteral, 0);
        }

        public StringVarContext(PropVarContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterStringVar(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitStringVar(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitStringVar(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PropVarContext propVar() throws RecognitionException {
        return propVar(0);
    }

    private PropVarContext propVar(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        PropVarContext _localctx = new PropVarContext(_ctx, _parentState);
        PropVarContext _prevctx = _localctx;
        int _startState = 10;
        enterRecursionRule(_localctx, 10, RULE_propVar, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(75);
                switch (getInterpreter().adaptivePredict(_input, 6, _ctx)) {
                    case 1: {
                        _localctx = new DirectPropVarContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(51);
                        propFullName();
                    }
                    break;
                    case 2: {
                        _localctx = new ParensContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(52);
                        match(LPAREN);
                        setState(53);
                        propVar(0);
                        setState(54);
                        match(RPAREN);
                    }
                    break;
                    case 3: {
                        _localctx = new IntVarContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(56);
                        integerLiteral();
                    }
                    break;
                    case 4: {
                        _localctx = new FloatVarContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(57);
                        match(FloatingPointLiteral);
                    }
                    break;
                    case 5: {
                        _localctx = new CharVarContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(58);
                        match(CharacterLiteral);
                    }
                    break;
                    case 6: {
                        _localctx = new StringVarContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(59);
                        match(StringLiteral);
                    }
                    break;
                    case 7: {
                        _localctx = new BooleanVarContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(60);
                        booleanLiteral();
                    }
                    break;
                    case 8: {
                        _localctx = new NullVarContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(61);
                        match(NULL);
                    }
                    break;
                    case 9: {
                        _localctx = new FuncVarContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(62);
                        match(ID);
                        setState(63);
                        match(LPAREN);
                        setState(65);
                        _la = _input.LA(1);
                        if (_la == ID) {
                            {
                                setState(64);
                                propFullName();
                            }
                        }

                        setState(71);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(67);
                                    match(COMMA);
                                    setState(68);
                                    propFullName();
                                }
                            }
                            setState(73);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(74);
                        match(RPAREN);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(85);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(83);
                            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                                case 1: {
                                    _localctx = new MulDivContext(new PropVarContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_propVar);
                                    setState(77);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(78);
                                    ((MulDivContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == MUL || _la == DIV)) {
                                        ((MulDivContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    }
                                    consume();
                                    setState(79);
                                    propVar(10);
                                }
                                break;
                                case 2: {
                                    _localctx = new AddSubContext(new PropVarContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_propVar);
                                    setState(80);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(81);
                                    ((AddSubContext) _localctx).op = _input.LT(1);
                                    _la = _input.LA(1);
                                    if (!(_la == ADD || _la == SUB)) {
                                        ((AddSubContext) _localctx).op = (Token) _errHandler.recoverInline(this);
                                    }
                                    consume();
                                    setState(82);
                                    propVar(9);
                                }
                                break;
                            }
                        }
                    }
                    setState(87);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 8, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class PropFullNameContext extends ParserRuleContext {
        public List<PropNameContext> propName() {
            return getRuleContexts(PropNameContext.class);
        }

        public PropNameContext propName(int i) {
            return getRuleContext(PropNameContext.class, i);
        }

        public List<TerminalNode> DOT() {
            return getTokens(ITLParser.DOT);
        }

        public TerminalNode DOT(int i) {
            return getToken(ITLParser.DOT, i);
        }

        public PropFullNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_propFullName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterPropFullName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitPropFullName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitPropFullName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PropFullNameContext propFullName() throws RecognitionException {
        PropFullNameContext _localctx = new PropFullNameContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_propFullName);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(88);
                propName();
                setState(93);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(89);
                                match(DOT);
                                setState(90);
                                propName();
                            }
                        }
                    }
                    setState(95);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 9, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class PropNameContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(ITLParser.ID, 0);
        }

        public List<TerminalNode> LBRACK() {
            return getTokens(ITLParser.LBRACK);
        }

        public TerminalNode LBRACK(int i) {
            return getToken(ITLParser.LBRACK, i);
        }

        public List<IntegerLiteralContext> integerLiteral() {
            return getRuleContexts(IntegerLiteralContext.class);
        }

        public IntegerLiteralContext integerLiteral(int i) {
            return getRuleContext(IntegerLiteralContext.class, i);
        }

        public List<TerminalNode> RBRACK() {
            return getTokens(ITLParser.RBRACK);
        }

        public TerminalNode RBRACK(int i) {
            return getToken(ITLParser.RBRACK, i);
        }

        public PropNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_propName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterPropName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitPropName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitPropName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final PropNameContext propName() throws RecognitionException {
        PropNameContext _localctx = new PropNameContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_propName);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(96);
                match(ID);
                setState(103);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(97);
                                match(LBRACK);
                                setState(98);
                                integerLiteral();
                                setState(99);
                                match(RBRACK);
                            }
                        }
                    }
                    setState(105);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BoolExprContext extends ParserRuleContext {
        public BoolExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_boolExpr;
        }

        public BoolExprContext() {
        }

        public void copyFrom(BoolExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class CompareBoolContext extends BoolExprContext {
        public Token compareOpr;

        public List<PropVarContext> propVar() {
            return getRuleContexts(PropVarContext.class);
        }

        public PropVarContext propVar(int i) {
            return getRuleContext(PropVarContext.class, i);
        }

        public TerminalNode EQUALS() {
            return getToken(ITLParser.EQUALS, 0);
        }

        public TerminalNode BIGGER() {
            return getToken(ITLParser.BIGGER, 0);
        }

        public TerminalNode SMALLER() {
            return getToken(ITLParser.SMALLER, 0);
        }

        public TerminalNode BIGGEROREQ() {
            return getToken(ITLParser.BIGGEROREQ, 0);
        }

        public TerminalNode SMALLEROREQ() {
            return getToken(ITLParser.SMALLEROREQ, 0);
        }

        public TerminalNode NOTEQUAL() {
            return getToken(ITLParser.NOTEQUAL, 0);
        }

        public CompareBoolContext(BoolExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterCompareBool(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitCompareBool(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitCompareBool(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ParenBoolContext extends BoolExprContext {
        public TerminalNode LPAREN() {
            return getToken(ITLParser.LPAREN, 0);
        }

        public BoolExprContext boolExpr() {
            return getRuleContext(BoolExprContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(ITLParser.RPAREN, 0);
        }

        public ParenBoolContext(BoolExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterParenBool(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitParenBool(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitParenBool(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprBoolContext extends BoolExprContext {
        public Token boolOprt;

        public List<BoolExprContext> boolExpr() {
            return getRuleContexts(BoolExprContext.class);
        }

        public BoolExprContext boolExpr(int i) {
            return getRuleContext(BoolExprContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(ITLParser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(ITLParser.OR, 0);
        }

        public ExprBoolContext(BoolExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterExprBool(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitExprBool(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitExprBool(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NotBoolContext extends BoolExprContext {
        public TerminalNode NOT() {
            return getToken(ITLParser.NOT, 0);
        }

        public BoolExprContext boolExpr() {
            return getRuleContext(BoolExprContext.class, 0);
        }

        public NotBoolContext(BoolExprContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterNotBool(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitNotBool(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitNotBool(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BoolExprContext boolExpr() throws RecognitionException {
        return boolExpr(0);
    }

    private BoolExprContext boolExpr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        BoolExprContext _localctx = new BoolExprContext(_ctx, _parentState);
        BoolExprContext _prevctx = _localctx;
        int _startState = 16;
        enterRecursionRule(_localctx, 16, RULE_boolExpr, _p);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                switch (getInterpreter().adaptivePredict(_input, 11, _ctx)) {
                    case 1: {
                        _localctx = new NotBoolContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(107);
                        match(NOT);
                        setState(108);
                        boolExpr(3);
                    }
                    break;
                    case 2: {
                        _localctx = new CompareBoolContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(109);
                        propVar(0);
                        setState(110);
                        ((CompareBoolContext) _localctx).compareOpr = _input.LT(1);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << BIGGER) | (1L << SMALLER) | (1L << BIGGEROREQ) | (1L << SMALLEROREQ) | (1L << NOTEQUAL))) != 0))) {
                            ((CompareBoolContext) _localctx).compareOpr = (Token) _errHandler.recoverInline(this);
                        }
                        consume();
                        setState(111);
                        propVar(0);
                    }
                    break;
                    case 3: {
                        _localctx = new ParenBoolContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(113);
                        match(LPAREN);
                        setState(114);
                        boolExpr(0);
                        setState(115);
                        match(RPAREN);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(124);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new ExprBoolContext(new BoolExprContext(_parentctx, _parentState));
                                pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
                                setState(119);
                                if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                                setState(120);
                                ((ExprBoolContext) _localctx).boolOprt = _input.LT(1);
                                _la = _input.LA(1);
                                if (!(_la == AND || _la == OR)) {
                                    ((ExprBoolContext) _localctx).boolOprt = (Token) _errHandler.recoverInline(this);
                                }
                                consume();
                                setState(121);
                                boolExpr(2);
                            }
                        }
                    }
                    setState(126);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 12, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class IntegerLiteralContext extends ParserRuleContext {
        public TerminalNode HexLiteral() {
            return getToken(ITLParser.HexLiteral, 0);
        }

        public TerminalNode OctalLiteral() {
            return getToken(ITLParser.OctalLiteral, 0);
        }

        public TerminalNode DecimalLiteral() {
            return getToken(ITLParser.DecimalLiteral, 0);
        }

        public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_integerLiteral;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterIntegerLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitIntegerLiteral(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitIntegerLiteral(this);
            else return visitor.visitChildren(this);
        }
    }

    public final IntegerLiteralContext integerLiteral() throws RecognitionException {
        IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_integerLiteral);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(127);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HexLiteral) | (1L << DecimalLiteral) | (1L << OctalLiteral))) != 0))) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class BooleanLiteralContext extends ParserRuleContext {
        public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_booleanLiteral;
        }

        public BooleanLiteralContext() {
        }

        public void copyFrom(BooleanLiteralContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class TrueBoolContext extends BooleanLiteralContext {
        public TerminalNode TRUE() {
            return getToken(ITLParser.TRUE, 0);
        }

        public TrueBoolContext(BooleanLiteralContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterTrueBool(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitTrueBool(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitTrueBool(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FalseBoolContext extends BooleanLiteralContext {
        public TerminalNode FALSE() {
            return getToken(ITLParser.FALSE, 0);
        }

        public FalseBoolContext(BooleanLiteralContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).enterFalseBool(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ITLListener) ((ITLListener) listener).exitFalseBool(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ITLVisitor) return ((ITLVisitor<? extends T>) visitor).visitFalseBool(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
        BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_booleanLiteral);
        try {
            setState(131);
            switch (_input.LA(1)) {
                case TRUE:
                    _localctx = new TrueBoolContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(129);
                    match(TRUE);
                }
                break;
                case FALSE:
                    _localctx = new FalseBoolContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(130);
                    match(FALSE);
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 5:
                return propVar_sempred((PropVarContext) _localctx, predIndex);
            case 8:
                return boolExpr_sempred((BoolExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean propVar_sempred(PropVarContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 9);
            case 1:
                return precpred(_ctx, 8);
        }
        return true;
    }

    private boolean boolExpr_sempred(BoolExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 2:
                return precpred(_ctx, 1);
        }
        return true;
    }

    public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u0088\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\4\f\t\f\3\2\3\2\3\2\5\2\34\n\2\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3" +
                    "%\13\3\3\4\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6\63\n\6\3\7" +
                    "\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7D\n\7\3\7" +
                    "\3\7\7\7H\n\7\f\7\16\7K\13\7\3\7\5\7N\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7" +
                    "V\n\7\f\7\16\7Y\13\7\3\b\3\b\3\b\7\b^\n\b\f\b\16\ba\13\b\3\t\3\t\3\t\3" +
                    "\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n" +
                    "\3\n\5\nx\n\n\3\n\3\n\3\n\7\n}\n\n\f\n\16\n\u0080\13\n\3\13\3\13\3\f\3" +
                    "\f\5\f\u0086\n\f\3\f\2\4\f\22\r\2\4\6\b\n\f\16\20\22\24\26\2\7\3\2\31" +
                    "\32\3\2\33\34\3\2\3\b\3\2\n\13\3\2\35\37\u0092\2\30\3\2\2\2\4\35\3\2\2" +
                    "\2\6&\3\2\2\2\b,\3\2\2\2\n/\3\2\2\2\fM\3\2\2\2\16Z\3\2\2\2\20b\3\2\2\2" +
                    "\22w\3\2\2\2\24\u0081\3\2\2\2\26\u0085\3\2\2\2\30\31\5\4\3\2\31\33\5\6" +
                    "\4\2\32\34\5\b\5\2\33\32\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\36\7\f" +
                    "\2\2\36#\5\n\6\2\37 \7\r\2\2 \"\5\n\6\2!\37\3\2\2\2\"%\3\2\2\2#!\3\2\2" +
                    "\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&\'\7\16\2\2\'*\7#\2\2()\7\20\2\2)+\7" +
                    "#\2\2*(\3\2\2\2*+\3\2\2\2+\7\3\2\2\2,-\7\17\2\2-.\5\22\n\2.\t\3\2\2\2" +
                    "/\62\5\f\7\2\60\61\7\20\2\2\61\63\7#\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63" +
                    "\13\3\2\2\2\64\65\b\7\1\2\65N\5\16\b\2\66\67\7\21\2\2\678\5\f\7\289\7" +
                    "\22\2\29N\3\2\2\2:N\5\24\13\2;N\7 \2\2<N\7!\2\2=N\7\"\2\2>N\5\26\f\2?" +
                    "N\7\30\2\2@A\7#\2\2AC\7\21\2\2BD\5\16\b\2CB\3\2\2\2CD\3\2\2\2DI\3\2\2" +
                    "\2EF\7\r\2\2FH\5\16\b\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2" +
                    "\2\2KI\3\2\2\2LN\7\22\2\2M\64\3\2\2\2M\66\3\2\2\2M:\3\2\2\2M;\3\2\2\2" +
                    "M<\3\2\2\2M=\3\2\2\2M>\3\2\2\2M?\3\2\2\2M@\3\2\2\2NW\3\2\2\2OP\f\13\2" +
                    "\2PQ\t\2\2\2QV\5\f\7\fRS\f\n\2\2ST\t\3\2\2TV\5\f\7\13UO\3\2\2\2UR\3\2" +
                    "\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\r\3\2\2\2YW\3\2\2\2Z_\5\20\t\2[\\" +
                    "\7\23\2\2\\^\5\20\t\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\17\3\2" +
                    "\2\2a_\3\2\2\2bi\7#\2\2cd\7\24\2\2de\5\24\13\2ef\7\25\2\2fh\3\2\2\2gc" +
                    "\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\21\3\2\2\2ki\3\2\2\2lm\b\n\1\2" +
                    "mn\7\t\2\2nx\5\22\n\5op\5\f\7\2pq\t\4\2\2qr\5\f\7\2rx\3\2\2\2st\7\21\2" +
                    "\2tu\5\22\n\2uv\7\22\2\2vx\3\2\2\2wl\3\2\2\2wo\3\2\2\2ws\3\2\2\2x~\3\2" +
                    "\2\2yz\f\3\2\2z{\t\5\2\2{}\5\22\n\4|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2" +
                    "~\177\3\2\2\2\177\23\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\t\6\2\2\u0082" +
                    "\25\3\2\2\2\u0083\u0086\7\26\2\2\u0084\u0086\7\27\2\2\u0085\u0083\3\2" +
                    "\2\2\u0085\u0084\3\2\2\2\u0086\27\3\2\2\2\20\33#*\62CIMUW_iw~\u0085";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}