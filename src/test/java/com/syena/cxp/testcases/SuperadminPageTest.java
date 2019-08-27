package com.syena.cxp.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.syena.cxp.pages.HomePage;
import com.syena.cxp.pages.SuperadminPage;

public class SuperadminPageTest {
	SuperadminPage superadminPage;

	@BeforeClass
	public void setup() {
		superadminPage = new SuperadminPage();

	}

	/*@Test(priority = 2)
	public void homePageTitleTest() {
		try {
			String hometittle = homePage.validateHomePageTitle();
			System.out.println(hometittle);
			Assert.assertEquals(hometittle, "Superadmin - UserMapping");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}*/

	@Test(priority = 2)
	public void validateHomeIcon() {
		try {
		boolean flag = superadminPage.validateImage();
		Assert.assertTrue(flag, "Home Button doen't exist");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void clickOnHomeIconTest() {
		superadminPage.clickHome();
	}

}
