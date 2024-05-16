package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class returningCustomerAfterLoginPage {
	public WebDriver driver;

	@FindBy(id = "button-payment-address")
	private WebElement button_payment_address;

	@FindBy(id = "button-shipping-address")
	private WebElement button_shipping_address;

	@FindBy(id = "button-shipping-method")
	private WebElement button_shipping_method;

	@FindBy(xpath = "//input[@name='agree' and @value='1']")
	private WebElement agreeCheckBox;

	@FindBy(id = "button-payment-method")
	private WebElement button_payment_method;

	@FindBy(id = "button-confirm")
	private WebElement button_confirm;

	public returningCustomerAfterLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void KeepClickOnContinueButton() {
		button_payment_address.click();
		button_shipping_address.click();
		button_shipping_method.click();
		agreeCheckBox.click();
		button_payment_method.click();
		button_confirm.click();
	}
}
