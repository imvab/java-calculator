package com.example.calculator;

public class Calculator {
    int Add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }

        String[] lines = numbers.split("\\r?\\n");
        int result = 0;
        Character delimiter = ',';

        for (String line : lines) {
            if (line.length() >= 3 && line.substring(0, 2).equals("//")) {
                delimiter = line.charAt(2);
                continue;
            }

            String[] listOfNumbers = line.split(delimiter.toString());

            for (int i = 0; i < listOfNumbers.length; i++) {
                int number = Integer.parseInt(listOfNumbers[i]);
                result += number;
            }
        }
        return result;
    }
}
