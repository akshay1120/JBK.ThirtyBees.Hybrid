package com.bees.utilities;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility 
{
	static WebDriver driver;
	
	// 1
	public static void waitForPageLoad (long timeInSec)
	{
		driver.manage().timeouts().pageLoadTimeout(timeInSec, TimeUnit.SECONDS);
	}
	
	// 2
	public static void implicitWait (long timeInSec)
	{
		driver.manage().timeouts().implicitlyWait(timeInSec, TimeUnit.SECONDS);
	}
	
	// 3
	public static void explicitWaitElement (long timeInSec , WebElement element)
	{
		WebDriverWait wait = new WebDriverWait (driver , timeInSec);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	// 4
	public static void explicitWaitListOfElements (long timeInSec , List<WebElement> elements)
	{
		WebDriverWait wait = new WebDriverWait (driver , timeInSec);
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
	}
	
	// 5
	public static void explicitWaitAlert (long timeInSec)
	{
		WebDriverWait wait = new WebDriverWait (driver , timeInSec);
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	// 6
	public static void explicitWaitWindow (long timeInSec , int noOfWindows)
	{
		WebDriverWait wait = new WebDriverWait (driver , timeInSec);
		wait.until(ExpectedConditions.numberOfWindowsToBe(noOfWindows));
	}
	
	// 7
	public static void sleep (long timeInMillis) throws Exception
	{
		Thread.sleep(timeInMillis);
	}
}
