package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Solution_Task10_ParameterizedTest {
    @Test
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void testMethod1() {
        System.out.println("I am test method 1");
    }



}
