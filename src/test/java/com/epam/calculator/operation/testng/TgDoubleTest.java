package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class TgDoubleTest {
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
    @Test(groups = {"positive"}, dataProvider = "dataForTestDoubleTg")
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
