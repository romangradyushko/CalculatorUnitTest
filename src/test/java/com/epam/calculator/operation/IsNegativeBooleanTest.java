package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class IsNegativeBooleanTest {
	protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "expected"})
    @Test(dataProvider = "dataForTestBooleanIsNegative")
    public void testBooleanIsNegative(long first, boolean expected){
        boolean negative = calculator.isNegative(first);
        Assert.assertEquals(negative, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestBooleanIsNegative")
    public Object[][] dataForTestBooleanIsNegative() {
        return new Object[][] {
                {1, false},
                {-2, true},
                {0, false}
        };
    }
}
