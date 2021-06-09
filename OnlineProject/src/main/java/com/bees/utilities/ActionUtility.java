package com.bees.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility 
{
	static WebDriver driver;
	
	public static void dragAndDrop (WebElement Source , WebElement Target)
	{
		Actions act = new Actions (driver);
		act.dragAndDrop(Source, Target);
	}
	
	public static void dragAndDropByOffset (WebElement Source ,int xOffset ,int yOffset)
	{
		Actions act = new Actions (driver);
		act.dragAndDropBy(Source, xOffset, yOffset);
	}
	
	public static void moveToElement (WebElement element)
	{
		Actions act = new Actions (driver);
		act.moveToElement(element);
	}
	
	public static void doubleClick (WebElement element)
	{
		Actions act = new Actions (driver);
		act.doubleClick(element);
	}
	
	public static void moveByOffset (int xOffset , int yOffset)
	{
		Actions act = new Actions (driver);
		act.moveByOffset(xOffset, yOffset);
	}
	
	public static void clickAndHold ()
	{
		Actions act = new Actions (driver);
		act.clickAndHold();
	}
	
	public static void clickAndHoldTarget (WebElement element)
	{
		Actions act = new Actions (driver);
		act.contextClick(element);
	}
	
	public static void release()
	{
		Actions act = new Actions (driver);
		act.release();
	}
}
