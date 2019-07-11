package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class IsPositiveBooleanTest {
	protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "expected"})
    @Test(dataProvider = "dataForTestBooleanIsPositive")
    public void testBooleanIsPositive(long first, boolean expected){
        boolean positive = calculator.isPositive(first);
        Assert.assertEquals(positive, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestBooleanIsPositive")
    public Object[][] dataForTestBooleanIsPositive() {
        return new Object[][] {
                {1, true},
                {-2, false},
                {0, false}
        };
    }
}
