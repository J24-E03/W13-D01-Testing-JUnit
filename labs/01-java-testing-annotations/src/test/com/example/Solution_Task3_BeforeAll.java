package com.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Solution_Task3_BeforeAll {

    @Test
    public void test1(){
        System.out.println("I am test method 1");
    }
    @Test
    public void test2(){
        System.out.println("I am test method 2");
    }
    @BeforeAll
    static void setUpMethod(){
        System.out.println("I am setup Method");
    }



}
