package com.syena.cxp.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SuperadminpageLocator {
	@FindBy(how=How.XPATH,using =".//*[@id='header']/table/tbody/tr/td[3]/table/tbody/tr/td/a[1]/img")
	public WebElement Home;

	//*[@id="header"]/table/tbody/tr/td[3]/table/tbody/tr/td/a[1]/img
}
