package com.bees.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bees.objRepository.MyAccountPgObjRepo;
import com.bees.utilities.ExcelUtility;
import com.bees.utilities.Utility;
import com.bees.utilities.WaitUtility;

public class MyAccountPage extends MyAccountPgObjRepo
{
	WebDriver driver ;
	
	public MyAccountPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	
	//1
	public boolean options() throws Exception
	{
		ArrayList <String> actData = Utility.getListOfElements(options);
		log.info("actData = " + actData);
		
		ArrayList <String> expData = ExcelUtility.getTableColData("TheBees.xlsx", "MyAccountPage", 0, 1);
		log.info("expData = " + expData);
		
		if(actData.equals(expData))
		{
			log.info("Actual and Expected list matched");
			return true ;
		}
		else
		{
			log.info("Actual and Expected list not matched");
			return false ;
		}	
	}
	
	
	public CoffeeAndTeaPage navigateToCoffeeAndTeaPg() 
	{
		Utility.click(coffeeAndTeaMenu);
		WaitUtility.waitForPageLoad(5);
		WaitUtility.implicitWait(5);
		return new CoffeeAndTeaPage(driver);
	}

}
