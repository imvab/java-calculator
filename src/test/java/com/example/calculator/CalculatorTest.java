package com.example.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnZeroOfStringisBlank() {
        String input = "";
        int result = calculator.Add(input);
        assertEquals(0, result);
    }

    @Test
    public void shouldReturnSameNumberIfSingleNumberIsEntered() {
        String input = "1";
        int result = calculator.Add(input);
        assertEquals(1, result);
    }

    @Test
    public void shouldReturnSumOfAllNumbersSeparatedByAComma() {
        String input = "1,2,3";
        int result = calculator.Add(input);
        assertEquals(6, result);
    }

    @Test
    public void shouldReturnSumOfAllNumbersSeparatedByACommaAndLines() {
        String input = "1,2\n3,4\n";
        int result = calculator.Add(input);
        assertEquals(10, result);
    }

    @Test
    public void shouldReturnSumOfAllNumbersSeparatedByAnyDelimiter() {
        String input = "//;\n1;2\n3;4\n";
        int result = calculator.Add(input);
        assertEquals(10, result);
    }
}
