package com.dci.testing;

import org.junit.jupiter.api.*;

public class Solution_Task4_BeforeEach {

    @BeforeEach
    void setup() {
        System.out.println("I am setup method");
    }

    @Test
    @DisplayName("Test Method 1")
    @Order(1)
    void testMethod1() {
        System.out.println("I am test method 1");
    }

    @Test
    @DisplayName("Test Method 2")
    @Order(2)
    void testMethod2() {
        System.out.println("I am test method 2");
    }
}
