package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class PowDoubleTest {
	protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "second", "expected"})
    @Test(dataProvider = "dataForTestDoublePow")
    public void testDoublePow(double first, double second, double expected){
        double pow = calculator.pow(first, second);
        Assert.assertEquals(pow, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoublePow")
    public Object[][] dataForTestDublePow() {
        return new Object[][] {
                {5.0, 2.0, 25.0},
                {-5.0, 5.0, -3125.0},
                {-3.0, 0, 1.0},
                {1.0, -2.0, 1.0},
                {2.0, -1.0, 0.5}
        };
    }
}
