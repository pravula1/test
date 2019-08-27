package com.syena.cxp.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.syena.cxp.base.Base;


public class TestUtil extends Base
{
	   public String winHandleBefore;
	   
	   public static String TESTDATA_SHEET_PATH ="D:\\Automation\\FreeCRMTest\\src\\main\\java\\com\\syena\\cxp\\testdata\\CXPTestData.xls";
	   static Workbook book;
	   static Sheet sheet;
	   
	   public static Object[][] getTestData(String SheetName)
	   
		{
			FileInputStream file= null;
			try {
				file= new FileInputStream(TESTDATA_SHEET_PATH);
			}
			catch(FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			try 
			{
			book = WorkbookFactory.create(file);
		   }
			
			catch(IOException e)
		{
			e.printStackTrace();
		}
			sheet = book.getSheet(SheetName);
			Object[][] data= new Object [sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
			System.out.println(sheet.getLastRowNum() + "--------" +
			 sheet.getRow(0).getLastCellNum());
			for(int i=0;i<sheet.getLastRowNum();i++)
			{
				for(int k=0;k<sheet.getRow(0).getLastCellNum();k++)
				{
					data[i][k]=sheet.getRow(i+1).getCell(k).toString();
					System.out.println(data[i][k]);
				}
			}	
			return data;
		}
	public void mouseeOverMethod(WebElement Element)
	{
		Actions actions =new Actions(driver);
		actions.moveToElement(Element).build().perform();
	}
	
	public void switchToFrame(String Frame)
	{
		 driver.switchTo().frame(Frame);
	}
	
	public void handlechildWindows()
	{
	  
		
	System.out.println("Before window handle"+ winHandleBefore);
	
		   for (String winHandle : driver.getWindowHandles())
		   {
		     // Switch to child window
				System.out.println("After Window Handle"+winHandle.length());
				
		     driver.switchTo().window(winHandle);
		     String winHandleAfter = driver.getWindowHandle();
		  
		   //switch to child window of 1st child window.
		     for(String winChildHandle : driver.getWindowHandles())
		     {
		       // Switch to child window of the 1st child window.
		       if(!winChildHandle.equals(winHandleBefore) 
		       && !winChildHandle.equals(winHandleAfter))
		        {
		         driver.switchTo().window(winChildHandle);
		         
		        }
		      }
		  
		   }
	}
	
	public void getallOptions (WebElement dropdown,List<WebElement> allOptions,String requiredValue)
	{
	System.out.println("Number of options:" + allOptions.size());
	for (WebElement options : allOptions) 
	{
		String value = options.getText();
		System.out.println(value);
		if(value.equalsIgnoreCase(requiredValue))
		{
			new Select(dropdown).selectByVisibleText(value);
			break;
		}
			
	}
	}
	
	public void switchToNewWindow(int windowNumber) 
	{
	    Set < String > s = driver.getWindowHandles();   
	    Iterator < String > ite = s.iterator();
	    int i = 1;
	    while (ite.hasNext() && i < 10) 
	    {
	        String popupHandle = ite.next().toString();
	        driver.switchTo().window(popupHandle);
	        System.out.println("Window title is : "+driver.getTitle());
	        if (i == windowNumber) break;
	        i++;
	    }
	}
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		String currentdir=System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentdir +"/screenshot/"+System.currentTimeMillis()+".png"));
		
		
	}
	
	
}
