package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;


public class Solution_Task2_Null_NotNull {

    @Test
    void testNullNotNull() {
        // Create Employee instance
        Employee emp = new Employee(1001, "Hugo", null, 500);

        assertNull(emp.getLastName());
        assertNotNull(emp.getSalary());
    }
}
