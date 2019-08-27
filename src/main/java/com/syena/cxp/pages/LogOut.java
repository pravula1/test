package com.syena.cxp.pages;

import org.openqa.selenium.support.PageFactory;

import com.syena.cxp.base.Base;
import com.syena.cxp.locators.LogOutLocators;
import com.syena.cxp.util.TestUtil;

public class LogOut extends Base {
	TestUtil testUtil;
	LogOutLocators logOutLocators;
	
	public LogOut()
	{
		testUtil = new TestUtil();
		logOutLocators = PageFactory.initElements(driver, LogOutLocators.class);
	}
	
	//Actions
	
	public void clickOnLogout()
	{
		driver.switchTo().defaultContent();
		System.out.println("logout method in logout.java class");
		testUtil.switchToFrame("header");
		logOutLocators.logoutIcon.click();
		
		
	}
	
}
