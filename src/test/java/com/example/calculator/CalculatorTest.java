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
}
