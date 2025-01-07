package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution_Task1_True_False {

    private static Employee employee = new Employee(1001,"Hugo","Boss",500);
        @Test
    public void testSalary() {
        assertTrue(employee.getSalary() == 500);
        assertFalse(employee.getSalary()==0);
        assertTrue(employee.getSalary() > 100);



    }


}
