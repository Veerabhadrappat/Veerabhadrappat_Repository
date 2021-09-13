package Assignment_Myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.Initiate_browser("chrome");
		br.lanchUrl("https://www.myntra.com");
		
		driver.manage().window().maximize();
		Actions actions= new Actions(driver);
		ElementsUtil el = new ElementsUtil(driver);
		
		WebElement homeandliving = driver.findElement(By.xpath("//a[text()='Home & Living' and @class='desktop-main']"));
		actions.moveToElement(homeandliving).build().perform();
		
		WebDriverWait wdw = new WebDriverWait(driver, 10);
		wdw.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Home Centre']"))).click();
		
		By wallArt = By.xpath("//label[text()='Wall Art']");
		el.getElement(wallArt).click();
		By imageText = By.xpath("//h4[text()='Set Of 18 BPA Free Canisters' and @class='product-product']");
		System.out.println(el.getElement(imageText).getText());
	}

}
