package ru.cmr.logicaloperators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LogicalExpressionTests {

    @Test
    public void simpleTest() {
        assertTrue(true);
    }

    @Test
    public void expressionTest() {
        var expr = new LogicalExpression() {

            @Override
            public boolean evaluate() {
                return true;
            }
        };
        assertTrue(expr.evaluate());
    }

    @Test
    public void orExpressionTestTrue() {
        var or = new Or(
                generate(true),
                generate(false),
                generate(false),
                generate(false)
        );

        assertTrue(or.evaluate());
    }
    @Test
    public void orExpressionTestFalse() {
        var or = new Or(
                generate(false),
                generate(false),
                generate(false),
                generate(false)
        );

        assertFalse(or.evaluate());
    }

    @Test
    public void andExpressionTestTrue() {
        var and = new And(
                generate(true),
                generate(true),
                generate(true),
                generate(true),
                generate(true)
        );

        assertTrue(and.evaluate());
    }
    @Test
    public void andExpressionTestFalse() {
        var and = new And(
                generate(false),
                generate(true),
                generate(true),
                generate(true)
        );

        assertFalse(and.evaluate());
    }


    private LogicalExpression generate(boolean val) {
        return () -> val;
    }
}
