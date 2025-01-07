package com.dci.assertions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Solution_Task7_CountWords {

    private static CountWords countWords;
    @Test
    void verifyWordCount() {
        CountWords counter = new CountWords();
        assertEquals(2, counter.getNoOfWords("Hello world"));
        assertEquals(3, counter.getNoOfWords("Welcome to Junit5"));
    }

    @Test
    void verifyEmptySentence() {
        CountWords counter = new CountWords();
        assertEquals(0, counter.getNoOfWords(""));
    }

    @Test
    void verifyNullSentence() {
        CountWords counter = new CountWords();
        assertThrows(IllegalArgumentException.class, () -> {
            counter.getNoOfWords(null);
        });
    }


}