package com.epam.calculator.operation.junit;

import org.junit.Assert;
import org.junit.Test;

import com.epam.tat.module4.Calculator;

public class IsNegativeBooleanTestJunit {
	 @Test
	 public void testBooleanIsNegative() {
		 Calculator calculator = new Calculator();
	     boolean isNegative = calculator.isNegative(-5);
	     Assert.assertEquals("Number isn't negative", true, isNegative); 
	 }
}
