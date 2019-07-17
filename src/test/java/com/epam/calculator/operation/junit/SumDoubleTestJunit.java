package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;



public class SumDoubleTestJunit {
	private static final double DELTA = 1e-15;
    @Test
    public void sumTestDoubleNumber(){
        Calculator calculator = new Calculator();
        double sum = calculator.sum(2.3, 2.5);
        Assert.assertEquals("Addition result is invalid", 4.8, sum, DELTA);
    }
}
