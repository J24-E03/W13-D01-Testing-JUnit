package com.dci.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Solution_Task9_DisplayName {

    @Test
    @DisplayName("Method-1")
    @Order(1)
    void testMethod1() {
        System.out.println("I am test method 1");
    }

    @Test
    @DisplayName("Method-2")
    @Order(2)
    void testMethod2() {
        System.out.println("I am test method 2");
    }

}
