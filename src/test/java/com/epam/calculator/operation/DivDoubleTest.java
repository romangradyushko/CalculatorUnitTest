package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class DivDoubleTest {
	protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "second", "expected"})
    @Test(dataProvider = "dataForTestDoubleDiv")
    public void testDoubleDiv(double first, double second, double expected){
        double div = calculator.div(first, second);
        Assert.assertEquals(div, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleDiv")
    public Object[][] dataForTestDubleMult() {
        return new Object[][] {
                {5.0, 2.0, 2.5},
                {-5.0, -5.0, 1.0},
                {-5.0, 5.0, -1.0},
                {1.0, -2.0, -0.5},
                {6.0, 3.0, 2.0}
        };
    }
}
