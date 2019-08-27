package com.syena.cxp.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.syena.cxp.util.WebEventListener;
public class Base 
{
	//Reference variables
	   public static WebDriver driver;
	   public static EventFiringWebDriver e_driver;
	   public static WebEventListener eventListener;
	   public static Properties properties;
	   public static boolean test;
	  
	  
	  String filepath = "D:\\Automation\\FreeCRMTest\\src\\main\\java\\com\\syena\\cxp\\config\\config.properties";
	 
	  public Base() 
	  {
		
		try {
             
			 properties = new Properties();
			 FileInputStream configfile = new FileInputStream(filepath);
			 properties.load(configfile);
		    } 
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	} 
	  
	  public static void intilization() 
	  {
		  String browsername = properties.getProperty("browser");
	     if(browsername.equalsIgnoreCase("chrome"))
	    {   
		  System.setProperty("webdriver.chrome.driver","D:\\Automation\\FreeCRMTest\\Driver\\chromedriver.exe" );
		  //intilization of driver variable and used in child class 
		   driver= new ChromeDriver();
	    }
	    else if (browsername.equalsIgnoreCase("firefox"))
		{
		  System.setProperty("webdriver.gecko.driver", "D:\\Automation\\ResolverTest\\drivers\\geckodriver.exe");
		  driver = new FirefoxDriver();
		  
	    }
	     e_driver = new EventFiringWebDriver(driver);
	     eventListener=new WebEventListener();
	     e_driver.register(eventListener);
	     driver=e_driver;
	    //maximize the window
	    driver.manage().window().maximize();
	    //delete all cookies
	    driver.manage().deleteAllCookies();
	    //fetching the string data from .property file and convertingto long for impicitwait and pageload time
	    
	    String loadtime = properties.getProperty("pageLoadTimeout");
	    long Page_load_time = Long.parseLong(loadtime);
	    driver.manage().timeouts().pageLoadTimeout(Page_load_time, TimeUnit.SECONDS);
	    
	    String implicitwait = properties.getProperty("implicitwait");
	    long implicit_wait = Long.parseLong(implicitwait);
        driver.manage().timeouts().implicitlyWait(implicit_wait, TimeUnit.SECONDS);
	 
	    //fetchomh url from .properity file  and passing to browser
	    String URL = properties.getProperty("url");
	    //driver.get(properties.getProperty(URL));
	    driver.get(URL);
	    
	   
	    
	    
	  
	  }
}
	  
	 
	

