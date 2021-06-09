package com.bees.objRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bees.testBase.TestBase;

public class MyAccountPgObjRepo extends TestBase
{
	@FindBy(xpath="//a[@title='Coffee and Tea']")
	public WebElement coffeeAndTeaMenu ;
	
	@FindBy(xpath="//a[@title='Addresses']")
	public WebElement MyAddresses ;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	public WebElement home ;
	
	@FindBy(xpath="//h1//following::a//span")
	public List<WebElement>options;
}