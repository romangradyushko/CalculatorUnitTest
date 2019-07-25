package com.epam.calculator.operation;

import org.testng.Assert;
import org.testng.annotations.*;
import com.epam.tat.module4.Calculator;

public class SumDoubleTest {
	//protected Calculator calculator;
	protected Calculator calculator = new Calculator();
	
	@Parameters({"first", "second", "expected"})
    @Test(dataProvider = "dataForTestDoubleSum")
    public void testDoubleSum(double first, double second, double expected){
        double sum = calculator.sum(first, second);
        Assert.assertEquals(sum, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleSum")
    public Object[][] dataForTestDubleSum() {
        return new Object[][] {
                {23.0, 25.3, 48.3},
                {-5.0, -5.0, -10.0},
                {-3.0, 5.0, 2.0},
                {1.0, -2.0, -1.0},
                {1.0, -1.0, 0}
        };
    }
}
