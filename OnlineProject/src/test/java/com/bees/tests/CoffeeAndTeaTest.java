package com.bees.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.bees.pages.CoffeeAndTeaPage;
import com.bees.pages.LoginPage;
import com.bees.testBase.TestBase;

public class CoffeeAndTeaTest extends TestBase
{
	WebDriver driver ;
	LoginPage lp = null ;
	CoffeeAndTeaPage ct = null ;
	
	@BeforeMethod
	public void OpenBrowser () throws Exception
	{
		driver = initialization();
		lp = new LoginPage(driver);
		ct = lp.navigateMyAccountPg().navigateToCoffeeAndTeaPg();
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}
	
	@Test(priority=1)
	public void verifySortProductByPrices() throws Exception 
	{
		log.info("verify Sort Product By Prices");
		Assert.assertTrue(ct.sortProductByPrice_LowestFirst());
	}
	
	@Test(priority=2)
	public void verifyFilterByFlavor() throws Exception 
	{
		log.info("verify Filter By Flavor");
		Assert.assertTrue(ct.meanBeanFlavor());
	}
	
	@Test(priority=3)
	public void searchInvalidProduct() throws Exception 
	{
		log.info("searching Invalid Product");
		Assert.assertTrue(ct.searchInvalidProduct());
	}
	
	@Test(priority=4)
	public void verifySearchMug() throws Exception
	{
		log.info("Searching valid product - MUG");
		Assert.assertTrue(ct.searchMug());
	}
	
	@Test(priority=5)
	public void verifyViewedProducts() throws Exception
	{
		log.info("Verifying Viewed Products");
		Assert.assertTrue(ct.viewedProducts());
	}
	
	@Test(priority=6)
	public void VerifySelectPriceRange() throws Exception
	{
		log.info("Verifying Select Price Range Option");
		Assert.assertTrue(ct.selectPriceRange());
	}
}
