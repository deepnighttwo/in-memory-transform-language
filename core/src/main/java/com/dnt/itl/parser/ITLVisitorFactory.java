package com.dnt.itl.parser;


import com.dnt.itl.grammar.ITLBaseVisitor;

/**
 * User: Mark Zang
 * Date: 2015/4/22
 * Time: 17:09
 */
public interface ITLVisitorFactory {
    ITLBaseVisitor<Object> createVisitor() throws Exception;
}
