package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class TgDoubleTestJunit {
	private static final double DELTA = 1e-15;
    @Test
	public void testDoubleCtg() {
    	Calculator calculator = new Calculator();
        double tg = calculator.ctg(45.0);
        Assert.assertEquals("Tg result is invalid", 1.0, tg, DELTA);
	}
}
