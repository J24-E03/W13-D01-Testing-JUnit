package com.dci.assertions;

import java.util.StringTokenizer;

public class CountWords {

    public int getNoOfWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        StringTokenizer tokens = new StringTokenizer(sentence);
        int result = tokens.countTokens();
        return result;
    }


}

