package com.dzone.albanoj2.junit.intro;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {

    private CalculationHistory history;
    private Calculator calculator;

    @Before
    public void setUp() {
        history = Mockito.mock(CalculationHistory.class);
        calculator = new Calculator(history);
    }

    @Test
    public void givenDefaultCalculator_WhenAddingTwoNonZeroValues_ThenResultIsSum() {

        int result = calculator.add(0, 1);              // When

        assertEquals(1, result);                        // Then
    }

    @Test
    public void givenDefaultCalculator_WhenAddingTwoNonZeroValues_ThenEntryIsAddedToHistory() {

        calculator.add(0, 1);                                                       // When

        Mockito.verify(history, times(1)).append(any(CompletedCalculation.class));  // Then
    }
}
