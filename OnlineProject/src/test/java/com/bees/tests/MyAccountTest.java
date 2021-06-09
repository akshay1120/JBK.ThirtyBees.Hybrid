package com.bees.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bees.pages.LoginPage;
import com.bees.pages.MyAccountPage;
import com.bees.testBase.TestBase;

public class MyAccountTest extends TestBase
{
	WebDriver driver ;
	LoginPage lp = null ;
	MyAccountPage map = null ; 
	
	@BeforeMethod
	public void OpenBrowser () throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		map = lp.navigateMyAccountPg();
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	
	@Test(priority=1)
	public void verifyoptions() throws Exception 
	{
		log.info("Verifying options of My Account Page");
		Assert.assertTrue(map.options());
	}
}
