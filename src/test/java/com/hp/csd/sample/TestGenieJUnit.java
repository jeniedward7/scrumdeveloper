package com.hp.csd.sample;

import junit.framework.TestCase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;



public class TestGenieJUnit extends TestCase{
	String errCode;
	String url;
	String opt;
	String option;
	String src;
	String dest;
	String search;
	
	
	@Given("^that home page \"([^\"]*)\" is hit$")
	public void that_home_page_is_hit(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		url = arg1;
	}

	@When("^the \"([^\"]*)\" is hit$")
	public void the_is_hit(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		opt = arg1;
	}

	@Then("^the Result  should be \"([^\"]*)\"$")
	public void the_Result_should_be(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
		TestGenie genie = new TestGenie();
		if(opt.equalsIgnoreCase("destination_query"))
			assertEquals(genie.getSource(), arg1);
		else
			assertEquals(genie.getDestuination(), arg1);
	}
	
	
	

	@Given("^the \"([^\"]*)\" is selected$")
	public void the_is_selected(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		option = arg1;
	}

	@When("^I click on  the \"([^\"]*)\" button$")
	public void I_click_on_the_button(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		search = arg1;
	}

		
	@Then("^the Result field should be errorcode \"([^\"]*)\"$")
	public void the_Result_field_should_be_errorcode(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		TestGenie genie = new TestGenie();
		if(option.equalsIgnoreCase("source"))
			assertEquals(genie.searchBySource(), arg1);
		else
			assertEquals(genie.searchByDestination(), arg1);
	}
	
	
	

	@Given("^the \"([^\"]*)\" and \"([^\"]*)\" is selected$")
	public void the_and_is_selected(String arg1, String arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	  //  throw new PendingException();
		src = arg1;
		dest = arg2;
	}

	@Then("^display the result in \"([^\"]*)\"$")
	public void display_the_result_in(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
		TestGenie genie = new TestGenie();
		assertEquals(genie.searchByBoth(), arg1);
	}
	
}
