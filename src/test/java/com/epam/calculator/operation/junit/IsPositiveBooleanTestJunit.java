package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class IsPositiveBooleanTestJunit {
	 @Test
	 public void testBooleanIsPositive() {
		 Calculator calculator = new Calculator();
	     boolean isPositive = calculator.isPositive(2);
	     Assert.assertEquals("Number isn't positive", true, isPositive); 
	 }
}
