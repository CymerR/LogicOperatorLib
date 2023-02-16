package ru.cmr.logicaloperators;


/**
 *  The main class that represents an abstract logical expression(from maths)
 *  The main idea that it can be composable
 */
@FunctionalInterface
public interface LogicalExpression {
    boolean evaluate();
}
