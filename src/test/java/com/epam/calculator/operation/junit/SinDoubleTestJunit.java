package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class SinDoubleTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testDoubleSin() {
    	Calculator calculator = new Calculator();
        double sin = calculator.sin(90.0); 
        Assert.assertEquals("Sin result is invalid", 1.0, sin, DELTA);
	}
}
