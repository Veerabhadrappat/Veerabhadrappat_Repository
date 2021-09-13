package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.MyntraPageObject;
import resources.Base;

public class MyntraPageActions extends Base{
	//WebDriver driver = new ChromeDriver();
	
	public void hover()   {
		Actions actions = new Actions(driver);
		WebElement homeandlivings = driver.findElement(MyntraPageObject.HomeAndLiving);
		actions.moveToElement(homeandlivings).build().perform();
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(MyntraPageObject.homecenter)).click();
	}

	public void wallArt() {
		
		driver.findElement(MyntraPageObject.wallArt).click();
	}
	
	public void getTexts() {
		
		String imageText = driver.findElement(MyntraPageObject.finalProduct).getText();
		System.out.println(imageText);
	}
}
