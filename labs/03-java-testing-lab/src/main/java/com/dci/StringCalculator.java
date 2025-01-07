package com.dci;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class StringCalculator {
    public int add(String numbers) {
        AtomicInteger sum = new AtomicInteger();

        if (numbers.isEmpty()) {
            return 0;
        }

        String delimiter = null;
        if (numbers.startsWith("//")) {
            delimiter = numbers.substring(2, 3);

            if (Delimiter.isValidDelimiter(delimiter) == false) {
                throw new IllegalArgumentException("Invalid delimiter");
            }

            numbers = numbers.substring(4);
            numbers = numbers.replace(delimiter, ",");
        }

        if (numbers.contains(",") == false) {
            throw new IllegalArgumentException("Invalid or missing delimiter");
        }

        String[] numbersArray = numbers.split(",");
        Arrays.stream(numbersArray).forEach(number -> {
            if (Integer.parseInt(number) < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed");
            }

            if (Integer.parseInt(number) <= 1000) {
                sum.addAndGet(Integer.parseInt(number));
            }
        });

        return sum.get();
    }
}
