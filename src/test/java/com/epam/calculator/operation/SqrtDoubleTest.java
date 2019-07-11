package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class SqrtDoubleTest {
	protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "expected"})
    @Test(dataProvider = "dataForTestDoubleSqrt")
    public void testDoubleSqrt(double first, double expected){
        double sqrt = calculator.sqrt(first);
        Assert.assertEquals(sqrt, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleSqrt")
    public Object[][] dataForTestDubleSqrt() {
        return new Object[][] {
                {25.0, 5.0},
                {36.0, 6.0},
                {4.0, 2.0},
                {9.0, 3.0},
                {16.0, 4.0}
        };
    }
}
