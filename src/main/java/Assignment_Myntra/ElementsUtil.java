package Assignment_Myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementsUtil {
	WebDriver driver;
	
	public ElementsUtil(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getElement(By locators) {
		WebElement element = driver.findElement(locators);
		return element;
	}
	public void doSendKeys(By locators, String value) {
		getElement(locators).sendKeys(value);
	}
	public void doSelect(String wl, int index) {
		WebElement we=driver.findElement(By.cssSelector(wl));
		Select s = new Select(we);
		s.selectByIndex(index);
		
	}

}

