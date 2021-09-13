package resources;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObjects.udemyPageObject;

public class browserUtilities extends Base{

	udemyPageObject upo= new udemyPageObject();
	public void getElements(By element, String value) {
		List<WebElement> TotalListofvalues = driver.findElements(element);
		int totalSearch = TotalListofvalues.size();
		System.out.println("Total number of search results for : " + value + " are " + totalSearch);
	}

//	public static void selectDropdownValues(String dropdown, String dropdownvalue, String value, String value1) {
//
//		WebElement elm = driver.findElement(By.id(dropdown));
//		elm.click();
//		List<WebElement> we = driver.findElements(By.className(dropdownvalue));
//		System.out.println(we.size());
//	}
}
