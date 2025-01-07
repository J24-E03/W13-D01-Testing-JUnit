package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isBlank())
            return 0;

        String numPart = numbers;
        String delimiter = ",";

        if (numbers.startsWith("//")) {
            String[] stringParts = numbers.split("\\n");
            if (stringParts.length < 2) {
                throw new IllegalArgumentException("Invalid input format for custom delimiter.");
            }
            delimiter = stringParts[0].substring(2);
            numPart = stringParts[1];
        }

        int sum = 0;
        String[] numbersArray = numPart.split(delimiter);
        List<Integer> negativeNumbers = new ArrayList<>();

        for (String num : numbersArray) {
            try {
               int number = Integer.parseInt(num.trim());
               if (number < 0)
                   negativeNumbers.add(number);
               else if (number <= 1000)
                   sum += number;
            }
            catch (Exception ex) {
                if (ex.getClass() == NumberFormatException.class) {
                    throw new IllegalArgumentException("Illegal delimiter");
                }
            }
        }
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers are not allowed: " + negativeNumbers);
        }

        return sum;
    }


}

