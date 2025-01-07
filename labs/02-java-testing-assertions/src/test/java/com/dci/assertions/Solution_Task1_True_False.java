package com.dci.assertions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

public class Solution_Task1_True_False {

    private static Employee employee;

    @BeforeAll
    static void setup() {
        employee = new Employee(1001, "Hugo", "Boss", 500);
    }

    @Test
    @DisplayName("Testing salary is set-up truely")
    void testSalary() {
        assertTrue(employee.getSalary() == 500);
    }


    @Test
    @DisplayName("Testing salary is not zero")
    void testNotZeroSalary() {
        assertFalse(employee.getSalary() == 0);
    }

    @Test
    @DisplayName("Testing salary is greater than 100")
    void testSalaryGreaterThan100() {
        assertTrue(employee.getSalary() > 100);
    }


}
