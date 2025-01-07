package com.dci.testing;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Solution_Task12_Order {

    @Test
    @DisplayName("Test Method 1")
    @Order(3)
    void testMethod1() {
        System.out.println("I am test method 1");
    }

    @Test
    @DisplayName("Test Method 2")
    @Order(1)
    void testMethod2() {
        System.out.println("I am test method 2");
    }

    @Test
    @DisplayName("Test Method 3")
    @Order(2)
    void testMethod3() {
        System.out.println("I am test method 3");
    }

}
