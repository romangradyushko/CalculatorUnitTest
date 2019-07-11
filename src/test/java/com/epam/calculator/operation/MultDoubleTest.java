package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class MultDoubleTest {
protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "second", "expected"})
    @Test(dataProvider = "dataForTestDoubleMult")
    public void testDoubleMult(double first, double second, double expected){
        double mult = calculator.mult(first, second);
        Assert.assertEquals(mult, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleMult")
    public Object[][] dataForTestDubleMult() {
        return new Object[][] {
                {5.0, 2.0, 10.0},
                {-5.0, -5.0, 25.0},
                {-3.0, 5.0, -15.0},
                {1.0, -2.0, -2.0},
                {1.0, -1.0, -1.0}
        };
    }
}
