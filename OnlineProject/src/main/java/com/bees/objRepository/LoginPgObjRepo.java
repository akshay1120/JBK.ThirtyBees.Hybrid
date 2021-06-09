package com.bees.objRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bees.testBase.TestBase;

public class LoginPgObjRepo extends TestBase
{
	@FindBy(xpath="//a[@class='login']")
	public WebElement signIn ;
	
	@FindBy(id="email")
	public WebElement emailAddr ;
	
	@FindBy(id="passwd")
	public WebElement pass ;
	
	@FindBy(id="SubmitLogin")
	public WebElement signInButton ;
	
	@FindBy(xpath="//a[@class='logout']")
	public WebElement signOut ;
}
