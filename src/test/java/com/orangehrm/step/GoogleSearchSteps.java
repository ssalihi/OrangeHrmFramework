package com.orangehrm.step;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {

	@Given("I navigated to the Google")
	public void i_navigated_to_the_Google() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I am on google page");
	}

	@When("I type search item")
	public void i_type_search_item() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("I search for item");
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("click search button");
	}

	@Then("I see search results are displayed")
	public void i_see_search_results_are_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Results are displayed");
	}

}
