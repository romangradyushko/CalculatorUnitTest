package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class CtgDoubleTest {
	protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "expected"})
    @Test(dataProvider = "dataForTestDoubleCtg")
    public void testDoubleCtg(double first, double expected){
        double ctg = calculator.ctg(first);
        Assert.assertEquals(ctg, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleCtg")
    public Object[][] dataForTestDoubleCtg() {
        return new Object[][] {
                {0.78539816339, 1.0},
                {1.0471975511965976, 0.577350269189626}
        };
    }
}
