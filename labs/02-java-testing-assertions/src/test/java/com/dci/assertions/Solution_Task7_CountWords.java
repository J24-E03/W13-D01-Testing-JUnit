package com.dci.assertions;

class Solution_Task7_CountWords {

    private static CountWords countWords;

    @BeforeAll
    public static void init() {
        countWords = new CountWords();
    }

    @DisplayName("A parameterized test with different sentences")
    @ParameterizedTest
    @CsvSource({
            "Hello World, 2",
            "I am testing word count, 5",
            "word1 word2 word3 word4 word5 word6, 6"
    })
    public void verifyWordCount(String sentence, int expectedOutput) {
        CountWords countWords = new CountWords();
        assertEquals(expectedOutput, countWords.getNoOfWords(sentence), "Incorrect word count");
    }

    @Test
    public void verifyEmptySentence() {
        CountWords countWords = new CountWords();
        assertEquals(0, countWords.getNoOfWords(""), "Incorrect word count");
    }

    @Test
    public void verifyNullSentence() {
        CountWords countWords = new CountWords();
        assertEquals(0, countWords.getNoOfWords(null), "Incorrect word count");
    }



}