package com.syena.cxp.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.syena.cxp.base.Base;
import com.syena.cxp.locators.NewEventLocators;
import com.syena.cxp.util.TestUtil;

public class NewEvent extends Base {
	TestUtil testUtil;
	NewEventLocators neweventLocators;

	public NewEvent() {
		neweventLocators = PageFactory.initElements(driver, NewEventLocators.class);
		testUtil = new TestUtil();
		
	}

	public void createNewEvent(String Cust_Name, String AE, String BeginDate, String BeginTime, String BeginPeriod, String EndTime, String EndPeriod, String EventType, String Status , String GuestCount) throws InterruptedException 
	{
		
		testUtil.switchToFrame("right");
		testUtil.mouseeOverMethod(neweventLocators.SelectCustomericon);
		neweventLocators.SelectCustomericon.click();
		testUtil.winHandleBefore = driver.getWindowHandle();
        testUtil.handlechildWindows();
		testUtil.switchToFrame("right");
		neweventLocators.name.click();
		neweventLocators.name.sendKeys(Cust_Name); //"1-800-Flowers"
		neweventLocators.clickGO.click();
		neweventLocators.selectCustomer.click();
		driver.switchTo().window(testUtil.winHandleBefore);
		testUtil.switchToFrame("right");
		//neweventLocators.accountExecutive.click();
		testUtil.getallOptions(neweventLocators.accountExecutive, neweventLocators.AE,AE);//Barnes , Bill
		neweventLocators.beginDate.clear();
		neweventLocators.beginDate.sendKeys(BeginDate); //"07/17/2020"
		testUtil.getallOptions(neweventLocators.beginTime, neweventLocators.begintime,BeginTime);//"01:30"
		testUtil.getallOptions(neweventLocators.beginperiod, neweventLocators.beginPeriod,BeginPeriod); //"AM"
        testUtil.getallOptions(neweventLocators.endtime, neweventLocators.EndTime,EndTime);//"03:45"
		testUtil.getallOptions(neweventLocators.endPeriod, neweventLocators.EndPeriod,EndPeriod); //PM
        testUtil.getallOptions(neweventLocators.eventtype, neweventLocators.Eventtype,EventType);//"All Venue"
		testUtil.getallOptions(neweventLocators.status, neweventLocators.Status,Status);//"Definite"
		neweventLocators.guestcount.clear();
		neweventLocators.guestcount.sendKeys(GuestCount); //120
		neweventLocators.Create.click();
		Thread.sleep(5000);
		testUtil.winHandleBefore = driver.getWindowHandle();
		testUtil.handlechildWindows();
		String childpopupTittle = driver.getTitle();
		System.out.println(childpopupTittle);
		
		/*testUtil.switchToNewWindow(2);*/
		testUtil.switchToFrame("right");
		int rowCount=driver.findElements(By.xpath("//*[@id='eventHistory']/table[2]/tbody/tr")).size();
		System.out.println(rowCount);
		if (rowCount==8)
		{
			System.out.println("in IF");
			
			String eventno = neweventLocators.eventdetailsIF.getText();
			int eventnum = Integer.parseInt((eventno.trim()));
			System.out.println("Created Event Number =" + eventnum);
			
		}
		else
		{
			System.out.println("in ELSE");
		String eventno = neweventLocators.eventdetailsELSE.getText();
		int eventnum = Integer.parseInt((eventno.trim()));
		System.out.println("Created Event Number =" + eventnum);
	
		}
		//neweventLocators.closepopUp.click();
		driver.close();
		driver.switchTo().window(testUtil.winHandleBefore);
		System.out.println("got event no");
	
		}	
		
}
