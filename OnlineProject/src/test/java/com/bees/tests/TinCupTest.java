package com.bees.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bees.pages.LoginPage;
import com.bees.pages.TinCupPage;
import com.bees.testBase.TestBase;

public class TinCupTest extends TestBase
{
	WebDriver driver ;
	LoginPage lp = null ;
	TinCupPage tcp = null ;
	
	@BeforeMethod
	public void OpenBrowser () throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		tcp = lp.navigateMyAccountPg().navigateToCoffeeAndTeaPg().navigateToTinCupPage();
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	
	@Test(priority=1)
	public void verifyColourOfProducts() throws Exception 
	{
		log.info("verify Colour Of Products");
		Assert.assertTrue(tcp.selectingColour());
	}
	
	@Test(priority=2)
	public void verifySelectingQuantityByInsertVal() throws Exception 
	{
		log.info("verify Selecting Quantity By Insert Val");
		Assert.assertTrue(tcp.selectingQuantityByInsertVal());
	}
	
	@Test(priority=3)
	public void verifySelectingQuantityByIncButton() throws Exception 
	{
		log.info("verify Selecting Quantity By Inc Button");
		Assert.assertTrue(tcp.selectingQuantityByIncButton());
	}
}
