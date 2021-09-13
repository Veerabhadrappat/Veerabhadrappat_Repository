package pageObjects;

import org.openqa.selenium.By;

public class MyntraPageObject {

	public static final By HomeAndLiving = By.xpath("//a[text()='Home & Living' and @class='desktop-main']");
	public static final By homecenter = By.xpath("//a[text()='Home Centre']");
	public static final By wallArt = By.xpath("//label[text()='Wall Art']");
	public static final By finalProduct = By
			.xpath("//li[@class='product-base'][1]/a");

}
