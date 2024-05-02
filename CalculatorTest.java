package org.example;

import org.junit.Test;

import static org.example.Calculator.Calculate;
import static org.example.Calculator.finalResult;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {

    @Test
    public void testCalculateBasic() {
        List<Float> numbers = new ArrayList<>(Arrays.asList(2.0f, 3.0f));
        List<String> operations = new ArrayList<>(Arrays.asList("+"));
        Calculate(numbers, operations);
        assertEquals(5.0f, finalResult, 0.001f);
    }

    @Test
    public void testCalculateComplex() {
        List<Float> numbers = new ArrayList<>(Arrays.asList(2.0f, 3.0f, 4.0f, 5.0f));
        List<String> operations = new ArrayList<>(Arrays.asList("+", "*", "-"));
        Calculate(numbers, operations);
        assertEquals(-5.0f, finalResult, 0.001f);
    }
}

