package com.bees.objRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.bees.testBase.TestBase;

public class CoffeeAndTeaPgObjRepo extends TestBase
{
	@FindBy(xpath="//a[@class='login']")
	public WebElement signIn ;
	
	@FindBy(id="email")
	public WebElement emailAddr ;
	
	@FindBy(id="passwd")
	public WebElement pass ;
	
	@FindBy(id="SubmitLogin")
	public WebElement signInButton ;
	
	@FindBy(xpath="//a[@title='Coffee and Tea']")
	public WebElement coffeeAndTeaMenu ;
	
	@FindBy(xpath="//a[@style='left: 0%;']")
	public WebElement twelve ;
	
	@FindBy(xpath="//a[@style='left: 27%;']")
	public WebElement fifteen ;
	
	@FindBy(xpath="//a[contains(text(),'Mean Bean')]")
	public WebElement meanBean ;
	
	@FindBy(xpath="//picture//img[@title='Coffee']")
	public WebElement coffeeImage ;
	
	@FindBy(xpath="//select[@id='selectProductSort']")
	public WebElement sort;
	
	@FindBy(xpath="//option[@value='price:asc']")
	public WebElement sortLowestPriceFirst;
	
	@FindBy(xpath="//select[@id='selectProductSort']//following::h3")
	public List<WebElement>sortLowestPriceFirstNames;
	
	@FindBy(xpath="//span[@class='price product-price']")
	public List<WebElement>sortLowestPriceFirstPrices;
	
	@FindBy(id="search_query_top")
	public WebElement search ;
	
	@FindBy(id="layered_price_slider")
	public WebElement priceSlider ;
	
	@FindBy(xpath="//h3//a[@class='product-name']")
	public List<WebElement> PriceRangeProducts;
	
	@FindBy(xpath="//button[@title='Search']")
	public WebElement searchButton;
	
	@FindBy(xpath="//div[@class='alert alert-warning']")
	public WebElement alertWarning;
	
	@FindBy(xpath="//select[@id='selectProductSort']//following::h3")
	public List<WebElement>searchMug;
	
	@FindBy(xpath="//img[@title='Honey']")
	public WebElement clickHoney;
	
	@FindBy(xpath="//span//a[@title='More about Honey']")
	public WebElement viewedProducts;
	
	@FindBy(xpath="//img[@title='Tin Cup']")
	public WebElement clickTinCup;
	
	@FindBy(xpath="//div[@class='compare_mb']//a[@data-id-product='4']")
	public WebElement compareTinCup;
	
	@FindBy(xpath="//div[@class='compare_mb']//a[@data-id-product='6']")
	public WebElement compareMug;
	
	@FindBy(xpath="//span[contains(text(),'Compare (')]")
	public WebElement compareOption;
	
	@FindBy(tagName="h4")
	public List<WebElement> compareResult;
	
	@FindBy(xpath="//picture//img[@title='Tin Cup']")
	public WebElement TinCupImage;
	
	
}

//picture//img[@title='Tin Cup']