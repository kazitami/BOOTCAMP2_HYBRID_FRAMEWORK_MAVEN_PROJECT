package com.TN.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TN.Listeners.MyListeners;
import com.TN.Pages.HomePage;
import com.TN.Pages.ProductPage;
import com.TN.TestBase.TestBase;
@Listeners(MyListeners.class)
public class SearchProductTest extends TestBase {

	public SearchProductTest() throws Exception {
		super();
	}

	public WebDriver driver;
	public HomePage homepage;
	public ProductPage productpage;

	@BeforeMethod
	public void loginSetup() {
		driver = initalizeBrowserAndOpenApplication(prop.getProperty("browser"));
	}

	@Test(priority = 1)
	public void verifySearchValidProduct() {
		homepage = new HomePage(driver);
		productpage = homepage.navigateToProductPage(dataProp.getProperty("validProduct"));
		Assert.assertTrue(productpage.verifyValidProductPresence());
	}

	@Test(priority = 2)
	public void verifySearchInvalidProduct() {
		homepage = new HomePage(driver);
		productpage = homepage.navigateToProductPage(dataProp.getProperty("invalidProduct"));
		Assert.assertTrue(productpage.verifyInvalidProductWarningMessageDisplay());
	}

	@Test(priority = 3)
	public void verifySearchNoProduct() {
		homepage = new HomePage(driver);
		productpage = homepage.clickOnSearchButton();
		Assert.assertTrue(productpage.verifyInvalidProductWarningMessageDisplay());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}