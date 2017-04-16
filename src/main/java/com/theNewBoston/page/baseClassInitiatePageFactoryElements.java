package com.theNewBoston.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class baseClassInitiatePageFactoryElements {
	
	public WebDriver driver;
	
	public baseClassInitiatePageFactoryElements(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
