package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSelectPage {

	public WebDriver driver;

	@FindBy(xpath = "//a[text()='Laptops & Notebooks (5)']")
	private WebElement LaptopNotebook;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement MacBookLink;

	@FindBy(id = "button-cart")
	private WebElement addToCart;

	@FindBy(xpath = "//div[@id='cart']")
	private WebElement cart;

	@FindBy(xpath = "//i[@class=\"fa fa-shopping-cart\"]/following::strong[contains(text(),'View Cart')]")
	private WebElement ViewCart;

	@FindBy(css = "a.btn.btn-primary")
	private WebElement checkOut;

	public ProductSelectPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void ShoppingCart() {
		LaptopNotebook.click();
		addToCart.click();
		cart.click();
		ViewCart.click();
	}

}
