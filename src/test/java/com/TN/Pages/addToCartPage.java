package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCartPage {
	public WebDriver driver;

	@FindBy(id = "button-cart")
	private WebElement button_cart;

	@FindBy(xpath = "//div[@id='cart']")
	private WebElement cart;

	@FindBy(xpath = "//i[@class=\"fa fa-shopping-cart\"]/following::strong[contains(text(),'View Cart')]")
	private WebElement ViewCart;

	public addToCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ClickOnAddToCart() {
		button_cart.click();
		cart.click();
		ViewCart.click();
	}
}
