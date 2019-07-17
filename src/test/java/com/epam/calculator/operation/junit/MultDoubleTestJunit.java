package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class MultDoubleTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testDoubleMult() {
    	Calculator calculator = new Calculator();
        double mult = calculator.mult(6.0, 2.0);
        Assert.assertEquals("Mult result is invalid", 12.0, mult, DELTA);
	}
}
