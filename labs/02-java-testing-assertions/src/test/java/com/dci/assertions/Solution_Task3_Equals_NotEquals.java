package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Solution_Task3_Equals_NotEquals {

    private static Employee employee;
          Employee emp = new Employee(1001, "Hugo", "Boss", 500);

    @Test
    void testEqualsNotEquals() {
        assertEquals(1001, emp.getEmpId());
        assertEquals("Hugo", emp.getFirstName());
        assertEquals("Boss", emp.getLastName());
        assertEquals(500, emp.getSalary());
        assertNotEquals("Hugo", emp.getLastName());
    }
}



