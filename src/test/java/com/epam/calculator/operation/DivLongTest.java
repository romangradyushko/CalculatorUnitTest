package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class DivLongTest {
	protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "second", "expected"})
    @Test(dataProvider = "dataForTestLongDiv")
    public void testLongDiv(long first, long second, long expected){
        long div = calculator.div(first, second);
        Assert.assertEquals(div, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestLongDiv")
    public Object[][] dataForTestLongDiv() {
        return new Object[][] {
                {5L, 5L, 1L},
                {-5L, -5L, 1L},
                {-4L, 2L, -2L},
                {10L, -2L, -5L},
                {1L, -1L, -1L}
        };
    }
}
