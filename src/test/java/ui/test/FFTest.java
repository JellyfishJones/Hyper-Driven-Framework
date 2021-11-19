package ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ui.dataprovider.UiEcomSearchData;

public class FFTest implements UiEcomSearchData {

	private UiEcomSearchData searchData;

	@BeforeMethod
	public void FirefoxSetup() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\BikersIsland\\Desktop\\Projects\\TestNG\\Drivers\\geckodriver.exe");
	}

	@Test(dataProvider = "searchData")
	public void FirefoxDriverSetup(String searchData) {
		// Browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");

		// Test: Enter TSHirt into search text field THEN click ENTER
		driver.findElement(By.id("search_query_top")).sendKeys(searchData);
		driver.findElement(By.id("search_query_top")).sendKeys(Keys.ENTER);
		driver.quit();
	}

	public UiEcomSearchData getSearchData() {
		return searchData;
	}

	public void setSearchData(UiEcomSearchData searchData) {
		this.searchData = searchData;
	}

}
