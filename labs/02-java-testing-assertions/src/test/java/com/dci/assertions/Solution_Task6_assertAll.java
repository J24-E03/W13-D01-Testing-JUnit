package com.dci.assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Solution_Task6_assertAll {

    private static Employee employee;

    @BeforeEach
    void setup() {
        employee = new Employee(1001, "Hugo", "Boss", 500);
    }

    @Test
    @DisplayName("Verify all fields of Employee")
    void testEmployeeFields() {
        assertAll(
                () -> assertEquals(1001, employee.getEmpId()),
                () -> assertEquals("Hugo", employee.getFirstName()),
                () -> assertEquals("Boss", employee.getLastName()),
                () -> assertEquals(500, employee.getSalary())
        );
    }

}
