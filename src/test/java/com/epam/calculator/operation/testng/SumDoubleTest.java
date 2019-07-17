package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.*;
import com.epam.tat.module4.Calculator;

public class SumDoubleTest {
	protected Calculator calculator;
	@BeforeClass
    public void setUp(){
        calculator = new Calculator();
        System.out.println("BeforeClass " + this.getClass().getSimpleName() + "run");
    }
	
	@AfterClass
    public void afterClass(){
        calculator = null;
        System.out.println("AfterClass " + this.getClass().getSimpleName() + "run");
    }
	
	@Parameters({"first", "second", "expected"})
    @Test(groups = {"positive"}, dataProvider = "dataForTestDoubleSum")
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
