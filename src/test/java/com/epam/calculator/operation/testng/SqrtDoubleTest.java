package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class SqrtDoubleTest {
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
    @Test(groups = {"positive"}, dataProvider = "dataForTestDoubleSqrt")
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
