package com.dci.testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Solution_Task7_BeforeEach_AfterEach {
    @BeforeEach
    void setUp() {
        System.out.println("I am setup method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("I am teardown method");
    }

    @Test
    @DisplayName("Method-1")
    void testMethod1() {
        System.out.println("I am method 1");
    }

    @Test
    @DisplayName("Method-2")
    void testMethod2() {
        System.out.println("I am method 2");
    }
}
