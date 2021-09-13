package pageObjects;

import org.openqa.selenium.By;

public class udemyPageObject {
	
	public static final By Search = By.xpath("//input[@placeholder='Search for anything']");
	public static final By PythonDataScience = By.xpath("//a[@aria-label='Course: Data Science A-Z™: Real-Life Data Science Exercises Included - Instructor: Kirill Eremenko,Ligency Team']/div");
	public static final By AddToCart= By.xpath("//button[text()='Add to cart']");
	public static final By ExpandAllCOntent = By.xpath("//button[@class='udlite-btn udlite-btn-medium udlite-btn-ghost udlite-heading-sm'])[5]");
	public static final By ListContent = By.xpath("//div[@class='section--panel--1tqxC panel--panel--3uDOH']");
	public static final By CoursePrice = By.xpath("//div[@class='price-text--price-part--2npPm udlite-clp-discount-price udlite-heading-xxl']");
	public static final By SearchForAnything = By.xpath("//input[@placeholder='Search for anything']");
	public static final By MlNumberofsearch = By.xpath("//div[@class='udlite-search-form-autocomplete-suggestion-block-list-item']");
	public static final By HighestRateFilter = By.xpath("//input[@placeholder='Search for anything']");
	public static final By SelectClass = By.xpath("//select[@class='udlite-select udlite-text-md']");
	public static final By DataScienceFilter = By.xpath("//*[text()='Data Science']/span");
	public static final By ListOfDataScience = By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div");
	public static final By LevelFilter = By.xpath("(//*[text()='All Levels'])[1]");
	public static final By TotalLevelPrint = By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div");
	public static final By LanguageSection = By.xpath("//span[text()='Language']");
	public static final By EnglishSelect = By.xpath("(//*[text()='English']/span)[1]");
	public static final By TotalEnglishPrint = By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div");
	public static final By PriceSection = By.xpath("//span[text()='Price']");
	public static final By PaidSelect = By.xpath("//*[text()='Paid']");
	public static final By TotalPaidPrint = By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div");
	public static final By FeatureSection =By.xpath("//span[text()='Features']");
	public static final By SubtitleSelect = By.xpath("//*[text()='Subtitles']/span");
	public static final By TotalSubtitlePrint = By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div");
	public static final By RatingSection = By.xpath("//span[text()='Ratings']");
	public static final By HighRating = By.xpath("//span[text()='4.5 & up']");
	public static final By TotalRatingPrint = By.xpath("//div[@class='popper--popper--2r2To popper--popper-hover--3YydE']/a/div");
	public static final By TopFiveTitle = By.xpath("//div[starts-with(@class,'udlite-focus-visible')]");
	public static final By TopFivePrice = By.xpath("//div[starts-with(@class,'price-text--price-part--2npPm co')]");
}
