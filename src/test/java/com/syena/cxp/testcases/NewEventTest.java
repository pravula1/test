package com.syena.cxp.testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syena.cxp.pages.NewEvent;
import com.syena.cxp.util.TestUtil;

public class NewEventTest {
	NewEvent newEvent;
	String SheetName="NewEvent";
	@BeforeClass
	public void setUp()
	{
		 newEvent = new NewEvent();
	}
	
	@DataProvider
	public Object[][] getNewEventTestData()
	{
		
		Object data[][]=TestUtil.getTestData(SheetName);
		return data;
	}
	
	
	
	@Test (priority = 6,dataProvider="getNewEventTestData") 
	public void createEventTest(String Cust_Name, String AE, String BeginDate, String BeginTime, String BeginPeriod, String EndTime, String EndPeriod, String EventType, String Status , String GuestCount) throws InterruptedException
	{
		newEvent.createNewEvent(Cust_Name, AE, BeginDate, BeginTime, BeginPeriod, EndTime, EndPeriod, EventType, Status, GuestCount);
	}
}
