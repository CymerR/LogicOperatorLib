package ru.cmr.logicaloperators;

import java.util.Arrays;
import java.util.List;

/**
 *  Class represents Or expression(with multiple arguments)
 */
public class Or implements LogicalExpression{

    private final List<LogicalExpression> expressions;


    public Or(LogicalExpression... nodes) {
        expressions = Arrays.asList(nodes);
    }

    @Override
    public boolean evaluate() {
        return expressions.stream()
                .map(LogicalExpression::evaluate)
                .reduce((a, b) -> a || b).orElse(false);
    }
}
