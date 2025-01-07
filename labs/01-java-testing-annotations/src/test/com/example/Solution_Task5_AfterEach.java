package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class Solution_Task5_AfterEach {
    @Test
    public void testMethod1(){
        System.out.println("I am test method 1");
    }
    @Test
    public void testMethod2(){
        System.out.println("I am test method 2");
    }
    @AfterEach
    public void tearDownMethod(){
        System.out.println("I am teardown Method");
    }



}
