package com.bees.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bees.pages.LoginPage;
import com.bees.testBase.TestBase;
import com.bees.utilities.ExcelUtility;

public class LoginTest extends TestBase
{
	WebDriver driver ;
	LoginPage lp = null ;
	
	@BeforeMethod
	public void OpenBrowser () throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
	}
	
	@Test(priority=1)
	public void verifyValidLogin() 
	{
		log.info("verify Valid Login");
		Assert.assertTrue(lp.validLogin());
	}
	
	@Test(priority=2)
	public void verifyLoginDataUsingExcel() throws Exception 
	{
		log.info("verifying Login Data Using Excel");
		lp.loginWithExcelData(ExcelUtility.readUnameAndPass("TheBees.xlsx" , "LoginData" , 0, 1, 1));
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
	}
}
