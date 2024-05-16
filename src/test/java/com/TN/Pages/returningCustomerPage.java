package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class returningCustomerPage {
	public WebDriver driver;

	@FindBy(id = "input-email")
	private WebElement inputEmailBox;

	@FindBy(id = "input-password")
	private WebElement inputPasswordBox;

	@FindBy(id = "button-login")
	private WebElement returningCustomerlogin;

	public returningCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public returningCustomerPage clickOnreturningCustomerlogin(String email, String password) {
		inputEmailBox.sendKeys(email);
		inputPasswordBox.sendKeys(password);
		returningCustomerlogin.click();
		return new returningCustomerPage(driver);
	}

}
