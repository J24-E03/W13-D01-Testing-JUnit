package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution_Task6_assertAll {

    private static Employee employee;

    @Test
    void testAssertAll() {

        Employee emp = new Employee(1001, "Hugo", "Boss", 500);
        assertAll("Employee fields",
                () -> assertEquals(1001, emp.getEmpId()),
                () -> assertEquals("Hugo", emp.getFirstName()),
                () -> assertEquals("Boss", emp.getLastName()),
                () -> assertEquals(500, emp.getSalary())
        );
    }
}