package com.syena.cxp.pages;

import org.openqa.selenium.support.PageFactory;

import com.syena.cxp.base.Base;
import com.syena.cxp.locators.LoginPageLocators;

public class Login extends Base {
	LoginPageLocators loginPageLocators;

	// Intlializating the Page objects
	public Login() {

		// here this refers to current class objects
		loginPageLocators = PageFactory.initElements(driver, LoginPageLocators.class);
	}

	// Actions
	public boolean login(String catereid, String Userid, String pwd) {
		try

		{
			loginPageLocators.catererId.sendKeys(catereid);
			loginPageLocators.userName.sendKeys(Userid);
			loginPageLocators.password.sendKeys(pwd);
			loginPageLocators.go.click();
			Thread.sleep(1000);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.equalsIgnoreCase("Superadmin - UserMapping")) {
				test = true;
			} else {
				test = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			test = false;
		}
		return test;
 	}
}
