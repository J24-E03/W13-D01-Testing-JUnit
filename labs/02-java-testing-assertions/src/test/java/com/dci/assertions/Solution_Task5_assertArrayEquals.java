package com.dci.assertions;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class Solution_Task5_assertArrayEquals {

    private Employee employee;

    @Test
        void testDepartmentsEqual() {
            assertArrayEquals(
                    new String[] {"sales", "admin"}, employee.getDepartments()
            );
        }
    }
