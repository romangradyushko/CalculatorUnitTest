package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class MultLongTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testDoubleMult() {
    	Calculator calculator = new Calculator();
        double mult = calculator.mult(6L, 2L);
        Assert.assertEquals("Mult result is invalid", 12L, mult, DELTA);
	}
}
