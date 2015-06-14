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
		DIV=24, ADD=25, SUB=26, MAP=27, REDUCE=28, ON=29, USING=30, HexLiteral=31, 
		DecimalLiteral=32, OctalLiteral=33, FloatingPointLiteral=34, CharacterLiteral=35, 
		StringLiteral=36, ID=37, WS=38;
	public static final int
		RULE_ql = 0, RULE_select = 1, RULE_from = 2, RULE_where = 3, RULE_propsSel = 4, 
		RULE_propVar = 5, RULE_collectionAgg = 6, RULE_propFullName = 7, RULE_propName = 8, 
		RULE_boolExpr = 9, RULE_integerLiteral = 10, RULE_booleanLiteral = 11;
	public static final String[] ruleNames = {
		"ql", "select", "from", "where", "propsSel", "propVar", "collectionAgg", 
		"propFullName", "propName", "boolExpr", "integerLiteral", "booleanLiteral"
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
			setState(24); 
			select();
			setState(25); 
			from();
			setState(27);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(26); 
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
			setState(29); 
			match(SELECT);
			setState(30); 
			propsSel();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(31); 
				match(COMMA);
				setState(32); 
				propsSel();
				}
				}
				setState(37);
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
			setState(38); 
			match(FROM);
			setState(39); 
			((FromContext)_localctx).fromSource = match(ID);
			setState(42);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(40); 
				match(AS);
				setState(41); 
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
			setState(44); 
			match(WHERE);
			setState(45); 
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
			setState(47); 
			propVar(0);
			setState(50);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(48); 
				match(AS);
				setState(49); 
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
		public TerminalNode ON() { return getToken(ITLParser.ON, 0); }
		public PropFullNameContext propFullName() {
			return getRuleContext(PropFullNameContext.class,0);
		}
		public TerminalNode USING() { return getToken(ITLParser.USING, 0); }
		public TerminalNode ID() { return getToken(ITLParser.ID, 0); }
		public CollectionAggContext collectionAgg() {
			return getRuleContext(CollectionAggContext.class,0);
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
		public TerminalNode ON() { return getToken(ITLParser.ON, 0); }
		public PropFullNameContext propFullName() {
			return getRuleContext(PropFullNameContext.class,0);
		}
		public TerminalNode USING() { return getToken(ITLParser.USING, 0); }
		public TerminalNode ID() { return getToken(ITLParser.ID, 0); }
		public CollectionAggContext collectionAgg() {
			return getRuleContext(CollectionAggContext.class,0);
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
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new DirectPropVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(53); 
				propFullName();
				}
				break;
			case 2:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54); 
				match(LPAREN);
				setState(55); 
				propVar(0);
				setState(56); 
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new IntVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(58); 
				integerLiteral();
				}
				break;
			case 4:
				{
				_localctx = new FloatVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(59); 
				match(FloatingPointLiteral);
				}
				break;
			case 5:
				{
				_localctx = new CharVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60); 
				match(CharacterLiteral);
				}
				break;
			case 6:
				{
				_localctx = new StringVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61); 
				match(StringLiteral);
				}
				break;
			case 7:
				{
				_localctx = new BooleanVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62); 
				booleanLiteral();
				}
				break;
			case 8:
				{
				_localctx = new NullVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63); 
				match(NULL);
				}
				break;
			case 9:
				{
				_localctx = new MapFuncVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64); 
				match(MAP);
				setState(65); 
				match(ON);
				setState(66); 
				propFullName();
				setState(67); 
				match(USING);
				setState(68); 
				match(ID);
				setState(69); 
				collectionAgg();
				}
				break;
			case 10:
				{
				_localctx = new ReduceFuncVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71); 
				match(REDUCE);
				setState(72); 
				match(ON);
				setState(73); 
				propFullName();
				setState(74); 
				match(USING);
				setState(75); 
				match(ID);
				setState(76); 
				collectionAgg();
				}
				break;
			case 11:
				{
				_localctx = new FuncVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(78); 
				match(ID);
				setState(79); 
				match(LPAREN);
				setState(81);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MAP) | (1L << REDUCE) | (1L << HexLiteral) | (1L << DecimalLiteral) | (1L << OctalLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << ID))) != 0)) {
					{
					setState(80); 
					propVar(0);
					}
				}

				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(83); 
					match(COMMA);
					setState(84); 
					propVar(0);
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90); 
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new PropVarContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propVar);
						setState(93);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(94);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(95); 
						propVar(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new PropVarContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_propVar);
						setState(96);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(97);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(98); 
						propVar(11);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class CollectionAggContext extends ParserRuleContext {
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
		public CollectionAggContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collectionAgg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).enterCollectionAgg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ITLListener ) ((ITLListener)listener).exitCollectionAgg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ITLVisitor ) return ((ITLVisitor<? extends T>)visitor).visitCollectionAgg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectionAggContext collectionAgg() throws RecognitionException {
		CollectionAggContext _localctx = new CollectionAggContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_collectionAgg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); 
			match(LPAREN);
			setState(106);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MAP) | (1L << REDUCE) | (1L << HexLiteral) | (1L << DecimalLiteral) | (1L << OctalLiteral) | (1L << FloatingPointLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << ID))) != 0)) {
				{
				setState(105); 
				propVar(0);
				}
			}

			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(108); 
				match(COMMA);
				setState(109); 
				propVar(0);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115); 
			match(RPAREN);
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
		enterRule(_localctx, 14, RULE_propFullName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117); 
			propName();
			setState(122);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118); 
					match(DOT);
					setState(119); 
					propName();
					}
					} 
				}
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 16, RULE_propName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125); 
			match(ID);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126); 
					match(LBRACK);
					setState(127); 
					integerLiteral();
					setState(128); 
					match(RBRACK);
					}
					} 
				}
				setState(134);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_boolExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new NotBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(136); 
				match(NOT);
				setState(137); 
				boolExpr(3);
				}
				break;
			case 2:
				{
				_localctx = new CompareBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138); 
				propVar(0);
				setState(139);
				((CompareBoolContext)_localctx).compareOpr = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << BIGGER) | (1L << SMALLER) | (1L << BIGGEROREQ) | (1L << SMALLEROREQ) | (1L << NOTEQUAL))) != 0)) ) {
					((CompareBoolContext)_localctx).compareOpr = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(140); 
				propVar(0);
				}
				break;
			case 3:
				{
				_localctx = new ParenBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142); 
				match(LPAREN);
				setState(143); 
				boolExpr(0);
				setState(144); 
				match(RPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprBoolContext(new BoolExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_boolExpr);
					setState(148);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(149);
					((ExprBoolContext)_localctx).boolOprt = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((ExprBoolContext)_localctx).boolOprt = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(150); 
					boolExpr(2);
					}
					} 
				}
				setState(155);
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
		enterRule(_localctx, 20, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
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
		enterRule(_localctx, 22, RULE_booleanLiteral);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case TRUE:
				_localctx = new TrueBoolContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158); 
				match(TRUE);
				}
				break;
			case FALSE:
				_localctx = new FalseBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159); 
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
		case 9: 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00a5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\3\7\3$\n\3\f"+
		"\3\16\3\'\13\3\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\6\3\6\3\6\5\6\65"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7\3\7\3\7\7"+
		"\7X\n\7\f\7\16\7[\13\7\3\7\5\7^\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7f\n\7\f"+
		"\7\16\7i\13\7\3\b\3\b\5\bm\n\b\3\b\3\b\7\bq\n\b\f\b\16\bt\13\b\3\b\3\b"+
		"\3\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\n\3\n\3\n\3\n\3\n\7\n\u0085\n\n"+
		"\f\n\16\n\u0088\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0095\n\13\3\13\3\13\3\13\7\13\u009a\n\13\f\13\16\13\u009d"+
		"\13\13\3\f\3\f\3\r\3\r\5\r\u00a3\n\r\3\r\2\4\f\24\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\7\3\2\31\32\3\2\33\34\3\2\3\b\3\2\n\13\3\2!#\u00b2\2\32"+
		"\3\2\2\2\4\37\3\2\2\2\6(\3\2\2\2\b.\3\2\2\2\n\61\3\2\2\2\f]\3\2\2\2\16"+
		"j\3\2\2\2\20w\3\2\2\2\22\177\3\2\2\2\24\u0094\3\2\2\2\26\u009e\3\2\2\2"+
		"\30\u00a2\3\2\2\2\32\33\5\4\3\2\33\35\5\6\4\2\34\36\5\b\5\2\35\34\3\2"+
		"\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37 \7\f\2\2 %\5\n\6\2!\"\7\r\2\2\"$\5"+
		"\n\6\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\5\3\2\2\2\'%\3\2\2\2"+
		"()\7\16\2\2),\7\'\2\2*+\7\20\2\2+-\7\'\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2"+
		"\2\2./\7\17\2\2/\60\5\24\13\2\60\t\3\2\2\2\61\64\5\f\7\2\62\63\7\20\2"+
		"\2\63\65\7\'\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\13\3\2\2\2\66\67\b\7\1"+
		"\2\67^\5\20\t\289\7\21\2\29:\5\f\7\2:;\7\22\2\2;^\3\2\2\2<^\5\26\f\2="+
		"^\7$\2\2>^\7%\2\2?^\7&\2\2@^\5\30\r\2A^\7\30\2\2BC\7\35\2\2CD\7\37\2\2"+
		"DE\5\20\t\2EF\7 \2\2FG\7\'\2\2GH\5\16\b\2H^\3\2\2\2IJ\7\36\2\2JK\7\37"+
		"\2\2KL\5\20\t\2LM\7 \2\2MN\7\'\2\2NO\5\16\b\2O^\3\2\2\2PQ\7\'\2\2QS\7"+
		"\21\2\2RT\5\f\7\2SR\3\2\2\2ST\3\2\2\2TY\3\2\2\2UV\7\r\2\2VX\5\f\7\2WU"+
		"\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\^\7\22\2"+
		"\2]\66\3\2\2\2]8\3\2\2\2]<\3\2\2\2]=\3\2\2\2]>\3\2\2\2]?\3\2\2\2]@\3\2"+
		"\2\2]A\3\2\2\2]B\3\2\2\2]I\3\2\2\2]P\3\2\2\2^g\3\2\2\2_`\f\r\2\2`a\t\2"+
		"\2\2af\5\f\7\16bc\f\f\2\2cd\t\3\2\2df\5\f\7\re_\3\2\2\2eb\3\2\2\2fi\3"+
		"\2\2\2ge\3\2\2\2gh\3\2\2\2h\r\3\2\2\2ig\3\2\2\2jl\7\21\2\2km\5\f\7\2l"+
		"k\3\2\2\2lm\3\2\2\2mr\3\2\2\2no\7\r\2\2oq\5\f\7\2pn\3\2\2\2qt\3\2\2\2"+
		"rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\22\2\2v\17\3\2\2\2w|\5\22"+
		"\n\2xy\7\23\2\2y{\5\22\n\2zx\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\21"+
		"\3\2\2\2~|\3\2\2\2\177\u0086\7\'\2\2\u0080\u0081\7\24\2\2\u0081\u0082"+
		"\5\26\f\2\u0082\u0083\7\25\2\2\u0083\u0085\3\2\2\2\u0084\u0080\3\2\2\2"+
		"\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\23"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\b\13\1\2\u008a\u008b\7\t\2\2"+
		"\u008b\u0095\5\24\13\5\u008c\u008d\5\f\7\2\u008d\u008e\t\4\2\2\u008e\u008f"+
		"\5\f\7\2\u008f\u0095\3\2\2\2\u0090\u0091\7\21\2\2\u0091\u0092\5\24\13"+
		"\2\u0092\u0093\7\22\2\2\u0093\u0095\3\2\2\2\u0094\u0089\3\2\2\2\u0094"+
		"\u008c\3\2\2\2\u0094\u0090\3\2\2\2\u0095\u009b\3\2\2\2\u0096\u0097\f\3"+
		"\2\2\u0097\u0098\t\5\2\2\u0098\u009a\5\24\13\4\u0099\u0096\3\2\2\2\u009a"+
		"\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\25\3\2\2"+
		"\2\u009d\u009b\3\2\2\2\u009e\u009f\t\6\2\2\u009f\27\3\2\2\2\u00a0\u00a3"+
		"\7\26\2\2\u00a1\u00a3\7\27\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\31\3\2\2\2\22\35%,\64SY]eglr|\u0086\u0094\u009b\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}