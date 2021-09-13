package Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	static WebDriver driver;

	public WebDriver Initiate_browser(String browserName) {
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println(browserName + "Please enter a valid browsername");
		}
		return driver;
	}

	public void lanchUrl(String Url) {
		driver.get(Url);
	}

	public String doGetTitle() {
		return driver.getTitle();
	}

	public static void selectDropdownValues(String dropdown, String dropdownvalue, String value, String value1) {

		WebElement elm = driver.findElement(By.id(dropdown));
		elm.click();
		List<WebElement> we = driver.findElements(By.className(dropdownvalue));
		System.out.println(we.size());

		for (WebElement row : we) {
			// System.out.println(row.getText());

			if (row.getText().equals(value) ) {
				row.click();

			}
			if (row.getText().equals(value1) ) {
				row.click();

			}
		}
	}
}
