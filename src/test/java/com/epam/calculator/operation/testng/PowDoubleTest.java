package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class PowDoubleTest {
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
    @Test(groups = {"positive"}, dataProvider = "dataForTestDoublePow")
    public void testDoublePow(double first, double second, double expected){
        double pow = calculator.pow(first, second);
        Assert.assertEquals(pow, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoublePow")
    public Object[][] dataForTestDublePow() {
        return new Object[][] {
                {5.0, 2.0, 25.0},
                {-5.0, 5.0, -3125.0},
                {-3.0, 0, 1.0},
                {1.0, -2.0, 1.0},
                {2.0, -1.0, 0.5}
        };
    }
}
