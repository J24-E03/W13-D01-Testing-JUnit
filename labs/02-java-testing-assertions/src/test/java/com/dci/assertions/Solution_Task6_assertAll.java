package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution_Task6_assertAll {
    private static final Employee employee;

    static {
        employee = new Employee(1001, "Hugo", "Boss", 500);
    }

    @Test
    void testAllObjectFields() {
        assertAll(
                () -> assertEquals(1001, employee.getEmpId()),
                () -> assertEquals("Hugo", employee.getFirstName()),
                () -> assertEquals("Boss", employee.getLastName()),
                () -> assertEquals(500, employee.getSalary())
        );
    }
}
