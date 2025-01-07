package com.dci.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Solution_Task6_AfterAll {
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

    @AfterAll
    static void tearDown() {
        System.out.println("I am teardown method");
    }

}
