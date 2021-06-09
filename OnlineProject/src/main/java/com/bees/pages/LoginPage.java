package com.bees.pages;

import java.util.HashMap;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.bees.objRepository.LoginPgObjRepo;
import com.bees.utilities.Utility;
import com.bees.utilities.WaitUtility;

public class LoginPage extends LoginPgObjRepo
{
	WebDriver driver ;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver ;
		PageFactory.initElements(driver, this);
	}
	
	
	//1
	public boolean validLogin ()
	{
		Utility.click(signIn);
		WaitUtility.waitForPageLoad(5);
		WaitUtility.implicitWait(5);
		
		Utility.sendkeys(emailAddr, "asjain3031@gmail.com");
		Utility.sendkeys(pass, "425114");
		Utility.click(signInButton);
		WaitUtility.waitForPageLoad(5);
		WaitUtility.implicitWait(5);
		
		String actUrl = Utility.getCurrentUrl(driver);
		log.info("actual Url = " + actUrl);
		
		String expUrl = "http://javabykiran.in/Other/thbees/my-account";
		log.info("Expected Url = " + expUrl);
		
		if(actUrl.equals(expUrl))
		{
			log.info("Actual and expected Url matched");
			return true ;
		}
		else
		{
			log.info("Actual and expected Url not matched");
			return false ;
		}
	}
	
	
	//2
	public void loginWithExcelData(HashMap<String,String> hm) throws Exception
	{
		Utility.click(signIn);
		WaitUtility.waitForPageLoad(5);
		WaitUtility.implicitWait(5);
		
		Set<String> keys = hm.keySet();
		
		for (String key : keys)
		{
			Utility.sendkeys(emailAddr, key);
			Utility.sendkeys(pass, hm.get(key));
			Utility.click(signInButton);
			WaitUtility.sleep(2000);
			log.info(Utility.getTitle(driver));
			
			if(Utility.getTitle(driver).equals("My account - BEE"))
			{
				log.info("Valid Data = Username : "+ key + "    Password :" + hm.get(key));
				Utility.click(signOut);
				WaitUtility.sleep(2000);
			}
			else
			{
				log.info("Invalid Data = Username : "+ key + "    Password :" + hm.get(key));
				Utility.clear(emailAddr);
				Utility.clear(pass);
			}
		}
	}
	
	public MyAccountPage navigateMyAccountPg() 
	{
		Utility.click(signIn);
		WaitUtility.waitForPageLoad(5);
		WaitUtility.implicitWait(5);
		
		Utility.sendkeys(emailAddr, "asjain3031@gmail.com");
		Utility.sendkeys(pass, "425114");
		Utility.click(signInButton);
		WaitUtility.waitForPageLoad(5);
		WaitUtility.implicitWait(5);
		
		return new MyAccountPage(driver);
	}
}
