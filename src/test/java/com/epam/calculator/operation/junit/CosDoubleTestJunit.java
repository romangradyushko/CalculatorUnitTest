package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class CosDoubleTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testDoubleCos(){
    	Calculator calculator = new Calculator();
        double cos = calculator.cos(60.0);
        Assert.assertEquals("Cos result is invalid", 0.5, cos, DELTA);
	}
}
