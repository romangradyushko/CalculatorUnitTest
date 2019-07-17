package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class SubLongTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testLongSub() {
    	Calculator calculator = new Calculator();
        double sum = calculator.sum(2L, 5L);
        Assert.assertEquals("Addition result is invalid", -3L, sum, DELTA);
	}
}
