package com.theNewBoston.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class theNewBostonHomePage extends baseClassInitiatePageFactoryElements {
	
	
	@FindBy(className="navbar-brand")
	private WebElement homePageLogo;
	
	@FindBy(id="username_id")
	private WebElement userName;
	
	
	@FindBy(id="password_id")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='signin_submit']")
	private WebElement loginButton;
	
	
	public theNewBostonHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public String homePageLogoText() 
	{
		return homePageLogo.getText();
	}
	
	public void sendUsername(String usrName)
	{
		userName.sendKeys(usrName);
	}
	
	public String returnUserName()
	{
		System.out.println(userName.getAttribute("value"));
		return userName.getAttribute(enumForLoginPageValidation.VALUE.getAttribute());
	}
	
	public void clearUserName()
	{
		userName.clear();
	}
	
	public void loginToUserAccount(String usrName, String pass) {
		
		userName.sendKeys(usrName);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	

}
