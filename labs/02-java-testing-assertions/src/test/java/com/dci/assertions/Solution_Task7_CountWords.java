package com.dci.assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution_Task7_CountWords {
    private static final CountWords countWords;

    static {
        countWords = new CountWords();
    }

    @Test
    void verifyNullSentence() {
        assertEquals(0, countWords.getNoOfWords(null));
    }

    @Test
    void verifyEmptySentence() {
        assertEquals(0, countWords.getNoOfWords(""));
    }

    @ParameterizedTest
    @DisplayName("A parameterized test with different sentences")
    @CsvSource({
            "Hello World, 2",
            "I am testing word count, 5",
            "word1 word2 word3 word4 word5 word6, 6",
    })
    void verifySentences(String sentence, int expected) {
        assertEquals(expected, countWords.getNoOfWords(sentence));
    }
}