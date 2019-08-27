package com.syena.cxp.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.syena.cxp.base.Base;
import com.syena.cxp.pages.HomePage;
import com.syena.cxp.pages.Login;

public class LoginPageTest extends Base 
{
	// DECLARATION OF VARIABLE
	Login loginPage;
	HomePage homePage;

	@BeforeClass
	public void setUp() {
		intilization();
		// OBJECT OF LOGIN PAGE CLASS LOGIN() -CONSTRUCTOR
		loginPage = new Login();
	}

	@Test(priority = 1)
	public void validateLoginTest() {
		try {
			
		String caterer = properties.getProperty("catererid");
		String userid = properties.getProperty("userid");
		String password = properties.getProperty("password");
		Assert.assertTrue(loginPage.login(caterer, userid, password));
		
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}
	
	@AfterTest
	public void quit() {
		driver.quit();
	}

}
