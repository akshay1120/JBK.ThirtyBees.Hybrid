package com.bees.objRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bees.testBase.TestBase;

public class TinCupObjRepo extends TestBase
{
	@FindBy(xpath="//li//a[@title='Black']")
	public WebElement blackColour;
	
	@FindBy(id="quantity_wanted")
	public WebElement quantity ;
	
	@FindBy(id="add_to_cart")
	public WebElement addToCart ;
	
	@FindBy(xpath="//a[contains(text(),'Proceed to checkout')]")
	public WebElement proceedToCheckout ;
	
	@FindBy(xpath="//a[contains(text(),'Color : Black')]")
	public WebElement checkingColour ;
	
	@FindBy(xpath="//span[@class='ajax_cart_quantity']")
	public WebElement checkingQuantity ;
	
	@FindBy(xpath="//button[@class='close cross']")
	public WebElement closeTheFrame ;
	
	@FindBy(xpath="//i[@class='icon icon-fw icon-angle-up']")
	public WebElement incQuantity ;
	
	@FindBy(xpath="//a[@title='Print this page']")
	public WebElement print;
	
}
