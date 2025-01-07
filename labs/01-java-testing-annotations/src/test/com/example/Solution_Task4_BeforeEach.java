package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution_Task4_BeforeEach {
    @Test
    public void testMethod1(){
        System.out.println("I am test method 1");
    }
    @Test
    public void testMethod2(){
        System.out.println("I am test method 2");
    }
    @BeforeEach
    public void setUpMethod(){
        System.out.println("I am setUp Method");
    }




}
