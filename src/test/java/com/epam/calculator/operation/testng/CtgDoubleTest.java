package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class CtgDoubleTest {
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
    @Test(groups = {"positive"}, dataProvider = "dataForTestDoubleCtg")
    public void testDoubleCtg(double first, double expected){
        double ctg = calculator.ctg(first);
        Assert.assertEquals(ctg, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleCtg")
    public Object[][] dataForTestDoubleCtg() {
        return new Object[][] {
                {0.78539816339, 1.0},
                {1.0471975511965976, 0.577350269189626}
        };
    }
}
