package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class IsPositiveBooleanTest {
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
	
	@Parameters({"first", "expected"})
    @Test(groups = {"positive"}, dataProvider = "dataForTestBooleanIsPositive")
    public void testBooleanIsPositive(long first, boolean expected){
        boolean positive = calculator.isPositive(first);
        Assert.assertEquals(positive, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestBooleanIsPositive")
    public Object[][] dataForTestBooleanIsPositive() {
        return new Object[][] {
                {1, true},
                {-2, false},
                {0, false}
        };
    }
}
