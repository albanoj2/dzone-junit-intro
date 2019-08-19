package com.dzone.albanoj2.junit.intro;

import java.util.ArrayList;
import java.util.List;

public class CalculationHistory {

    private final List<CompletedCalculation> calculations = new ArrayList<>();

    public void append(CompletedCalculation calculation) {
        calculations.add(calculation);
    }

    public List<CompletedCalculation> getCalculations() {
        return calculations;
    }
}
