package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.*;

import com.epam.tat.module4.Calculator;

public class SumLongTest {
	protected Calculator calculator = new Calculator();

	@Parameters({"first", "second", "expected"})
    @Test(dataProvider = "dataForTestLongSum")
    public void testLongSum(long first, long second, long expected){
        long sum = calculator.sum(first, second);
        Assert.assertEquals(sum, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestLongSum")
    public Object[][] dataForTestLongSum() {
        return new Object[][] {
                {1L, 2L, 3L},
                {-5L, -5L, -10L},
                {-3L, 5L, 2L},
                {1L, -2L, -1L},
                {1L, -1L, 0L}
        };
    }
}
