package org.example;

public class Calculator {


    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        int result = num1 - num2;

        return result < 0 ? 0 : result;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public int divide(int num1, int num2){
        return num1 / num2;
    }


}
