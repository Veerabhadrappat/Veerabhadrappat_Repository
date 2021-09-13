package Selenium_java;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraProduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.Initiate_browser("chrome");
		br.lanchUrl("https://www.myntra.com");
		
		driver.manage().window().maximize();
	
		ElementsUtil el = new ElementsUtil(driver);
		WebElement homeandliving = driver.findElement(By.xpath("//a[text()='Home & Living' and @class='desktop-main']"));
		Actions actions= new Actions(driver);
		actions.moveToElement(homeandliving).build().perform();
		WebDriverWait wdw = new WebDriverWait(driver, 10);
		wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Home Centre']"))).click();
		//driver.findElement(By.xpath("//a[text()='Home Centre']")).click();
		driver.findElement(By.xpath("//label[text()='Wall Art']")).click();
		WebElement text=driver.findElement(By.xpath("//div[@id=\"desktopSearchResults\"]//div[2]//section//ul//li[1]//a"));
		System.out.println(text.getText());
	}

}
