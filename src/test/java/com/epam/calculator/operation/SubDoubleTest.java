package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class SubDoubleTest {
protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "second", "expected"})
    @Test(dataProvider = "dataForTestDoubleSub")
    public void testDoubleSub(double first, double second, double expected){
        double sub = calculator.sub(first, second);
        Assert.assertEquals(sub, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleSub")
    public Object[][] dataForTestDubleSub() {
        return new Object[][] {
                {23.3, 25.3, -2.0},
                {-5.0, -5.0, 0.0},
                {-3.0, 5.0, -8.0},
                {1.0, -2.0, 3.0},
                {1.0, -1.0, 2.0}
        };
    }
}
