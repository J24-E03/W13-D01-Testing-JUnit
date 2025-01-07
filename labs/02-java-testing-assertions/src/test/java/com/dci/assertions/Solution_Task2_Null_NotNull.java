package com.dci.assertions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution_Task2_Null_NotNull {

    private static Employee employee;

    @BeforeAll
    static void setup() {
        employee = new Employee(1001, "Hugo", null, 500);
    }

    @Test
    @DisplayName("Testing lastname is null")
    void testLastNameIsNull() {
        assertNull(employee.getLastName());
    }

    @Test
    @DisplayName("Testing salary is not null")
    void testSalaryIsNotNull() {
        assertNotNull(employee.getSalary());
    }
}
