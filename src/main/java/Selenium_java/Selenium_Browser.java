package Selenium_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Browser {

	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\VeerabhadrappaT\\Java-Training\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.amazon.in/?ie=UTF8&ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_EAIaIQobChMIm-LMmqz48QIVTzUrCh1y5wowEAAYASAAEgLH9fD_BwE_k_&ext_vrnc=hi&gclid=EAIaIQobChMIm-LMmqz48QIVTzUrCh1y5wowEAAYASAAEgLH9fD_BwE");

		/*
		 * String title = driver.getTitle(); System.out.println(title);
		 * if(title.equals("Facebook – log in or sign up")) {
		 * System.out.println("Matching"); } else { System.out.println("Not matching");
		 * }
		 */

		// List <WebElement> links = driver.findElements(By.tagName("a"));
//		List<WebElement> Links = driver.findElements(By.tagName("a"));
//		System.out.println("Total number of links = " + Links.size());

//		for (int i = 0; i < Links.size(); i++) {
//			String text = Links.get(i).getText();
//			if (!text.isEmpty()) {
//				System.out.println(text.trim());
//				System.out.println(Links.get(i).getAttribute("href"));
//				
//			}
//
//		}
		
		List<WebElement> image = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images = " + image.size());
		for (int i = 0; i < image.size(); i++) {
			String imagename = image.get(i).getText();
			if (!image.isEmpty()) {
				System.out.println(imagename.trim());
				System.out.println(image.get(i).getAttribute("src"));
			}

		}
	}
}
