package com.bees.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bees.objRepository.CoffeeAndTeaPgObjRepo;
import com.bees.utilities.ExcelUtility;
import com.bees.utilities.RobotUtility;
import com.bees.utilities.Utility;
import com.bees.utilities.WaitUtility;

public class CoffeeAndTeaPage extends CoffeeAndTeaPgObjRepo
{
	WebDriver driver ;
	
	public CoffeeAndTeaPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean sortProductByPrice_LowestFirst() throws Exception 
	{
		RobotUtility.downKey();
		
		Utility.click(sortLowestPriceFirst);
		WaitUtility.sleep(6000);
		
		ArrayList<String> actData = new ArrayList<>();
		for (WebElement element : sortLowestPriceFirstNames) 
		{
			String text = element.getText();
			actData.add(text);
		}
		log.info("actData = " + actData);
		
		ArrayList<String> expData = ExcelUtility.getTableColData("TheBees.xlsx", "ascendingOrderPrices", 0 , 1);
		log.info("expData = " + expData);
		
		if (actData.equals(expData))
		{
			log.info("Actual and Expected list matched");
			return true;
		}
		else
		{
			log.info("Actual and Expected list not matched");
			return false;
		}
	}
	
	
	//2
	public boolean meanBeanFlavor() throws Exception
	{
		for (int i=0 ; i<3 ; i++)
		{
			RobotUtility.downKey();
		}
		WaitUtility.waitForPageLoad(10 , driver);
		WaitUtility.implicitWait(10 , driver);
		WaitUtility.sleep(5000);
		
		log.info("Clicking on Mean Bean flavor");
		Utility.click(meanBean);
		WaitUtility.waitForPageLoad(10 , driver);
		WaitUtility.implicitWait(10 , driver);
		WaitUtility.sleep(5000);
		
		if(coffeeImage.isDisplayed())
		{
			log.info("coffee Image is Displayed");
			return true;
		}
		else
		{
			log.info("coffee Image is not Displayed");
			return false ;
		}	
	}
	
	
	//3
	public boolean searchInvalidProduct() 
	{
		String product = "@#$" ;
		Utility.sendkeys(search, product);
		Utility.click(searchButton);
		
		String actAlertMessage = Utility.getText(alertWarning);
		log.info("actAlertMessage = " + actAlertMessage);
		
		String expAlertMessage = "No results were found for your search \"@#$\"" ;
		log.info("expAlertMessage = " + expAlertMessage);
		
		if(actAlertMessage.equals(expAlertMessage))
		{
			log.info("actAlertMessage and expAlertMessage matched");
			return true ;
		}
		else
		{
			log.info("actAlertMessage and expAlertMessage not matched");
			return false ;
		}
	} 
	
	
	//4
	public boolean searchMug() throws Exception
	{
		String product = "MUG" ;
		Utility.sendkeys(search, product);
		Utility.click(searchButton);
		WaitUtility.sleep(4000);
		
		ArrayList<String> actData = new ArrayList<>();
		for (WebElement element : searchMug) 
		{
			String text = element.getText();
			actData.add(text);
		}
		log.info("actData = " + actData);
		
		ArrayList<String> expData = new ArrayList<>();
		expData.add("MUG");
		log.info("expData = " + expData);
		
		if (actData.equals(expData))
		{
			log.info("actdata and expdata matched");
			return true;
		}
		else
		{
			log.info("actdata and expdata not matched");
			return false;
		}
	}
	
	//5
	public boolean viewedProducts() throws Exception
	{
		for (int i=0 ; i<5 ; i++)
		{
			RobotUtility.downKey();	
		}
		WaitUtility.waitForPageLoad(10 , driver);
		WaitUtility.implicitWait(10 , driver);
		WaitUtility.sleep(2000);
		
		log.info("Clicking on Honey");
		Utility.click(clickHoney);
		WaitUtility.waitForPageLoad(10 , driver);
		WaitUtility.implicitWait(10 , driver);
		WaitUtility.sleep(4000);
		
		Utility.navigateBack(driver);
		WaitUtility.waitForPageLoad(10 , driver);
		WaitUtility.implicitWait(10 , driver);
		WaitUtility.sleep(4000);
		
		Utility.navigateRefresh(driver);
		WaitUtility.waitForPageLoad(10 , driver);
		WaitUtility.implicitWait(10 , driver);
		WaitUtility.sleep(4000);
		
		RobotUtility.downKey();	
		WaitUtility.sleep(2000);
		
		String actualProduct = Utility.getText(viewedProducts);
		log.info("actualProduct = " + actualProduct);
		
		String expectedProduct = "Honey";
		log.info("expectedProduct = " + expectedProduct);
		
		if(actualProduct.equals(expectedProduct))
		{
			log.info("actualProduct and expectedProduct matched");
			return true ;
		}
		else
		{
			log.info("actualProduct and expectedProduct not matched");
			return false ;
		}
	}
	
	//6
	public boolean selectPriceRange() throws Exception
	{
		for (int i=0 ; i<3 ; i++)
		{
			RobotUtility.downKey();
		}
		WaitUtility.waitForPageLoad(10 , driver);
		WaitUtility.implicitWait(10 , driver);
		WaitUtility.sleep(5000);
		
		Utility.click(priceSlider);
		WaitUtility.sleep(5000);
		
		ArrayList<String> actData = new ArrayList<>();
		for (WebElement element : PriceRangeProducts) 
		{
			String text = element.getText();
			actData.add(text);
		}
		log.info("actData = " + actData);
		
		ArrayList<String> expData = new ArrayList<>();
		expData.add("COFFEE");
		expData.add("TEA");
		expData.add("HONEY");
		log.info("expData = " + expData);
		
		if (actData.equals(expData))
		{
			log.info("actdata and expdata matched");
			return true;
		}
		else
		{
			log.info("actdata and expdata not matched");
			return false;
		}
	}
	
	
	public TinCupPage navigateToTinCupPage() throws Exception
	{
		RobotUtility.downKey();
		
		Utility.click(clickTinCup);
		WaitUtility.waitForPageLoad(10 , driver);
		WaitUtility.implicitWait(10 , driver);
		
		return new TinCupPage(driver);
	}
}
