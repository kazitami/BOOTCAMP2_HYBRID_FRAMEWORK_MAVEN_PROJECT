package com.TN.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TN.Listeners.MyListeners;
import com.TN.Pages.HomePage;
import com.TN.Pages.ProductSelectPage;
import com.TN.TestBase.TestBase;

@Listeners(MyListeners.class)
public class ViewCartPageTest extends TestBase{
	public WebDriver driver;
	public HomePage homepage;
	public ProductSelectPage productSelectPage;
	
	public ViewCartPageTest() throws Exception {
		super();
	}


	@BeforeMethod
	public void setup() {
	driver = initalizeBrowserAndOpenApplication(prop.getProperty("browser"));
	homepage = new HomePage(driver);
	}
	@Test(priority=1)
	public void verifyProductIsAddedToTheCart(){
		homepage.ClickOnLaptopNotebook();
		productSelectPage = new ProductSelectPage(driver);
		productSelectPage.ShoppingCart();
	
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}

	
