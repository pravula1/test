package com.syena.cxp.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.syena.cxp.base.Base;
import com.syena.cxp.pages.HomePage;

public class HomePageTest extends Base {
	HomePage homePage;
	
	@BeforeClass
	public void setUp()
	{
		homePage=new HomePage();
	}
	
	@Test (priority =4)
	public void clickOnSalesLinktest()
	{  
	
		homePage.clicksales();
			
	}
	
}
