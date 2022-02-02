package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{


	//page locators or OR
	@FindBy(linkText = "About")
	WebElement AboutLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public Boolean verifyAboutLink() {
		return AboutLink.isDisplayed();
	}
}
