// Generated from G:/mymise/in-memory-transfer-language/core/src/main/java/com/dnt/itl/grammar\ITL.g4 by ANTLR 4.5
package com.dnt.itl.grammar;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ITLParser}.
 */
public interface ITLListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link ITLParser#ql}.
     *
     * @param ctx the parse tree
     */
    void enterQl(@NotNull ITLParser.QlContext ctx);

    /**
     * Exit a parse tree produced by {@link ITLParser#ql}.
     *
     * @param ctx the parse tree
     */
    void exitQl(@NotNull ITLParser.QlContext ctx);

    /**
     * Enter a parse tree produced by {@link ITLParser#select}.
     *
     * @param ctx the parse tree
     */
    void enterSelect(@NotNull ITLParser.SelectContext ctx);

    /**
     * Exit a parse tree produced by {@link ITLParser#select}.
     *
     * @param ctx the parse tree
     */
    void exitSelect(@NotNull ITLParser.SelectContext ctx);

    /**
     * Enter a parse tree produced by {@link ITLParser#from}.
     *
     * @param ctx the parse tree
     */
    void enterFrom(@NotNull ITLParser.FromContext ctx);

    /**
     * Exit a parse tree produced by {@link ITLParser#from}.
     *
     * @param ctx the parse tree
     */
    void exitFrom(@NotNull ITLParser.FromContext ctx);

    /**
     * Enter a parse tree produced by {@link ITLParser#where}.
     *
     * @param ctx the parse tree
     */
    void enterWhere(@NotNull ITLParser.WhereContext ctx);

    /**
     * Exit a parse tree produced by {@link ITLParser#where}.
     *
     * @param ctx the parse tree
     */
    void exitWhere(@NotNull ITLParser.WhereContext ctx);

    /**
     * Enter a parse tree produced by {@link ITLParser#propsSel}.
     *
     * @param ctx the parse tree
     */
    void enterPropsSel(@NotNull ITLParser.PropsSelContext ctx);

    /**
     * Exit a parse tree produced by {@link ITLParser#propsSel}.
     *
     * @param ctx the parse tree
     */
    void exitPropsSel(@NotNull ITLParser.PropsSelContext ctx);

    /**
     * Enter a parse tree produced by the {@code FloatVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterFloatVar(@NotNull ITLParser.FloatVarContext ctx);

    /**
     * Exit a parse tree produced by the {@code FloatVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitFloatVar(@NotNull ITLParser.FloatVarContext ctx);

    /**
     * Enter a parse tree produced by the {@code NullVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterNullVar(@NotNull ITLParser.NullVarContext ctx);

    /**
     * Exit a parse tree produced by the {@code NullVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitNullVar(@NotNull ITLParser.NullVarContext ctx);

    /**
     * Enter a parse tree produced by the {@code CharVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterCharVar(@NotNull ITLParser.CharVarContext ctx);

    /**
     * Exit a parse tree produced by the {@code CharVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitCharVar(@NotNull ITLParser.CharVarContext ctx);

    /**
     * Enter a parse tree produced by the {@code FuncVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterFuncVar(@NotNull ITLParser.FuncVarContext ctx);

    /**
     * Exit a parse tree produced by the {@code FuncVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitFuncVar(@NotNull ITLParser.FuncVarContext ctx);

    /**
     * Enter a parse tree produced by the {@code MulDiv}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterMulDiv(@NotNull ITLParser.MulDivContext ctx);

    /**
     * Exit a parse tree produced by the {@code MulDiv}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitMulDiv(@NotNull ITLParser.MulDivContext ctx);

    /**
     * Enter a parse tree produced by the {@code AddSub}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterAddSub(@NotNull ITLParser.AddSubContext ctx);

    /**
     * Exit a parse tree produced by the {@code AddSub}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitAddSub(@NotNull ITLParser.AddSubContext ctx);

    /**
     * Enter a parse tree produced by the {@code Parens}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterParens(@NotNull ITLParser.ParensContext ctx);

    /**
     * Exit a parse tree produced by the {@code Parens}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitParens(@NotNull ITLParser.ParensContext ctx);

    /**
     * Enter a parse tree produced by the {@code DirectPropVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterDirectPropVar(@NotNull ITLParser.DirectPropVarContext ctx);

    /**
     * Exit a parse tree produced by the {@code DirectPropVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitDirectPropVar(@NotNull ITLParser.DirectPropVarContext ctx);

    /**
     * Enter a parse tree produced by the {@code IntVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterIntVar(@NotNull ITLParser.IntVarContext ctx);

    /**
     * Exit a parse tree produced by the {@code IntVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitIntVar(@NotNull ITLParser.IntVarContext ctx);

    /**
     * Enter a parse tree produced by the {@code BooleanVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterBooleanVar(@NotNull ITLParser.BooleanVarContext ctx);

    /**
     * Exit a parse tree produced by the {@code BooleanVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitBooleanVar(@NotNull ITLParser.BooleanVarContext ctx);

    /**
     * Enter a parse tree produced by the {@code StringVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void enterStringVar(@NotNull ITLParser.StringVarContext ctx);

    /**
     * Exit a parse tree produced by the {@code StringVar}
     * labeled alternative in {@link ITLParser#propVar}.
     *
     * @param ctx the parse tree
     */
    void exitStringVar(@NotNull ITLParser.StringVarContext ctx);

    /**
     * Enter a parse tree produced by {@link ITLParser#propFullName}.
     *
     * @param ctx the parse tree
     */
    void enterPropFullName(@NotNull ITLParser.PropFullNameContext ctx);

    /**
     * Exit a parse tree produced by {@link ITLParser#propFullName}.
     *
     * @param ctx the parse tree
     */
    void exitPropFullName(@NotNull ITLParser.PropFullNameContext ctx);

    /**
     * Enter a parse tree produced by {@link ITLParser#propName}.
     *
     * @param ctx the parse tree
     */
    void enterPropName(@NotNull ITLParser.PropNameContext ctx);

    /**
     * Exit a parse tree produced by {@link ITLParser#propName}.
     *
     * @param ctx the parse tree
     */
    void exitPropName(@NotNull ITLParser.PropNameContext ctx);

    /**
     * Enter a parse tree produced by the {@code CompareBool}
     * labeled alternative in {@link ITLParser#boolExpr}.
     *
     * @param ctx the parse tree
     */
    void enterCompareBool(@NotNull ITLParser.CompareBoolContext ctx);

    /**
     * Exit a parse tree produced by the {@code CompareBool}
     * labeled alternative in {@link ITLParser#boolExpr}.
     *
     * @param ctx the parse tree
     */
    void exitCompareBool(@NotNull ITLParser.CompareBoolContext ctx);

    /**
     * Enter a parse tree produced by the {@code ParenBool}
     * labeled alternative in {@link ITLParser#boolExpr}.
     *
     * @param ctx the parse tree
     */
    void enterParenBool(@NotNull ITLParser.ParenBoolContext ctx);

    /**
     * Exit a parse tree produced by the {@code ParenBool}
     * labeled alternative in {@link ITLParser#boolExpr}.
     *
     * @param ctx the parse tree
     */
    void exitParenBool(@NotNull ITLParser.ParenBoolContext ctx);

    /**
     * Enter a parse tree produced by the {@code ExprBool}
     * labeled alternative in {@link ITLParser#boolExpr}.
     *
     * @param ctx the parse tree
     */
    void enterExprBool(@NotNull ITLParser.ExprBoolContext ctx);

    /**
     * Exit a parse tree produced by the {@code ExprBool}
     * labeled alternative in {@link ITLParser#boolExpr}.
     *
     * @param ctx the parse tree
     */
    void exitExprBool(@NotNull ITLParser.ExprBoolContext ctx);

    /**
     * Enter a parse tree produced by the {@code NotBool}
     * labeled alternative in {@link ITLParser#boolExpr}.
     *
     * @param ctx the parse tree
     */
    void enterNotBool(@NotNull ITLParser.NotBoolContext ctx);

    /**
     * Exit a parse tree produced by the {@code NotBool}
     * labeled alternative in {@link ITLParser#boolExpr}.
     *
     * @param ctx the parse tree
     */
    void exitNotBool(@NotNull ITLParser.NotBoolContext ctx);

    /**
     * Enter a parse tree produced by {@link ITLParser#integerLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterIntegerLiteral(@NotNull ITLParser.IntegerLiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link ITLParser#integerLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitIntegerLiteral(@NotNull ITLParser.IntegerLiteralContext ctx);

    /**
     * Enter a parse tree produced by the {@code TrueBool}
     * labeled alternative in {@link ITLParser#booleanLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterTrueBool(@NotNull ITLParser.TrueBoolContext ctx);

    /**
     * Exit a parse tree produced by the {@code TrueBool}
     * labeled alternative in {@link ITLParser#booleanLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitTrueBool(@NotNull ITLParser.TrueBoolContext ctx);

    /**
     * Enter a parse tree produced by the {@code FalseBool}
     * labeled alternative in {@link ITLParser#booleanLiteral}.
     *
     * @param ctx the parse tree
     */
    void enterFalseBool(@NotNull ITLParser.FalseBoolContext ctx);

    /**
     * Exit a parse tree produced by the {@code FalseBool}
     * labeled alternative in {@link ITLParser#booleanLiteral}.
     *
     * @param ctx the parse tree
     */
    void exitFalseBool(@NotNull ITLParser.FalseBoolContext ctx);
}