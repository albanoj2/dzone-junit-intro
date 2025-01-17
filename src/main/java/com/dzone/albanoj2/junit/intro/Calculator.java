package com.dzone.albanoj2.junit.intro;

public class Calculator {

    private CalculationHistory history;

    public Calculator(CalculationHistory history) {
        this.history = history;
    }

    public int add(int a, int b) {
        int sum = a + b;
        history.append(new CompletedCalculation(a, b, sum));
        return sum;
    }
}
