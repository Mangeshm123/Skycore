package com.Campaigns.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
    WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	// WE FIND THE ELEMENTS BY USING @FindBy
	
	
	@FindBy(id="login")
	WebElement txtUserName;
	
	@FindBy(id="password")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@title='Click here to login']")
	WebElement btnLogin;
	
	@FindBy(xpath="/html/body/main/div/div/div[2]/div/div[2]/div[2]/div/p[1]/a/strong/u")
	WebElement acc;
	
	@FindBy(xpath ="//*[@title='Sign Out'][1]")
	WebElement logout;
	
	
	// CREATED SEPARATE METHOD FOR EACH OF THE ELEMENTS
	
	public void userName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void password(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void loginButton()
	{
		btnLogin.click();
	}
	
	public void mangeshm123()
	{
		acc.click();
	}
	
	public void logOut()
	{
	    logout.click();
	}
	
	
}
