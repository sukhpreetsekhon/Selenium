package com.theNewBoston.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class theNewBostonAccountPage extends baseClassInitiatePageFactoryElements {


	@FindBy(xpath = "//*[@id='menu-content-demo']/div/div[1]/span[1]")
	WebElement userLoginName;

	@FindBy(xpath = "//*[@id='main-menu-inner']/ul/li[3]/a/span")
	WebElement findFriendLink;

	public theNewBostonAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public String validateUserNameAfterLogin() {
		return userLoginName.getText();

	}
	
	public String validateFindFriendLinkIsPresent() {
		return findFriendLink.getText();

	}
	
	public void clickOnFindFriendsTab()
	{
		findFriendLink.click();
	}
	
	

}
