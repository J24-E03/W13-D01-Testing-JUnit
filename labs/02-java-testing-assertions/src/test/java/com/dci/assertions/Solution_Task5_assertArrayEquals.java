package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Solution_Task5_assertArrayEquals {
    private static final Employee employee;

    static {
        employee = new Employee(1001, "Hugo", "Boss", new String[] {"sales", "admin"});
    }

    @Test
    void testDepartmentsAreEqual() {
        assertArrayEquals(
                new String[] {"sales", "admin"}, employee.getDepartments()
        );
    }
}
