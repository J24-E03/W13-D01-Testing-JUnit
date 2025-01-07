package com.dci.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Solution_Task8_Disabled {
    @Test
    @DisplayName("Method-1")
    @Disabled
    void testMethod1() {
        System.out.println("I am method 1");
    }

    @Test
    @DisplayName("Method-2")
    void testMethod2() {
        System.out.println("I am method 2");
    }
}
