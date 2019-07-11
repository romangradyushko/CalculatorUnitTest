package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class CosDoubleTest {
	protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "expected"})
    @Test(dataProvider = "dataForTestDoubleCos")
    public void testDoubleCos(double first, double expected){
        double cos = calculator.cos(first);
        Assert.assertEquals(cos, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleCos")
    public Object[][] dataForTestDubleCos() {
        return new Object[][] {
                {0, 1.0},
                {1.0471975511965976, 0.5}
        };
    }
}
