package com.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Solution_Task7_BeforeEach_AfterEach {
    @Test
    public void testMethod1(){
        System.out.println("I am test method 1");
    }
    @Test
    public void testMethod2(){
        System.out.println("I am test method 2");
    }
    @BeforeEach
    public void setupMethod(){
        System.out.println("I am setup Method");
    }
    @AfterEach
    public void tearDownMethod(){
        System.out.println("I am teardown Method");
    }



}
