package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    void setup() {
        calculator = new StringCalculator();
    }

    @Test
    @DisplayName("Testing empty String")
    void testEmptyString() {
        assertEquals(0, calculator.add("    "));
    }

    @Test
    @DisplayName("Testing a Single number in String less than 1000")
    void testSingleNumLessThan1000() {
        assertEquals(120, calculator.add("120"));
    }

    @Test
    @DisplayName("Testing a Single number in String greater than 1000")
    void testSingleNumGreaterThan1000() {
        assertEquals(0, calculator.add("///\n1200"));
    }

    @Test
    @DisplayName("Testing multiple numbers separated by commas")
    void testMultipleNums() {
        assertEquals(637, calculator.add("//,\n120, 12, 500, 0, 5"));
    }

    @Test
    @DisplayName("Testing multiple numbers greater than 1000")
    void testMultipleNumsGraterThan1000() {
        assertEquals(1637, calculator.add("//;\n120; 12; 1001; 500; 0; 5; 2001; 1000"));
    }

    @Test
    @DisplayName("Testing multiple numbers including negative ones")
    void testNegativeNums() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("120, -2, -5, 100, 89, 999"));
        assertEquals(exception.getMessage(), "Negative numbers are not allowed: [-2, -5]");
    }

    @Test
    @DisplayName("Testing incorrect delimiters")
    void testIncorrectDelimiter() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> calculator.add("//,\n120, -2/ -5; 100, 89, 999"));
    }

}