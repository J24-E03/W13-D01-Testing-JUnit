package com.dci.testing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class Solution_Task11_RepeatedTest {
    @RepeatedTest(5)
    @DisplayName("Method-1")
    void testMethod1() {
        System.out.println("I am test method 1");
    }
}
