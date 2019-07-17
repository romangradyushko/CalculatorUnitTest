package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class DivDoubleTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testDoubleDiv() {
    	Calculator calculator = new Calculator();
        double div = calculator.div(6.0, 2.0);
        Assert.assertEquals("Div result is invalid", 3.0, div, DELTA);
	}
}
