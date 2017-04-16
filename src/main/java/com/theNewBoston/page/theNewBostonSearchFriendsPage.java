package com.theNewBoston.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class theNewBostonSearchFriendsPage extends baseClassInitiatePageFactoryElements {

	WebDriver driver;

	@FindBy(xpath = "//*[@id='content-wrapper']/div[2]/ul/li[3]/a")
	WebElement pagesTab;

	@FindBy(xpath = "//*[@id='content-wrapper']/div[3]/form/div/input")
	WebElement searchInputBar;

	@FindBy(xpath = "//*[@id='content-wrapper']/div[3]/form/div/span[2]")
	WebElement searchButton;

	@FindBy(xpath = "//*[@id='content-wrapper']/div[4]/div/div/div/table/tbody/tr/td[2]/div[1]/a")
	WebElement seleniumCourse;

	public theNewBostonSearchFriendsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public void clickOnPagesTab() {

		pagesTab.click();

	}

	public void enterValueInSearchBar()

	{
		searchInputBar.sendKeys("selenium");
	}

	public void clickSearchButton()

	{
		searchButton.click();
	}

	public String searchSeleniumCourse() {
		
		return seleniumCourse.getText();
	}

}
