package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TgDoubleTest {
protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "expected"})
    @Test(dataProvider = "dataForTestDoubleTg")
    public void testDoubleTg(double first, double expected){
        double tg = calculator.tg(first);
        Assert.assertEquals(tg, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleTg")
    public Object[][] dataForTestDubleTg() {
        return new Object[][] {
                {0, 0},
                {1.0471975511965976, 1.7320508075688767}
        };
    }
}
