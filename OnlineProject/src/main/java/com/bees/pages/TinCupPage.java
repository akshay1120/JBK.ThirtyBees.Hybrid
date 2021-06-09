package com.bees.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bees.objRepository.TinCupObjRepo;
import com.bees.utilities.Utility;
import com.bees.utilities.WaitUtility;

public class TinCupPage extends TinCupObjRepo
{
	WebDriver driver ;
	
	public TinCupPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	//1
	public boolean selectingColour() throws Exception
	{
		Utility.click(blackColour);
		WaitUtility.sleep(2000);
		
		Utility.click(addToCart);
		WaitUtility.sleep(2000);
		
		Utility.click(proceedToCheckout);
		WaitUtility.sleep(2000);
		
		String actColour = Utility.getText(checkingColour);
		WaitUtility.sleep(2000);
		log.info("actColour = " + actColour);
		
		String expColour = "Color : Black" ;
		log.info("expColour = " + expColour);
		
		if(actColour.equals(expColour))
		{
			log.info("actcolour and expcolour matched");
			return true ;
		}
		else
		{
			log.info("actcolour and expcolour not matched");
			return false ;
		}
	}
	
	
	
	public boolean selectingQuantityByInsertVal() throws Exception
	{
		Utility.click(quantity);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_RIGHT);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		WaitUtility.sleep(2000);
		
		Utility.sendkeys(quantity, "10");
		WaitUtility.sleep(2000);
		
		Utility.click(addToCart);
		WaitUtility.sleep(2000);
		
		Utility.click(closeTheFrame);
		WaitUtility.sleep(2000);
		
		String actQuantity = Utility.getText(checkingQuantity);
		WaitUtility.sleep(2000);
		log.info("actQuantity = " + actQuantity);
		
		String expQuantity = "10" ;
		log.info("expQuantity = " + expQuantity);
		
		if(actQuantity.equals(expQuantity))
		{
			log.info("actQuantity and expQuantity matched");
			return true ;
		}
		else
		{
			log.info("actQuantity and expQuantity not matched");
			return false ;
		}
	}
	
	
	
	public boolean selectingQuantityByIncButton() throws Exception
	{
		int i ;
		
		for(i=1 ; i<11 ; i++)
		{
			Utility.click(incQuantity);
		}
		
		Utility.click(addToCart);
		WaitUtility.sleep(2000);
		
		Utility.click(closeTheFrame);
		WaitUtility.sleep(2000);
		
		String actQuantity = Utility.getText(checkingQuantity);
		WaitUtility.sleep(2000);
		log.info("actQuantity = " + actQuantity);
		
		String expQuantity = String.valueOf(i) ;
		log.info("expQuantity = " + expQuantity);
		
		if(actQuantity.equals(expQuantity))
		{
			log.info("actQuantity and expQuantity matched");
			return true ;
		}
		else
		{
			log.info("actQuantity and expQuantity not matched");
			return false ;
		}
	}
	
}
