package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class backToHomePage {

	public WebDriver driver;

	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continueButton;

	public backToHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public backToHomePage clickOnContinueButton() {
		continueButton.click();
		return new backToHomePage(driver);
	}

}
