package com.example.calculator;

public class Calculator {
    int Add(String numbers) {
        if (numbers.equals("")) {
            return 0;
        } 
        return Integer.parseInt(numbers);
    }
}
