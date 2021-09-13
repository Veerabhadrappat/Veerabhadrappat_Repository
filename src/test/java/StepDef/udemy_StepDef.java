package StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.udemyPageActions;
import resources.Base;

public class udemy_StepDef {
	
	
	Base base= new Base();
	udemyPageActions udemy = new udemyPageActions();
	
	@Given("^Navigate to Udemy URL Enter Data Science in the search bar and select Python for Data Science Learn Data Science From Scratch$")
	public void navigate_to_Udemy_URL_Enter_Data_Science_in_the_search_bar_and_select_Python_for_Data_Science_Learn_Data_Science_From_Scratch() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		base.browserInitiation();
		udemy.dataScience();
	}

	@When("^Goto Course content and click on Expand all sections and print all content section wise and Print the price of this course$")
	public void goto_Course_content_and_click_on_Expand_all_sections_and_print_all_content_section_wise_and_Print_the_price_of_this_course()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		udemy.courseContent();
	}

	@When("^Search for Machine learning in the search box and Print the number of search results count and Filter Highest Rated$")
	public void search_for_Machine_learning_in_the_search_box_and_Print_the_number_of_search_results_count_and_Filter_Highest_Rated()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		udemy.machineLearning();
	}

	@When("^Topic Section Check Data Science and Print the number of search results count and Level Section Check All Levels and Print the number of search results count$")
	public void topic_Section_Check_Data_Science_and_Print_the_number_of_search_results_count_and_Level_Section_Check_All_Levels_and_Print_the_number_of_search_results_count()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		udemy.FilterDataScience();
	}

	@When("^Language section Check English and Print the number of search results count and Price Section Check Paid and Print the number of search results count$")
	public void language_section_Check_English_and_Print_the_number_of_search_results_count_and_Price_Section_Check_Paid_and_Print_the_number_of_search_results_count()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		udemy.FilterLanguage();
	}

	@When("^Features section Check Subtitles and Print the number of search results count$")
	public void features_section_Check_Subtitles_and_Print_the_number_of_search_results_count() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		udemy.FilterSubtitle();
	}

	@Then("^Ratings section check four point five and up and Print the number of search results count and Select the first five results and print in order and Course name followed by the price$")
	public void ratings_section_check_four_point_five_and_up_and_Print_the_number_of_search_results_count_and_Select_the_first_five_results_and_print_in_order_and_Course_name_followed_by_the_price()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		udemy.ratingAndTopFiveRecors();
	}

}
