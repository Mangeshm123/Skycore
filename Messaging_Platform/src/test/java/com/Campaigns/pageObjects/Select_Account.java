package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Account {

	WebDriver driver;
	
	public Select_Account(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'×')]")
	WebElement alert;
	
	@FindBy(xpath="/html/body/main/div/div/div[2]/div/div[2]/div[2]/div/p[1]/a/small")
	WebElement selectuser;
	
	public void close_alert()
	{
		alert.click();
	}
	
	public void mangeshm123()
	{
		selectuser.click();
	}
	
	
}
