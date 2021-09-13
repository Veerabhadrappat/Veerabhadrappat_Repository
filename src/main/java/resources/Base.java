package resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.MyntraPageObject;

public class Base {
	public static WebDriver driver;

	public void browserInitiation() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");

		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
	}

}
