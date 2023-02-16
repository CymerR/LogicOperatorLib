package ru.cmr.logicaloperators;

/**
 *  Class represents standart implication rule (If A, then B; A -> B)
 */
public class Consequence implements LogicalExpression{


    private final LogicalExpression left;
    private final LogicalExpression right;

    public Consequence(LogicalExpression left, LogicalExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean evaluate() {
        return new Or(new Not(left), right).evaluate();
    }
}
