package com.syena.cxp.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.syena.cxp.pages.SalesPage;

public class SalesPageTest 
{
	SalesPage salesPage ;

	@BeforeClass
	public void setUp()
	{
		salesPage = new SalesPage();
	}
	
	@Test(priority = 5)
	public void clickOnNewEventLinkTest()
	{
		 salesPage.clickNeweventLink();
		
	}

	
	
}
