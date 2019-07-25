package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class MultLongTest {
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
    @Test(groups = {"positive"}, dataProvider = "dataForTestLongMult")
    public void testDoubleMult(long first, long second, long expected){
        long mult = calculator.mult(first, second);
        Assert.assertEquals(mult, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestLongMult")
    public Object[][] dataForTestLongMult() {
        return new Object[][] {
                {5L, 2L, 10L},
                {-5L, -5L, 25L},
                {-3L, 5L, -15L},
                {1L, -2L, -2L},
                {1L, -1L, -1L}
        };
    }
}
