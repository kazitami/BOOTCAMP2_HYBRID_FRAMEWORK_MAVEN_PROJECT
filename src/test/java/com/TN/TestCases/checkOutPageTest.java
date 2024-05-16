package com.TN.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.TN.Pages.HomePage;
import com.TN.Pages.addToCartPage;
import com.TN.Pages.backToHomePage;
import com.TN.Pages.cartPage;
import com.TN.Pages.returningCustomerAfterLoginPage;
import com.TN.Pages.returningCustomerPage;
import com.TN.TestBase.TestBase;

public class checkOutPageTest extends TestBase {

	public WebDriver driver;
	public HomePage homepage;
	public addToCartPage addtocartpage;
	public cartPage cartpage;
	public returningCustomerPage returningcustomerpage;
	public returningCustomerAfterLoginPage returningcustomerafterloginPage;
	public backToHomePage backtohomePage;

	public checkOutPageTest() throws Exception {
		super();
	}

	@BeforeMethod
	public void setup() {
		driver = initalizeBrowserAndOpenApplication(prop.getProperty("browser"));
		homepage = new HomePage(driver);
	}

	@Test(priority = 1)
	public void verifyCorrectProductBeignPurchased() {
		homepage.ClickOnLaptopNotebook();
		addtocartpage = new addToCartPage(driver);
		addtocartpage.ClickOnAddToCart();
		cartpage = new cartPage(driver);
		cartpage.clickOnCheckOutButton();
		returningcustomerpage = new returningCustomerPage(driver);
		returningcustomerpage.clickOnreturningCustomerlogin(prop.getProperty("validEmail"), prop.getProperty("validPassword"));

		returningcustomerafterloginPage = new returningCustomerAfterLoginPage(driver);
		returningcustomerafterloginPage.KeepClickOnContinueButton();
		backtohomePage = new backToHomePage(driver);
		backtohomePage.clickOnContinueButton();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
