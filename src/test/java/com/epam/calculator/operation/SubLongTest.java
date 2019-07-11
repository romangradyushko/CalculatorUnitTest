package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class SubLongTest {
	protected Calculator calculator = new Calculator();

	@Parameters({"first", "second", "expected"})
    @Test(dataProvider = "dataForTestLongSub")
    public void testLongSub(long first, long second, long expected){
        long sub = calculator.sub(first, second);
        Assert.assertEquals(sub, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestLongSub")
    public Object[][] dataForTestLongSub() {
        return new Object[][] {
                {1L, 2L, -1L},
                {-5L, -5L, 0L},
                {-3L, 5L, -8L},
                {1L, -2L, 3L},
                {1L, -1L, 2L}
        };
    }
}
