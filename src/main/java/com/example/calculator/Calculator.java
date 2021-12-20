package com.example.calculator;

import java.util.ArrayList;

import com.example.calculator.exceptions.NegativesNotAllowedException;

public class Calculator {
    int Add(String numbers) throws NegativesNotAllowedException {
        if (numbers.equals("")) {
            return 0;
        }

        String[] lines = numbers.split("\\r?\\n");
        int result = 0;
        Character delimiter = ',';
        ArrayList<Integer> negatives = new ArrayList<>();

        for (String line : lines) {
            if (line.length() >= 3 && line.substring(0, 2).equals("//")) {
                delimiter = line.charAt(2);
                continue;
            }

            String[] listOfNumbers = line.split(delimiter.toString());

            for (int i = 0; i < listOfNumbers.length; i++) {
                int number = Integer.parseInt(listOfNumbers[i]);
                if (number < 0) {
                    negatives.add(number);
                } else {
                    result += number;
                }
            }
        }
        if (negatives.size() > 0) {
            throw new NegativesNotAllowedException(negatives.toString(), null);
        }
        return result;
    }
}
