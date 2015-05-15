// Generated from G:/mymise/in-memory-transfer-language/core/src/main/java/com/dnt/itl/grammar\ITL.g4 by ANTLR 4.5
package com.dnt.itl.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ITLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ITLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ITLParser#ql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQl(@NotNull ITLParser.QlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ITLParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull ITLParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ITLParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(@NotNull ITLParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link ITLParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(@NotNull ITLParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link ITLParser#propsSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsSel(@NotNull ITLParser.PropsSelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatVar}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatVar(@NotNull ITLParser.FloatVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull ITLParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull ITLParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull ITLParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapFuncVar}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapFuncVar(@NotNull ITLParser.MapFuncVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReduceFuncVar}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReduceFuncVar(@NotNull ITLParser.ReduceFuncVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntVar}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVar(@NotNull ITLParser.IntVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullVar}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullVar(@NotNull ITLParser.NullVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharVar}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharVar(@NotNull ITLParser.CharVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncVar}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncVar(@NotNull ITLParser.FuncVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DirectPropVar}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectPropVar(@NotNull ITLParser.DirectPropVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanVar}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVar(@NotNull ITLParser.BooleanVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVar}
	 * labeled alternative in {@link ITLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVar(@NotNull ITLParser.StringVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ITLParser#propFullName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropFullName(@NotNull ITLParser.PropFullNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ITLParser#propName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropName(@NotNull ITLParser.PropNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareBool}
	 * labeled alternative in {@link ITLParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareBool(@NotNull ITLParser.CompareBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenBool}
	 * labeled alternative in {@link ITLParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenBool(@NotNull ITLParser.ParenBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link ITLParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(@NotNull ITLParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotBool}
	 * labeled alternative in {@link ITLParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBool(@NotNull ITLParser.NotBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ITLParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull ITLParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueBool}
	 * labeled alternative in {@link ITLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueBool(@NotNull ITLParser.TrueBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseBool}
	 * labeled alternative in {@link ITLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseBool(@NotNull ITLParser.FalseBoolContext ctx);
}