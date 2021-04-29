package com.StepDefinition;

import org.junit.Assert;
import com.Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class SearchStepDefinitions extends BaseClass {

	HomePage homepage = new HomePage();

	@Given("On the Google Search Page")
	public void google_homepage() throws Throwable {
		openURL();
	}

	@When("Type Ducks and click on the Search")
	public void search_word() throws Throwable {
		homepage.searchWord();
	}

	@Then("Check for the Search Results")
	public void verifySearchResults() throws Throwable {
		Assert.assertTrue("Verified Successfully", homepage.linkIsPresent());
	}

	@Then("Verify the search link")
	public void verify_link() throws Throwable {
		homepage.linkIsPresent();
	}

	@Then("Click the search link")
	public void click_link() throws Throwable {
		homepage.clickLink();
	}

	@Then("Click the link and check the page")
	public void verify_link_details() throws Throwable {
		homepage.checkLinkDetails();
	}
	
	@When("Type Eagle and click on the Search")
	public void searchOtherWord() throws Throwable {
		homepage.searchOtherWord();
	}
	
	@Then("Check for a different search word")
	public void verifySearchOtherWordResult() throws Throwable {
		Assert.assertFalse("Verified the link is not there", homepage.linkIsPresent());
	}
	@Then("Check for a Special characters search")
	public void verifySearchSpecialCharactersResult() throws Throwable {
		Assert.assertFalse("Verified the link is not there", homepage.linkIsPresent());
	}

	@After
	public void teardown() {
		closeApplication();
	}

}
