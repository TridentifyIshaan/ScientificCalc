package com.calculator.operations;

public class ScientificOperations {
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { 
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b; 
    }
    public static double sin(double a) { return Math.sin(Math.toRadians(a)); }
    public static double cos(double a) { return Math.cos(Math.toRadians(a)); }
    public static double tan(double a) { return Math.tan(Math.toRadians(a)); }
    public static double log(double a) { 
        if (a <= 0) throw new ArithmeticException("Logarithm domain error");
        return Math.log10(a); 
    }
    public static double sqrt(double a) { 
        if (a < 0) throw new ArithmeticException("Square root domain error");
        return Math.sqrt(a); 
    }
    public static double pow(double a, double b) { return Math.pow(a, b); }
}