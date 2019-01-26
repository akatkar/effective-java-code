package com.akatkar.effective.java.item42;
import java.util.*;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

// Enum type with constant-specific class bodies and data (Pages 163-4)
public enum Operation {
    PLUS("+",  (x,y) -> x + y),
    MINUS("-", (x,y) -> x - y),
    TIMES("*", (x,y) -> x * y),
    DIVIDE("/",(x,y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator operator;
    
    private Operation(String symbol, DoubleBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }
    
    public double apply(double x, double y) {
        return operator.applyAsDouble(x, y);
    }

    @Override public String toString() { return symbol; }

    // Implementing a fromString method on an enum type (Page 164)
    private static final Map<String, Operation> stringToEnum =
            Stream.of(values()).collect(
                    toMap(Object::toString, e -> e));

    // Returns Operation for string, if any
    public static Optional<Operation> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public static void main(String[] args) {
        double x = 5.0;
        double y = 6.0;
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }
}
