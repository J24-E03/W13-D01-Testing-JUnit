package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution_Task1_True_False {
    private static final Employee employee;

    static {
        employee = new Employee(1001, "Hugo", "Boss", 500);
    }

    @Test
    void testSalaryIs500() {
        assertTrue(employee.getSalary() == 500);
    }

    @Test
    void testSalaryIsNotZero() {
        assertFalse(employee.getSalary() == 0);
    }

    @Test
    void testSalaryIsGreaterThan100() {
        assertTrue(employee.getSalary() > 100);
    }
}
