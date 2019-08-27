package com.syena.cxp.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewEventLocators 

{
 @FindBy(how=How.XPATH,using ="//*[@id=\"customerImg\"]/img")
public WebElement SelectCustomericon;
	
 @FindBy(how=How.ID,using ="name")
 public WebElement name;
	
 @FindBy(how=How.XPATH,using ="//*[@id=\"dijit_form_Button_0_label\"]")
 public WebElement clickGO;
 
 @FindBy(how=How.XPATH,using =".//*[@id='pagingBean']/table[3]/tbody/tr/td/a")
 public WebElement selectCustomer; 
 
 @FindBy(how=How.XPATH, using ="//*[@id='accExecutive']/option")
 public List<WebElement> AE;
 
 @FindBy(how=How.ID, using ="accExecutive")
 public WebElement accountExecutive;
 
 @FindBy(how=How.ID, using ="beginDate")
 public WebElement beginDate;
 
 @FindBy(how=How.XPATH, using ="//*[@id=\"begintime\"]/option")
 public List<WebElement> begintime;
 
 @FindBy(how=How.XPATH, using ="//*[@id=\"beginAMPM\"]/option")
 public List<WebElement> beginPeriod;
 
 @FindBy(how=How.XPATH, using ="//*[@id=\"endtime\"]/option")
 public List<WebElement> EndTime;
 
 @FindBy(how=How.XPATH, using ="//*[@id=\"endAMPM\"]/option") 
 public List<WebElement> EndPeriod;
 
 @FindBy(how=How.ID, using ="begintime")
 public WebElement beginTime;
 
 @FindBy(how=How.ID, using ="beginAMPM")
 public WebElement beginperiod;
 
 @FindBy(how=How.ID, using ="endtime")
 public WebElement endtime;
 @FindBy(how=How.ID, using ="endAMPM")
 public WebElement endPeriod;
 
 @FindBy(how=How.ID, using ="eventType")
 public WebElement eventtype;
 
 @FindBy(how=How.ID, using ="status")
 public WebElement status;
 
 @FindBy(how=How.XPATH, using ="//*[@id=\"status\"]/option")
 public List<WebElement> Status;
 
 @FindBy(how=How.XPATH, using ="//*[@id=\"eventType\"]/option")
 public List<WebElement> Eventtype;

 @FindBy(how=How.XPATH, using ="//*[@id=\"guestcount\"]")
 public WebElement guestcount;
 
 @FindBy(how=How.ID, using ="create")
 public WebElement Create;
 
 @FindBy(xpath = ".//*[@id='eventHistory']/table[2]/tbody/tr[1]/td[2]")  
 public WebElement eventdetailsIF;
	
 @FindBy(xpath = "//*[@id='eventHistory']/table[2]/tbody/tr[2]/td[2]")
 public  WebElement eventdetailsELSE;
 
 @FindBy(xpath="//*[@id=\"dijit_form_Button_0_label\"]")
 public WebElement closepopUp;
	
}

