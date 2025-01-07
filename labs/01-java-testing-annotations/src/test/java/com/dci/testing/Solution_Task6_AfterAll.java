package com.dci.testing;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Solution_Task6_AfterAll {
    @AfterAll
    static void afterAll() {
        System.out.println("I am teardown method");
    }

    @Test
    @DisplayName("Method-1")
    void testMethod1() {
        System.out.println("I am test method 1");
    }

    @Test
    @DisplayName("Method-2")
    void testMethod2() {
        System.out.println("I am test method 2");
    }
}
