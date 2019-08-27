package com.syena.cxp.pages;

import org.openqa.selenium.support.PageFactory;

import com.syena.cxp.base.Base;
import com.syena.cxp.locators.SalesPageLocators;

public class SalesPage extends Base
{

	SalesPageLocators salespageLocators;
	public SalesPage() 
	{
		//Initializing the page objects
		salespageLocators = PageFactory.initElements(driver,SalesPageLocators.class);
		
	}
	 public void clickNeweventLink()
	 {  
		
			 driver.switchTo().frame("header");
		    salespageLocators.newEvent.click();
		    //return new NewEvent();
		
	 }
		

}
