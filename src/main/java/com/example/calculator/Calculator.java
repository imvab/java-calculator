package com.example.calculator;

public class Calculator {
    int Add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        }

        String[] lines = numbers.split("\\r?\\n");
        int result = 0;
        for (String line : lines) {
            String[] listOfNumbers = line.split(",");

            for (int i = 0; i < listOfNumbers.length; i++) {
                int number = Integer.parseInt(listOfNumbers[i]);
                result += number;
            }
        }
        return result;
    }
}
