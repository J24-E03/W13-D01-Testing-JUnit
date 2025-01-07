package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Solution_Task3_Equals_NotEquals {
    private static final Employee employee;

    static {
        employee = new Employee(1001, "Hugo", "Boss", 500);
    }

    @Test
    void testValuesAreEqual() {
        assertEquals(employee.getEmpId(), 1001);
        assertEquals(employee.getFirstName(), "Hugo");
        assertEquals(employee.getLastName(), "Boss");
        assertEquals(employee.getSalary(), 500);
    }

    @Test
    void TestLastNameNotEqual() {
        assertNotEquals(employee.getLastName(), "Hugo");
    }
}
