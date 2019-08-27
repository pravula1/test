package com.syena.cxp.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageLocators {
	// pagelibraries - object repository
	@FindBy(how = How.ID, using = "CatererId")
	public WebElement catererId;

	@FindBy(how = How.ID, using = "UserName")
	public WebElement userName;

	@FindBy(how = How.ID, using = "Password")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using ="//*[@value='Go']")
	public WebElement go;
}
