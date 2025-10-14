package com.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorAppTest {

    // No need for CalculatorApp instance; use static methods

    @Test
    void testAddition() {
        assertEquals(5, CalculatorApp.calculate("add 2 3"));
        assertEquals(-1, CalculatorApp.calculate("add 2 -3"));
    }

    @Test
    void testSubtraction() {
        assertEquals(-1, CalculatorApp.calculate("subtract 2 3"));
        assertEquals(5, CalculatorApp.calculate("subtract 2 -3"));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, CalculatorApp.calculate("multiply 2 3"));
        assertEquals(-6, CalculatorApp.calculate("multiply 2 -3"));
    }

    @Test
    void testDivision() {
        assertEquals(2, CalculatorApp.calculate("divide 6 3"));
        assertThrows(ArithmeticException.class, () -> CalculatorApp.calculate("divide 1 0"));
    }

    @Test
    void testScientificOperations() {
        assertEquals(Math.sin(Math.toRadians(90)), CalculatorApp.calculate("sin 90"), 0.001);
        assertEquals(Math.log10(10), CalculatorApp.calculate("log 10"), 0.001);
        assertEquals(Math.pow(2, 3), CalculatorApp.calculate("pow 2 3"), 0.001);
    }

    @Test
    void testInputValidation() {
        assertTrue(CalculatorApp.isValidInput("add 2 3"));
        assertFalse(CalculatorApp.isValidInput("add 2"));
        assertFalse(CalculatorApp.isValidInput("++ 2 3"));
    }
}