package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class PowDoubleTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testDoublePow() {
    	Calculator calculator = new Calculator();
        double pow = calculator.pow(2.0, 3.0);
        Assert.assertEquals("Pow result is invalid", 8.0, pow, DELTA);
	}
}
