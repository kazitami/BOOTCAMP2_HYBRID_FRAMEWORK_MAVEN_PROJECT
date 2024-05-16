package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {
	public WebDriver driver;

	@FindBy(css = "a.btn.btn-primary")
	private WebElement checkOut;

	public cartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnCheckOutButton() {
		checkOut.click();
	}

}
