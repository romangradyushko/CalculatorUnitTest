package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class DivLongTest {
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
    @Test(groups = {"positive"}, dataProvider = "dataForTestLongDiv")
    public void testLongDiv(long first, long second, long expected){
        long div = calculator.div(first, second);
        Assert.assertEquals(div, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestLongDiv")
    public Object[][] dataForTestLongDiv() {
        return new Object[][] {
                {5L, 5L, 1L},
                {-5L, -5L, 1L},
                {-4L, 2L, -2L},
                {10L, -2L, -5L},
                {1L, -1L, -1L}
        };
    }
}
