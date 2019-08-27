package com.syena.cxp.pages;

import org.openqa.selenium.support.PageFactory;

import com.syena.cxp.base.Base;
import com.syena.cxp.locators.SuperadminpageLocator;


public class SuperadminPage extends Base {
	SuperadminpageLocator superadminpageLocators;
		
	    public SuperadminPage()
		{
	    	superadminpageLocators = PageFactory.initElements(driver, SuperadminpageLocator.class );
		}
		
		//action
		/*public String  validateHomePageTitle()
		{
			return driver.getTitle();
		}*/
		public Boolean validateImage() {
				driver.switchTo().frame("header");
				if (superadminpageLocators.Home.isDisplayed())
				{
					test =true;
				}
				else
				{
					test=false;
				}
				return test;
		}
		
		public void clickHome()
		{
			//driver.switchTo().frame("header");
			superadminpageLocators.Home.click();
			
			
			
		}
}
