package com.example.calculator.exceptions;
public class NegativesNotAllowedException extends Exception {
    public NegativesNotAllowedException(String numbers, Throwable error) {
        super("Negatives not allowed " + numbers, error);
    }
}
