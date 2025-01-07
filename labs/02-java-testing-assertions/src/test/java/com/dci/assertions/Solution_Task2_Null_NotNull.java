package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class Solution_Task2_Null_NotNull {
    private static final Employee employee;

    static {
        employee = new Employee(1001, "Hugo", null, 500);
    }

    @Test
    void testLastNameIsNull() {
        assertNull(employee.getLastName());
    }

    void testSalaryIsNotNull() {
        assertNotNull(employee.getSalary());
    }
}
