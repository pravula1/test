package com.syena.cxp.testcases;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import com.syena.cxp.base.Base;
import com.syena.cxp.pages.LogOut;

public class LogOutTest extends Base
{
	LogOut logout;
	
	@BeforeClass
	public void setUp() {
		logout =new LogOut();
	}
	
	@Test (priority =7)
	public void validateLogoutTest()
	{	System.out.println("logout method in logoutTest.java class");
		logout.clickOnLogout();
	}
	
	
}
