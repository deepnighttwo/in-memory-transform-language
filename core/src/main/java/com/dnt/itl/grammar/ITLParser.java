// Generated from G:/mymise/in-memory-transfer-language/core/src/main/java/com/dnt/itl/grammar\ITL.g4 by ANTLR 4.5
package com.dnt.itl.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ITLParser extends Parser {
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

	@Override
	public String getGrammarFileName() { return "ITL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ITLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class QlContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public QlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterQl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitQl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitQl(this);
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
			if (_la==WHERE) {
				{
				setState(24); 
				where();
				}
			}

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

	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ITLParser.SELECT, 0); }
		public List<PropsSelContext> propsSel() {
			return getRuleContexts(PropsSelContext.class);
		}
		public PropsSelContext propsSel(int i) {
			return getRuleContext(PropsSelContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ITLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ITLParser.COMMA, i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitSelect(this);
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
			while (_la==COMMA) {
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

	public static class FromContext extends ParserRuleContext {
		public Token fromSource;
		public Token fromAlias;
		public TerminalNode FROM() { return getToken(ITLParser.FROM, 0); }
		public List<TerminalNode> ID() { return getTokens(ITLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ITLParser.ID, i);
		}
		public TerminalNode AS() { return getToken(ITLParser.AS, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitFrom(this);
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
			((FromContext)_localctx).fromSource = match(ID);
			setState(40);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(38); 
				match(AS);
				setState(39); 
				((FromContext)_localctx).fromAlias = match(ID);
				}
			}

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

	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ITLParser.WHERE, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitWhere(this);
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

	public static class PropsSelContext extends ParserRuleContext {
		public PropVarContext propVar() {
			return getRuleContext(PropVarContext.class,0);
		}
		public TerminalNode AS() { return getToken(ITLParser.AS, 0); }
		public TerminalNode ID() { return getToken(ITLParser.ID, 0); }
		public PropsSelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsSel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterPropsSel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitPropsSel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitPropsSel(this);
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
			if (_la==AS) {
				{
				setState(46); 
				match(AS);
				setState(47); 
				match(ID);
				}
			}

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

	public static class PropVarContext extends ParserRuleContext {
		public PropVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propVar; }
	 
		public PropVarContext() { }
		public void copyFrom(PropVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FloatVarContext extends PropVarContext {
		public TerminalNode FloatingPointLiteral() { return getToken(ITLParser.FloatingPointLiteral, 0); }
		public FloatVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterFloatVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitFloatVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitFloatVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends PropVarContext {
		public Token op;
		public List<PropVarContext> propVar() {
			return getRuleContexts(PropVarContext.class);
		}
		public PropVarContext propVar(int i) {
			return getRuleContext(PropVarContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ITLParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ITLParser.DIV, 0); }
		public MulDivContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends PropVarContext {
		public Token op;
		public List<PropVarContext> propVar() {
			return getRuleContexts(PropVarContext.class);
		}
		public PropVarContext propVar(int i) {
			return getRuleContext(PropVarContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ITLParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ITLParser.SUB, 0); }
		public AddSubContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends PropVarContext {
		public TerminalNode LPAREN() { return getToken(ITLParser.LPAREN, 0); }
		public PropVarContext propVar() {
			return getRuleContext(PropVarContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ITLParser.RPAREN, 0); }
		public ParensContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapFuncVarContext extends PropVarContext {
		public TerminalNode MAP() { return getToken(ITLParser.MAP, 0); }
		public TerminalNode LPAREN() { return getToken(ITLParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(ITLParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ITLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ITLParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(ITLParser.RPAREN, 0); }
		public List<PropVarContext> propVar() {
			return getRuleContexts(PropVarContext.class);
		}
		public PropVarContext propVar(int i) {
			return getRuleContext(PropVarContext.class,i);
		}
		public MapFuncVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterMapFuncVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitMapFuncVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitMapFuncVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReduceFuncVarContext extends PropVarContext {
		public TerminalNode REDUCE() { return getToken(ITLParser.REDUCE, 0); }
		public TerminalNode LPAREN() { return getToken(ITLParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(ITLParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ITLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ITLParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(ITLParser.RPAREN, 0); }
		public List<PropVarContext> propVar() {
			return getRuleContexts(PropVarContext.class);
		}
		public PropVarContext propVar(int i) {
			return getRuleContext(PropVarContext.class,i);
		}
		public ReduceFuncVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterReduceFuncVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitReduceFuncVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitReduceFuncVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntVarContext extends PropVarContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public IntVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterIntVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitIntVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitIntVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullVarContext extends PropVarContext {
		public TerminalNode NULL() { return getToken(ITLParser.NULL, 0); }
		public NullVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterNullVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitNullVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitNullVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharVarContext extends PropVarContext {
		public TerminalNode CharacterLiteral() { return getToken(ITLParser.CharacterLiteral, 0); }
		public CharVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterCharVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitCharVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitCharVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncVarContext extends PropVarContext {
		public TerminalNode ID() { return getToken(ITLParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ITLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ITLParser.RPAREN, 0); }
		public List<PropVarContext> propVar() {
			return getRuleContexts(PropVarContext.class);
		}
		public PropVarContext propVar(int i) {
			return getRuleContext(PropVarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ITLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ITLParser.COMMA, i);
		}
		public FuncVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterFuncVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitFuncVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitFuncVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectPropVarContext extends PropVarContext {
		public PropFullNameContext propFullName() {
			return getRuleContext(PropFullNameContext.class,0);
		}
		public DirectPropVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterDirectPropVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitDirectPropVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitDirectPropVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanVarContext extends PropVarContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterBooleanVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitBooleanVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitBooleanVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringVarContext extends PropVarContext {
		public TerminalNode StringLiteral() { return getToken(ITLParser.StringLiteral, 0); }
		public StringVarContext(PropVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterStringVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitStringVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitStringVar(this);
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
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new DirectPropVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(51); 
				propFullName();
				}
				break;
			case 2:
				{
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
			case 3:
				{
				_localctx = new IntVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56); 
				integerLiteral();
				}
				break;
			case 4:
				{
				_localctx = new FloatVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(57); 
				match(FloatingPointLiteral);
				}
				break;
			case 5:
				{
				_localctx = new CharVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58); 
				match(CharacterLiteral);
				}
				break;
			case 6:
				{
				_localctx = new StringVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59); 
				match(StringLiteral);
				}
				break;
			case 7:
				{
				_localctx = new BooleanVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60); 
				booleanLiteral();
				}
				break;
			case 8:
				{
				_localctx = new NullVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61); 
				match(NULL);
				}
				break;
			case 9:
				{
				_localctx = new MapFuncVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62); 
				match(MAP);
				setState(63); 
				match(LPAREN);
				setState(64); 
				match(ID);
				setState(65); 
				match(COMMA);
				setState(67);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MAP) | (1L << REDUCE) | (1L << HexLiteral) | (1L << DecimalLiteral) | (1L << OctalLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << ID))) != 0)) {
					{
					setState(66); 
					propVar(0);
					}
				}

				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(69); 
					match(COMMA);
					setState(70); 
					propVar(0);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(76); 
				match(RPAREN);
				}
				break;
			case 10:
				{
				_localctx = new ReduceFuncVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77); 
				match(REDUCE);
				setState(78); 
				match(LPAREN);
				setState(79); 
				match(ID);
				setState(80); 
				match(COMMA);
				setState(82);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MAP) | (1L << REDUCE) | (1L << HexLiteral) | (1L << DecimalLiteral) | (1L << OctalLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << ID))) != 0)) {
					{
					setState(81); 
					propVar(0);
					}
				}

				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(84); 
					match(COMMA);
					setState(85); 
					propVar(0);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91); 
				match(RPAREN);
				}
				break;
			case 11:
				{
				_localctx = new FuncVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92); 
				match(ID);
				setState(93); 
				match(LPAREN);
				setState(95);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MAP) | (1L << REDUCE) | (1L << HexLiteral) | (1L << DecimalLiteral) | (1L << OctalLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << ID))) != 0)) {
					{
					setState(94); 
					propVar(0);
					}
				}

				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(97); 
					match(COMMA);
					setState(98); 
					propVar(0);
					}
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(104); 
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(113);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new PropVarContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propVar);
						setState(107);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(108);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(109); 
						propVar(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new PropVarContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propVar);
						setState(110);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(111);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(112); 
						propVar(11);
						}
						break;
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PropFullNameContext extends ParserRuleContext {
		public List<PropNameContext> propName() {
			return getRuleContexts(PropNameContext.class);
		}
		public PropNameContext propName(int i) {
			return getRuleContext(PropNameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ITLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ITLParser.DOT, i);
		}
		public PropFullNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propFullName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterPropFullName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitPropFullName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitPropFullName(this);
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
			setState(118); 
			propName();
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119); 
					match(DOT);
					setState(120); 
					propName();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
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

	public static class PropNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ITLParser.ID, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(ITLParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(ITLParser.LBRACK, i);
		}
		public List<IntegerLiteralContext> integerLiteral() {
			return getRuleContexts(IntegerLiteralContext.class);
		}
		public IntegerLiteralContext integerLiteral(int i) {
			return getRuleContext(IntegerLiteralContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(ITLParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(ITLParser.RBRACK, i);
		}
		public PropNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterPropName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitPropName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitPropName(this);
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
			setState(126); 
			match(ID);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127); 
					match(LBRACK);
					setState(128); 
					integerLiteral();
					setState(129); 
					match(RBRACK);
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
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

	public static class BoolExprContext extends ParserRuleContext {
		public BoolExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExpr; }
	 
		public BoolExprContext() { }
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
			return getRuleContext(PropVarContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(ITLParser.EQUALS, 0); }
		public TerminalNode BIGGER() { return getToken(ITLParser.BIGGER, 0); }
		public TerminalNode SMALLER() { return getToken(ITLParser.SMALLER, 0); }
		public TerminalNode BIGGEROREQ() { return getToken(ITLParser.BIGGEROREQ, 0); }
		public TerminalNode SMALLEROREQ() { return getToken(ITLParser.SMALLEROREQ, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ITLParser.NOTEQUAL, 0); }
		public CompareBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterCompareBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitCompareBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitCompareBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenBoolContext extends BoolExprContext {
		public TerminalNode LPAREN() { return getToken(ITLParser.LPAREN, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ITLParser.RPAREN, 0); }
		public ParenBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterParenBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitParenBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitParenBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprBoolContext extends BoolExprContext {
		public Token boolOprt;
		public List<BoolExprContext> boolExpr() {
			return getRuleContexts(BoolExprContext.class);
		}
		public BoolExprContext boolExpr(int i) {
			return getRuleContext(BoolExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(ITLParser.AND, 0); }
		public TerminalNode OR() { return getToken(ITLParser.OR, 0); }
		public ExprBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterExprBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitExprBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitExprBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotBoolContext extends BoolExprContext {
		public TerminalNode NOT() { return getToken(ITLParser.NOT, 0); }
		public BoolExprContext boolExpr() {
			return getRuleContext(BoolExprContext.class,0);
		}
		public NotBoolContext(BoolExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterNotBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitNotBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitNotBool(this);
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
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new NotBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137); 
				match(NOT);
				setState(138); 
				boolExpr(3);
				}
				break;
			case 2:
				{
				_localctx = new CompareBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139); 
				propVar(0);
				setState(140);
				((CompareBoolContext)_localctx).compareOpr = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << BIGGER) | (1L << SMALLER) | (1L << BIGGEROREQ) | (1L << SMALLEROREQ) | (1L << NOTEQUAL))) != 0)) ) {
					((CompareBoolContext)_localctx).compareOpr = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(141); 
				propVar(0);
				}
				break;
			case 3:
				{
				_localctx = new ParenBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143); 
				match(LPAREN);
				setState(144); 
				boolExpr(0);
				setState(145); 
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprBoolContext(new BoolExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(149);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(150);
					((ExprBoolContext)_localctx).boolOprt = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((ExprBoolContext)_localctx).boolOprt = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(151); 
					boolExpr(2);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode HexLiteral() { return getToken(ITLParser.HexLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(ITLParser.OctalLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(ITLParser.DecimalLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitIntegerLiteral(this);
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
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HexLiteral) | (1L << DecimalLiteral) | (1L << OctalLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
	 
		public BooleanLiteralContext() { }
		public void copyFrom(BooleanLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueBoolContext extends BooleanLiteralContext {
		public TerminalNode TRUE() { return getToken(ITLParser.TRUE, 0); }
		public TrueBoolContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterTrueBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitTrueBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitTrueBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseBoolContext extends BooleanLiteralContext {
		public TerminalNode FALSE() { return getToken(ITLParser.FALSE, 0); }
		public FalseBoolContext(BooleanLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterFalseBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitFalseBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitFalseBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_booleanLiteral);
		try {
			setState(161);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159); 
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160); 
				match(FALSE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: 
			return propVar_sempred((PropVarContext)_localctx, predIndex);
		case 8: 
			return boolExpr_sempred((BoolExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean propVar_sempred(PropVarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: 
			return precpred(_ctx, 11);
		case 1: 
			return precpred(_ctx, 10);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00a6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\5\2\34\n\2\3\3\3\3\3\3\3\3\7\3\"\n\3\f\3\16\3"+
		"%\13\3\3\4\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6\63\n\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7F"+
		"\n\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7U\n\7"+
		"\3\7\3\7\7\7Y\n\7\f\7\16\7\\\13\7\3\7\3\7\3\7\3\7\5\7b\n\7\3\7\3\7\7\7"+
		"f\n\7\f\7\16\7i\13\7\3\7\5\7l\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7t\n\7\f\7"+
		"\16\7w\13\7\3\b\3\b\3\b\7\b|\n\b\f\b\16\b\177\13\b\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0086\n\t\f\t\16\t\u0089\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u0096\n\n\3\n\3\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3"+
		"\13\3\13\3\f\3\f\5\f\u00a4\n\f\3\f\2\4\f\22\r\2\4\6\b\n\f\16\20\22\24"+
		"\26\2\7\3\2\31\32\3\2\33\34\3\2\3\b\3\2\n\13\3\2\37!\u00b6\2\30\3\2\2"+
		"\2\4\35\3\2\2\2\6&\3\2\2\2\b,\3\2\2\2\n/\3\2\2\2\fk\3\2\2\2\16x\3\2\2"+
		"\2\20\u0080\3\2\2\2\22\u0095\3\2\2\2\24\u009f\3\2\2\2\26\u00a3\3\2\2\2"+
		"\30\31\5\4\3\2\31\33\5\6\4\2\32\34\5\b\5\2\33\32\3\2\2\2\33\34\3\2\2\2"+
		"\34\3\3\2\2\2\35\36\7\f\2\2\36#\5\n\6\2\37 \7\r\2\2 \"\5\n\6\2!\37\3\2"+
		"\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\5\3\2\2\2%#\3\2\2\2&\'\7\16\2\2\'"+
		"*\7%\2\2()\7\20\2\2)+\7%\2\2*(\3\2\2\2*+\3\2\2\2+\7\3\2\2\2,-\7\17\2\2"+
		"-.\5\22\n\2.\t\3\2\2\2/\62\5\f\7\2\60\61\7\20\2\2\61\63\7%\2\2\62\60\3"+
		"\2\2\2\62\63\3\2\2\2\63\13\3\2\2\2\64\65\b\7\1\2\65l\5\16\b\2\66\67\7"+
		"\21\2\2\678\5\f\7\289\7\22\2\29l\3\2\2\2:l\5\24\13\2;l\7\"\2\2<l\7#\2"+
		"\2=l\7$\2\2>l\5\26\f\2?l\7\30\2\2@A\7\35\2\2AB\7\21\2\2BC\7%\2\2CE\7\r"+
		"\2\2DF\5\f\7\2ED\3\2\2\2EF\3\2\2\2FK\3\2\2\2GH\7\r\2\2HJ\5\f\7\2IG\3\2"+
		"\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LN\3\2\2\2MK\3\2\2\2Nl\7\22\2\2OP\7"+
		"\36\2\2PQ\7\21\2\2QR\7%\2\2RT\7\r\2\2SU\5\f\7\2TS\3\2\2\2TU\3\2\2\2UZ"+
		"\3\2\2\2VW\7\r\2\2WY\5\f\7\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[]\3\2\2\2\\Z\3\2\2\2]l\7\22\2\2^_\7%\2\2_a\7\21\2\2`b\5\f\7\2a`\3\2\2"+
		"\2ab\3\2\2\2bg\3\2\2\2cd\7\r\2\2df\5\f\7\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2"+
		"\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jl\7\22\2\2k\64\3\2\2\2k\66\3\2\2\2k:"+
		"\3\2\2\2k;\3\2\2\2k<\3\2\2\2k=\3\2\2\2k>\3\2\2\2k?\3\2\2\2k@\3\2\2\2k"+
		"O\3\2\2\2k^\3\2\2\2lu\3\2\2\2mn\f\r\2\2no\t\2\2\2ot\5\f\7\16pq\f\f\2\2"+
		"qr\t\3\2\2rt\5\f\7\rsm\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2"+
		"v\r\3\2\2\2wu\3\2\2\2x}\5\20\t\2yz\7\23\2\2z|\5\20\t\2{y\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\17\3\2\2\2\177}\3\2\2\2\u0080\u0087\7%\2"+
		"\2\u0081\u0082\7\24\2\2\u0082\u0083\5\24\13\2\u0083\u0084\7\25\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\21\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b"+
		"\b\n\1\2\u008b\u008c\7\t\2\2\u008c\u0096\5\22\n\5\u008d\u008e\5\f\7\2"+
		"\u008e\u008f\t\4\2\2\u008f\u0090\5\f\7\2\u0090\u0096\3\2\2\2\u0091\u0092"+
		"\7\21\2\2\u0092\u0093\5\22\n\2\u0093\u0094\7\22\2\2\u0094\u0096\3\2\2"+
		"\2\u0095\u008a\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u009c"+
		"\3\2\2\2\u0097\u0098\f\3\2\2\u0098\u0099\t\5\2\2\u0099\u009b\5\22\n\4"+
		"\u009a\u0097\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\23\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\t\6\2\2\u00a0"+
		"\25\3\2\2\2\u00a1\u00a4\7\26\2\2\u00a2\u00a4\7\27\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a4\27\3\2\2\2\24\33#*\62EKTZagksu}\u0087\u0095"+
		"\u009c\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}