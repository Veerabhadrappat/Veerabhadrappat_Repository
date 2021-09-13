package Assignment_Udemy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.udemyPageObject;

public class Udemy_Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Open browser and launch URL and Maximize the window
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();

		// Enter "Data Science" in the search bar and select "Python for Data Science and Machine Learning Bootcamp"
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Data Science");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//div[text()='Data Science A-Z™: Real-Life Data Science Exercises Included'])[1]")).click();
		
		 // Goto Course content, Expand all sections and print all content sectionwise
		 WebDriverWait wait2 = new WebDriverWait(driver, 5);
		 wait2.until(ExpectedConditions.elementToBeClickable(udemyPageObject.ExpandAllCOntent)).click();
		 
		 Thread.sleep(5000);
		 List<WebElement>
		 elmLinks=driver.findElements(By.xpath("//div[@class='section--panel--1tqxC panel--panel--3uDOH']"));
		 for (WebElement webElement : elmLinks) {
		 String strlinks= webElement.getText();
		 System.out.println(strlinks);
		 System.out.println("--------------------------------------------------------------------");
		 }
		 //Print the price of this course
		 WebElement price=driver.findElement(By.xpath("//div[@class='price-text--price-part--2npPm udlite-clp-discount-price udlite-heading-xxl']"));
		 System.out.println(price.getText());

		// Search for "Machine learning" in the search box
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("Machine learning");

		// Print the number of search results count
		Thread.sleep(5000);
		List<WebElement> listOFSearch = driver
				.findElements(By.xpath("//div[@class='udlite-search-form-autocomplete-suggestion-block-list-item']"));
		int totalSearch = listOFSearch.size();
		System.out.println("Total number of search results are: " + totalSearch);

		// Filter - Highest Rated
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.xpath("//select[@class='udlite-select udlite-text-md']")));
		select.selectByValue("highest-rated");

		// Topic Section - Check - Data Science
		driver.findElement(By.xpath("//*[text()='Data Science']/span")).click();
		// Print the number of search results count
		Thread.sleep(3000);
		List<WebElement> listDataScience = driver
				.findElements(By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div"));
		int totalSize = listDataScience.size();
		System.out.println("Total number of search results for data science are: " + totalSize);

		// Level Section - Check - All Levels
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='All Levels'])[1]")).click();

		// Print the number of search results count
		List<WebElement> listLevels = driver
				.findElements(By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div"));
		int totalLevels = listLevels.size();
		System.out.println("Total number of search results for all level are: " + totalLevels);

		// Language section - Check - English
		driver.findElement(By.xpath("//span[text()='Language']")).click();
		driver.findElement(By.xpath("(//*[text()='English']/span)[1]")).click();

		// Print the number of search results count
		List<WebElement> listEnglish = driver
				.findElements(By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div"));
		int totalEnglish = listEnglish.size();
		System.out.println("Total number of search results for English language are: " + totalEnglish);

		// Price Section - Check - Paid
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Price']")).click();
		driver.findElement(By.xpath("//*[text()='Paid']")).click();

		// Print the number of search results count
		List<WebElement> listOfPaid = driver
				.findElements(By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div"));
		int totalPaid = listOfPaid.size();
		System.out.println("Total number of search results for paid courses are: " + totalPaid);

		// Features section - Check - Subtitles
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Features']")).click();
		driver.findElement(By.xpath("//*[text()='Subtitles']/span")).click();

		// Print the number of search results count
		List<WebElement> listOfFeatures = driver
				.findElements(By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div"));
		int totalFeatures = listOfFeatures.size();
		System.out.println("Total number of search results for Features with subtitles are: " + totalFeatures);

		// Ratings section - check - 4.5 & up
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Ratings']")).click();
		driver.findElement(By.xpath("//span[text()='4.5 & up']")).click();

		// Print the number of search results count
		List<WebElement> listOfRatings = driver
				.findElements(By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div"));
		int totalRatings = listOfRatings.size();
		System.out.println("Total number of search results for Rating 4.5 and up are: " + totalRatings);

		// Select the first 5 results and print in order Course name followed by the price 
		List<WebElement> totalLink = driver
				.findElements(By.xpath("//div[starts-with(@class,'udlite-focus-visible')]"));
		List<WebElement> totalAmount = driver
				.findElements(By.xpath("//div[starts-with(@class,'price-text--price-part--2npPm co')]"));
		for (int i=0; i<5;i++) {
			
			System.out.println(totalLink.get(i).getText());
			System.out.println(totalAmount.get(i).getText());
			
		}

	}

}
