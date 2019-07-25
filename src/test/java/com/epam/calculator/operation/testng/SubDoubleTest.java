package com.epam.calculator.operation.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class SubDoubleTest {
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
    @Test(groups = {"positive"}, dataProvider = "dataForTestDoubleSub")
    public void testDoubleSub(double first, double second, double expected){
        double sub = calculator.sub(first, second);
        Assert.assertEquals(sub, expected);
	}
	
	@DataProvider(parallel = true, name = "dataForTestDoubleSub")
    public Object[][] dataForTestDubleSub() {
        return new Object[][] {
                {23.3, 25.3, -2.0},
                {-5.0, -5.0, 0.0},
                {-3.0, 5.0, -8.0},
                {1.0, -2.0, 3.0},
                {1.0, -1.0, 2.0}
        };
    }
}
