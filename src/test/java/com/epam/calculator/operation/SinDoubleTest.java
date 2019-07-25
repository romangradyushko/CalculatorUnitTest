package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class SinDoubleTest {
protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "expected"})
    @Test(dataProvider = "dataForTestDoubleSin")
    public void testDoubleSin(double first, double expected){
        double sin = calculator.sin(first);
        Assert.assertEquals(sin, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleSin")
    public Object[][] dataForTestDubleSin() {
        return new Object[][] {
                {0, 0},
                {1.0471975511965976, 0.8660254037844386}
        };
    }
}
