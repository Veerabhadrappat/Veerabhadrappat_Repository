package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageActions.MyntraPageActions;
import pageObjects.MyntraPageObject;
import resources.Base;

public class Myntra_StepDef {

	
	Base base = new Base();
	MyntraPageActions myntra = new MyntraPageActions();

	@Given("^Launch the test URL$")
	public void launch_the_test_URL() throws Throwable {
		base.browserInitiation();
	}

	@When("^Hover on Home and Living in the top section and select Home Centre under Brands$")
	public void hover_on_Home_and_Living_in_the_top_section_and_select_Home_Centre_under_Brands() throws Throwable {
		myntra.hover();
	}

	@When("^In the next page select Wall Art under Categories and In the list available select the first item$")
	public void in_the_next_page_select_Wall_Art_under_Categories_and_In_the_list_available_select_the_first_item()
			throws Throwable {
		myntra.wallArt();
	}

	@Then("^Display the title of the product in the print statement$")
	public void display_the_title_of_the_product_in_the_print_statement() throws Throwable {

		myntra.getTexts();

	}
}
