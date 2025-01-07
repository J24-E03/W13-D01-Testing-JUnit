package com.dci.assertions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Solution_Task4_Exception {

    private Employee employee;

    @Test
    @DisplayName("Testing throwing exceptions")
    void testThrowingException() {
        assertThrows(IllegalArgumentException.class, ()-> {
            employee = new Employee(1001, "Hugo", null, new String[]{"sales", "admin"});
        });
    }

}
