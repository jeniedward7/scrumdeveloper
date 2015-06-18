package com.hp.csd.sample;

import junit.framework.TestCase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


public class RegistrationStep extends TestCase{
	

	String employeeName,startLoc,endLoc,opt,result;
	int mobileNumber;

	@Given("^Employee name \"([^\"]*)\"$")
	public void Employee_name(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		employeeName = arg1;
	    //throw new PendingException();
	}

	@Given("^mobile number (\\d+)$")
	public void mobile_number(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		mobileNumber = arg1;
	    //throw new PendingException();
	}

	@Given("^Start location \"([^\"]*)\"$")
	public void Start_location(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		startLoc = arg1;
	    //throw new PendingException();
	}

	@Given("^End location \"([^\"]*)\"$")
	public void End_location(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		endLoc = arg1;
	    //throw new PendingException();
	}

	@When("^click on \"([^\"]*)\"$")
	public void click_on(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		opt = arg1;
	    //throw new PendingException();
	}

	@Then("^entered details should be \"([^\"]*)\"$")
	public void entered_details_should_be(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		if (opt.equalsIgnoreCase("Register")){
			Registration reg = new Registration();
			assertEquals(reg.onSubmit(), arg1);
		}
	    //throw new PendingException();
	}
	
	
}
