package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class SubDoubleTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testDoubleSub() {
    	Calculator calculator = new Calculator();
        double sub = calculator.sub(3.7, 2.1);
        Assert.assertEquals("Sub result is invalid", 1.6, sub, DELTA);
	}
}
