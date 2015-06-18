package com.csd.rpn.test;

import junit.framework.TestCase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RPNCalcStep extends TestCase{
	String input;
	
	@Given("^a input of \"([^\"]*)\"$")
	public void a_input_of(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		input = arg1;
	}

	@When("^call \"([^\"]*)\"$")
	public void call(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^result should be \"([^\"]*)\"$")
	public void result_should_be(String arg1) throws Throwable {
		RPNCalculator rC = new RPNCalculator();
		Double dd = rC.parse(input);
		//System.out.println("===============================  " +dd.intValue());
		//System.out.println("=======arg1========================  " +arg1);
		assertEquals(arg1, String.valueOf(dd));
	}



}
