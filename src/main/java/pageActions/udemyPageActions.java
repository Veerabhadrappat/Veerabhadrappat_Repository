package pageActions;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.MyntraPageObject;
import pageObjects.udemyPageObject;
import resources.Base;
import resources.browserUtilities;

public class udemyPageActions extends Base {
	

	browserUtilities bu = new browserUtilities();
	WebDriverWait wait = new WebDriverWait(driver, 10);

	public void dataScience() {
		
		driver.findElement(udemyPageObject.Search).sendKeys("Data Science");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(udemyPageObject.PythonDataScience)).click();
		
	}
	public void courseContent() throws InterruptedException {
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(udemyPageObject.AddToCart));
		
		
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");
	    WebDriverWait waitExpand1 = new WebDriverWait(driver, 30);
	    waitExpand1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='udlite-btn udlite-btn-medium udlite-btn-ghost udlite-heading-sm'])[5]")));
	    JavascriptExecutor executor = (JavascriptExecutor)driver;
	    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[@class='udlite-btn udlite-btn-medium udlite-btn-ghost udlite-heading-sm'])[5]")));
//	    WebDriverWait waitExpand = new WebDriverWait(driver, 30);
//		waitExpand.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Collapse all sections']")));
	   
		
	    

		List<WebElement> elmLinks = driver.findElements(udemyPageObject.ListContent);
		for (WebElement webElement : elmLinks) {
			String strlinks = webElement.getText();
			System.out.println(strlinks);
			System.out.println("--------------------------------------------------------------------");
		}
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(udemyPageObject.CoursePrice));
		WebElement price = driver.findElement(udemyPageObject.CoursePrice);
		System.out.println("Price of the course is " + price.getText());
	}

	public void machineLearning() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(udemyPageObject.SearchForAnything));
		
		driver.findElement(udemyPageObject.SearchForAnything).sendKeys("Machine learning");
		
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		bu.getElements(udemyPageObject.MlNumberofsearch, "Machine Learning");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(udemyPageObject.HighestRateFilter).sendKeys(Keys.ENTER);
		
		WebDriverWait waitselect = new WebDriverWait(driver, 30);
		waitselect.until(ExpectedConditions.presenceOfAllElementsLocatedBy(udemyPageObject.SelectClass));
		Select select = new Select(driver.findElement(udemyPageObject.SelectClass));
		select.selectByValue("highest-rated");
	}
	
	public void FilterDataScience() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(udemyPageObject.DataScienceFilter)));
		//wait.until(ExpectedConditions.elementToBeClickable(udemyPageObject.DataScienceFilter)).click();
		driver.findElement(udemyPageObject.DataScienceFilter).click();
		
		bu.getElements(udemyPageObject.ListOfDataScience, "Data science");
		
		driver.findElement(udemyPageObject.LevelFilter).click();

		bu.getElements(udemyPageObject.TotalLevelPrint, "Level");
	}
	
	public void FilterLanguage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,200)", "");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(udemyPageObject.LanguageSection)).click();
		//driver.findElement(udemyPageObject.LanguageSection).click();
		driver.findElement(udemyPageObject.EnglishSelect).click();

		bu.getElements(udemyPageObject.TotalEnglishPrint, "English");
		
		driver.findElement(udemyPageObject.PriceSection).click();
		driver.findElement(udemyPageObject.PaidSelect).click();

		// Print the number of search results count
		bu.getElements(udemyPageObject.TotalPaidPrint, "paid section");
	}
	
	public void FilterSubtitle() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(udemyPageObject.FeatureSection).click();
		driver.findElement(udemyPageObject.SubtitleSelect).click();

		// Print the number of search results count
		bu.getElements(udemyPageObject.TotalSubtitlePrint, "Feature");
	}
	
	public void ratingAndTopFiveRecors() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)", "");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(udemyPageObject.RatingSection)).click();
		//driver.findElement(udemyPageObject.RatingSection).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(udemyPageObject.HighRating)).click();

		// Print the number of search results count
		bu.getElements(udemyPageObject.TotalRatingPrint, "Rating");
		
		List<WebElement> totalLink = driver.findElements(udemyPageObject.TopFiveTitle);
		List<WebElement> totalAmount = driver.findElements(udemyPageObject.TopFivePrice);
		for (int i=0; i<5;i++) {
			
			System.out.println(totalLink.get(i).getText());
			System.out.println(totalAmount.get(i).getText());
			
		}
	}
}
