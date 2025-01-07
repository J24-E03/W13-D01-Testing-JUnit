package com.dci.testing;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Solution_Task12_Order {
    @Test
    @Order(3)
    void testMethod1() {
        System.out.println("I am test method 1");
    }

    @Test
    @Order(1)
    void testMethod2() {
        System.out.println("I am test method 2");
    }

    @Test
    @Order(2)
    void testMethod3() {
        System.out.println("I am test method 3");
    }
}
