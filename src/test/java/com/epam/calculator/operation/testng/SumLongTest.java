package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.*;

import com.epam.tat.module4.Calculator;

public class SumLongTest {
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
    @Test(groups = {"positive"}, dataProvider = "dataForTestLongSum")
    public void testLongSum(long first, long second, long expected){
        long sum = calculator.sum(first, second);
        Assert.assertEquals(sum, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestLongSum")
    public Object[][] dataForTestLongSum() {
        return new Object[][] {
                {1L, 2L, 3L},
                {-5L, -5L, -10L},
                {-3L, 5L, 2L},
                {1L, -2L, -1L},
                {1L, -1L, 0L}
        };
    }
}
