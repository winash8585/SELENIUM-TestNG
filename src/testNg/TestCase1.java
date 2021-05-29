package testNg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
     @Test(groups = {"Smoke"})
	public  void test1() {
	System.out.println("Inside Test");

	}
@Test(groups = {"Regression"})
public  void test2() {
	System.out.println(" Inside 2nd Test");

	}
@AfterMethod
public void afterMethod() {
	System.out.println("After Method");
}
@AfterTest
public void afterTest() {
	System.out.println("After Test");
}

}
