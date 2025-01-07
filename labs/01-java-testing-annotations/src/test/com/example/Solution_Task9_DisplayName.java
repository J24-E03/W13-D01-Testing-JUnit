package com.example;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Solution_Task9_DisplayName {

    @Test
    @DisplayName("Method1")
    public void testMethod1() {
        System.out.println("I am test method 1");
    }

    @Test
    @DisplayName("Method2")
    void testMethod2() {
        System.out.println("I am test method 2");
    }


}
