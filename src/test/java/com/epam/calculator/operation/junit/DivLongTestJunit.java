package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class DivLongTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testLongDiv() {
    	Calculator calculator = new Calculator();
        double div = calculator.div(6L, 2L);
        Assert.assertEquals("Div result is invalid", 3L, div, DELTA);
	}
}
