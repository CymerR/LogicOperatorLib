package ru.cmr.logicaloperators;

/**
 *  Helper class for use of the lib
 */
public class ExpressionGenerator {

    /**
     * # Constructs an Or-expression
     * @param values - values to work with
     * @return or-expression based on values
     */
    public static LogicalExpression or(boolean... values) {
        return new Or(
               generateAll(values)
        );
    }

    /**
     * # Constructs an And-expression
     * @param values - values to work with
     * @return and-expression based on values
     */
    public static LogicalExpression and(boolean... values) {
        return new And(
                generateAll(values)
        );
    }

    private static LogicalExpression[] generateAll(boolean... values) {
        LogicalExpression[] data = new LogicalExpression[values.length];

        for(int i = 0; i < values.length; i++) {
            data[i] = generate(values[i]);
        }
        return data;
    }


    private static LogicalExpression generate(boolean val) {
        return () -> val;
    }
}
