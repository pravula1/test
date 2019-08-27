package com.syena.cxp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import com.syena.cxp.base.Base;
import com.syena.cxp.locators.HomePageLocators;
import com.syena.cxp.util.TestUtil;
public class HomePage extends Base 
{
	HomePageLocators homepageLocators;
	TestUtil testUtil;
	public HomePage() {
		homepageLocators = PageFactory.initElements(driver, HomePageLocators.class);
		
	}
	
	//actions
	public void clicksales()
	{
		
		driver.switchTo().frame("right");
		homepageLocators.salesModule.click();
		//return new SalesPage();
		
	}
	
	/*public SalesPage clickKitchen()
	{
		testUtil.switchToFrame();
	    homepageLocators.KitchenModule.click();
	    return new KitchenPage();
	}
	*/
	
}
