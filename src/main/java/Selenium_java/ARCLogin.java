package Selenium_java;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ARCLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.Initiate_browser("chrome");
		br.lanchUrl("https://arc6qa.emids.com");
		driver.manage().window().maximize();
		driver.switchTo().frame(3);
		ElementsUtil el = new ElementsUtil(driver);
		By emailId = By.id("userName");
		By password = By.id("password");
		By loginBtn = By.id("submit");
		el.doSendKeys(emailId, "Veerabhadrappat");
		el.doSendKeys(password, "Emids321");
		el.getElement(loginBtn).click();
		WebDriverWait wdw1 = new WebDriverWait(driver, 10);
		wdw1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("//div[@class='huser-panel']//ul//li[2]//a"))));
		
		
		By myArea = By.xpath("//div[@class='huser-panel']//ul//li[2]//a");
		el.getElement(myArea).click();
		driver.switchTo().frame(0);
		
		By applyLeave = By.id("btnLeaves");
		el.getElement(applyLeave).click();
		
//		WebDriverWait wdw = new WebDriverWait(driver, 10);
//		wdw.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("select#ddlMyArea_Leaves_LeaveTypes1"))));
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("select#ddlMyArea_Leaves_LeaveTypes1"))));
		
		el.doSelect("select#ddlMyArea_Leaves_LeaveTypes1", "Work from Home");
		
		By fromDate = By.cssSelector("input#txtAMyArea_Others_From");
		el.getElement(fromDate).click();
		el.doSelect("select.ui-datepicker-month", "Aug");
		el.doSelect("select.ui-datepicker-year", "2021");
		By selectDate = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[2]/a");
		el.getElement(selectDate).click();
		
		By toDate = By.cssSelector("input#txtAMyArea_Others_To");
		el.getElement(toDate).click();
		el.doSelect("select.ui-datepicker-month", "Aug");
		el.doSelect("select.ui-datepicker-year", "2021");
		By selecttoDate = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[6]/a");
		el.getElement(selecttoDate).click();
		
		WebElement wn=driver.findElement(By.name("OtherReason"));
		wn.click();
		wn.sendKeys("Working from home due to BCP");
		driver.findElement(By.cssSelector("button#btn_Others_Submit")).click();
		By submit = By.cssSelector("button#btn_Others_Submit");
		el.getElement(submit).click();
	}

}
