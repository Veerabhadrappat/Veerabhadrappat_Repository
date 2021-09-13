package Selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.Initiate_browser("chrome");
		//driver.get("https://en-gb.facebook.com/");
		br.lanchUrl("https://en-gb.facebook.com/");
		System.out.println(br.doGetTitle());
		ElementsUtil el = new ElementsUtil(driver);
		By emailId = By.id("email");
		By password = By.id("pass");
		By loginBtn = By.name("login");
		el.doSendKeys(emailId, "Veeru@hmail.com");
		el.doSendKeys(password, "veeru123");
		el.getElement(loginBtn).click();
	}

}
