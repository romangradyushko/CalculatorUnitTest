package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class MultLongTest {
	protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "second", "expected"})
    @Test(dataProvider = "dataForTestLongMult")
    public void testDoubleMult(long first, long second, long expected){
        long mult = calculator.mult(first, second);
        Assert.assertEquals(mult, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestLongMult")
    public Object[][] dataForTestLongMult() {
        return new Object[][] {
                {5L, 2L, 10L},
                {-5L, -5L, 25L},
                {-3L, 5L, -15L},
                {1L, -2L, -2L},
                {1L, -1L, -1L}
        };
    }
}
