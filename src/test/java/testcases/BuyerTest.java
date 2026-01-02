package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.TestBase;
import pages.BuyerLoginPage;
import pages.HomePage;

public class BuyerTest extends TestBase{
	
	BuyerLoginPage obj;
	HomePage hobj;
	
	@BeforeClass
	public void objInit() {
		obj=new BuyerLoginPage(driver);
		hobj=new HomePage(driver);
	}
	
	@Test(priority=1)
	public void LoginTest() {
		obj.loginClk();
		obj.loginEmail("mahi@gmail.com");
		obj.loginPass("mahi123");
	}

}
