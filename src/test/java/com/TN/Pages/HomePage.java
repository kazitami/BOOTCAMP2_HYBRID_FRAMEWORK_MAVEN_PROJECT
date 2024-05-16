package com.TN.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// in the Page class, we will define the WebElements, we will initialize the
	// WebElements and we will create actions for those WebElements

	public WebDriver driver;

	// Homepage
	@FindBy(linkText = "My Account")
	private WebElement myAccountDropdown;

	// Login
	@FindBy(linkText = "Login")
	private WebElement loginOption;

	// register
	@FindBy(linkText = "Register")
	private WebElement registerOption;

	// Search product

	@FindBy(name = "search")
	private WebElement searchBox;

	@FindBy(css = "button.btn.btn-default.btn-lg")
	private WebElement searchButton;

	// Add a valid product
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement MenuLaptopsNotebooks;

	@FindBy(xpath = "//a[text()='Show AllLaptops & Notebooks']")
	private WebElement ShowAllLaptopsNotebooks;

	@FindBy(xpath = "//div[@class='button-group']/button[1]")
	private WebElement ProductPage_button_cart;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions to call these Object in the form of methods

	public LoginPage combiningTwoActionsToNavigateToLoginPage() {
		myAccountDropdown.click();
		loginOption.click();
		return new LoginPage(driver);
	}

	public RegisterPage combiningTwoActionsToNavigateToRegisterPage() {
		myAccountDropdown.click();
		registerOption.click();
		return new RegisterPage(driver);
	}

	public void enterProductName(String validProductText) {
		searchBox.sendKeys(validProductText);
	}

	public ProductPage clickOnSearchButton() {
		searchButton.click();
		return new ProductPage(driver);
	}

	public ProductPage navigateToProductPage(String validProductText) {
		searchBox.sendKeys(validProductText);
		searchButton.click();
		return new ProductPage(driver);
	}

	// Product page
	public ProductSelectPage ClickOnLaptopNotebook() {
		MenuLaptopsNotebooks.click();
		ShowAllLaptopsNotebooks.click();
		ProductPage_button_cart.click();
		return new ProductSelectPage(driver);
	}

}