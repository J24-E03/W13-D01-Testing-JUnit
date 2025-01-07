package com.dci.assertions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Solution_Task5_assertArrayEquals {

    private Employee employee;


    @BeforeEach
    void setup() {
        employee = new Employee(1001, "Hugo", "Boss", new String[]{"sales", "admin"});
    }

    @Test
    @DisplayName("Testing ArrayEquals")
    void testingArrayEquals() {
        assertArrayEquals(new String[] {"sales", "admin"}, employee.getDepartments());
    }

    @Test
    @DisplayName("Testing assertIterableEquals")
    void testingIterableEquals() {
        assertIterableEquals(Arrays.asList("sales", "admin"), Arrays.stream(employee.getDepartments()).toList());
    }

}
