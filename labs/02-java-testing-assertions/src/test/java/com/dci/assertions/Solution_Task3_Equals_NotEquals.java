package com.dci.assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution_Task3_Equals_NotEquals {

    private static Employee employee;

    @BeforeAll
    static void setup() {
        employee = new Employee(1001, "Hugo", "Boss", 500);
    }

    @Test
    @DisplayName("Testing ID")
    void testId() {
        assertEquals(1001, employee.getEmpId());
    }

    @Test
    @DisplayName("Testing firstname")
    void testFirstName() {
        assertEquals("Hugo", employee.getFirstName());
    }

    @Test
    @DisplayName("Testing lastname")
    void testLastName() {
        assertEquals("Boss", employee.getLastName());
    }

    @Test
    @DisplayName("Testing salary")
    void testSalary() {
        assertEquals(500, employee.getSalary());
    }

    @Test
    @DisplayName("Testing lastName is not Hugo")
    void testLastNameNotHugo() {
        assertNotEquals("Hugo", employee.getLastName());
    }
}
