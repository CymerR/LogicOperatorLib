package ru.cmr.logicaloperators;

/**
 *  Class that represents a negation of a LogicalExpression
 */
public class Not implements LogicalExpression {

    private final LogicalExpression value;

    public Not(LogicalExpression value) {
        this.value = value;
    }


    @Override
    public boolean evaluate() {
        return !value.evaluate();
    }
}
