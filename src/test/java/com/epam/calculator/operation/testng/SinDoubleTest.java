package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class SinDoubleTest {
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
    @Test(groups = {"positive"}, dataProvider = "dataForTestDoubleSin")
    public void testDoubleSin(double first, double expected){
        double sin = calculator.sin(first);
        Assert.assertEquals(sin, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleSin")
    public Object[][] dataForTestDubleSin() {
        return new Object[][] {
                {0, 0},
                {1.0471975511965976, 0.8660254037844386}
        };
    }
}
