package com.dci;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StringCalculatorTest {
    private static final StringCalculator stringCalculator;

    static {
        stringCalculator = new StringCalculator();
    }

    @Test
    @Order(1)
    void testIsEmpty() {
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    @Order(2)
    void testSingleNumber() {
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.add("1"));
    }

    @Test
    @Order(3)
    void testMultipleNumbers() {
        assertEquals(6, stringCalculator.add("1,2,3"));
        assertEquals(1002, stringCalculator.add("1000,1001,2"));
    }

    @Test
    @Order(4)
    void testNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.add("-1,2,3"));
    }

    @Test
    @Order(5)
    void testIllegalDelimiter() {
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.add("1;2,3"));
        assertThrows(IllegalArgumentException.class, () -> stringCalculator.add("1;2;3"));
    }

    @Test
    @Order(6)
    void testCustomDelimiter() {
        assertEquals(6, stringCalculator.add("//;\n1;2;3"));
        assertEquals(9, stringCalculator.add("//|\n2|3|4"));
    }
}