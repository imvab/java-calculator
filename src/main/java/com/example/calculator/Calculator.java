package com.example.calculator;

public class Calculator {
    int Add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        } 
        
        String[] listOfNumbers = numbers.split(",");
        int result = 0;
        for (int i = 0; i < listOfNumbers.length; i++) {
            int number = Integer.parseInt(listOfNumbers[i]);
            result += number;
        }
        return result;
    }
}
