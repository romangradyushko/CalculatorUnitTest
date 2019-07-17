package com.epam.calculator.operation.junit;


import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class SumLongTestJunit {
	private static final double DELTA = 1e-15;
    @Test
    public void sumTestDoubleNumber(){
        Calculator calculator = new Calculator();
        double sum = calculator.sum(2L, 3L);
        Assert.assertEquals("Addition result is invalid", 5L, sum, DELTA);
    }
}
