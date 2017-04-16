package com.theNewBostonTest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import com.theNewBoston.page.theNewBostonAccountPage;
import com.theNewBoston.page.theNewBostonHomePage;
import com.theNewBoston.page.theNewBostonSearchFriendsPage;

public class baseClassInitiateDriverForTest {
	
	public WebDriver driver;

	theNewBostonHomePage homePage;
	theNewBostonAccountPage accountPage;
	theNewBostonSearchFriendsPage searchSelenium;
	
	String url = "https://thenewboston.com/index.php";
	
	@BeforeTest
	public void InitiateDriverForTest()
	{
			
		System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(url);
		
		homePage = new theNewBostonHomePage(driver);
		accountPage= new theNewBostonAccountPage(driver);
		searchSelenium= new theNewBostonSearchFriendsPage(driver);

		
	}

}
