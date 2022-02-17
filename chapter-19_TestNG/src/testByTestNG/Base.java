package testByTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {
	public static WebDriver site;

	@BeforeSuite
	public void Setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		site = new ChromeDriver();
		site.manage().window().maximize();
		System.out.println("Before Suite");
	}

	@BeforeMethod
	public void goToCraigslist() {
		System.out.println("Before method Annotation");
		site.get("https://oklahomacity.craigslist.org/");
	}

	@AfterSuite
	public void AfterMethod() {
		site.close();
		System.out.println("After suite");
	}

}
