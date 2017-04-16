package com.theNewBostonTest.page;

import org.testng.annotations.Test;

import org.testng.Assert;

import org.testng.annotations.AfterTest;

public class theNewBostonHomePageTest extends baseClassInitiateDriverForTest {

	@Test(priority = 0)
	public void homePageLogoText() {

		String homePageText = homePage.homePageLogoText();
		Assert.assertEquals(homePageText, "THENEWBOSTON");
	}

	@Test(dependsOnMethods = { "homePageLogoText" })
	public void validateUserName() {
		
		homePage.sendUsername("sukh");
		String userNameText = homePage.returnUserName();
		Assert.assertEquals(userNameText, "sukh");
		homePage.clearUserName();

	}

	@Test(dependsOnMethods = {"validateUserName"})
	public void homePageLogin() {

		homePage.loginToUserAccount("ersukhpreetsekhon03@gmail.com", "1sukhPREET03");
	}

	@Test(dependsOnMethods = { "homePageLogin" })
	public void accountPageUserNameTest() {

		String UserName = accountPage.validateUserNameAfterLogin();
		Assert.assertEquals(UserName, "Sukhpreet");
	}

	@Test(dependsOnMethods = { "accountPageUserNameTest" })
	public void findLinkForFindFriends() {

		String findLink = accountPage.validateFindFriendLinkIsPresent();
		Assert.assertEquals(findLink, "Find Friends");

	}

	@Test(dependsOnMethods = { "findLinkForFindFriends" })
	public void findSeleniumCourse() {

		accountPage.clickOnFindFriendsTab();
		searchSelenium.clickOnPagesTab();
		searchSelenium.enterValueInSearchBar();
		searchSelenium.clickSearchButton();

		String findCourse = searchSelenium.searchSeleniumCourse();
		Assert.assertEquals(findCourse, "Selenium");

	}

	@AfterTest
	public void afterClass() {

		driver.close();

	}

}
