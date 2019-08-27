package com.syena.cxp.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.syena.cxp.base.Base;

public class HomePageLocators
{
	@FindBy(how=How.XPATH,using ="//*[@id=\"browse\"]/tbody/tr[5]/td/a")
	public WebElement salesModule;
	
	/*@FindBy(how=How.LINK_TEXT, using ="//*[@id=\"browse\"]/tbody/tr[3]/td/a")
	public WebElement KitchenModule;*/
}
