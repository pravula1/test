package com.syena.cxp.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SalesPageLocators 
{

	@FindBy(how=How.LINK_TEXT,using ="New Event")
	public WebElement newEvent;
	
}
