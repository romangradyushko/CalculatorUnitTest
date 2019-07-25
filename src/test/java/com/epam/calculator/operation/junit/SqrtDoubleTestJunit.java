package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class SqrtDoubleTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testDoubleSqrt() {
    	Calculator calculator = new Calculator();
        double sqrt = calculator.sqrt(9.0);
        Assert.assertEquals("Sqrt root result is invalid", 3.0, sqrt, DELTA);
	}
}
