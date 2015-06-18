package scrumdeveloper;

import junit.framework.TestCase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/resources")
public class TestCalculatorJUnit  extends TestCase{
	int a,b;
	String opt;
	@Given("^the number (\\d+) and (\\d+)$")
	public void the_number_and(int arg1, int arg2) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		a=arg1;
		b=arg2;
	}

	@When("^I select the \"([^\"]*)\" as option$")
	public void I_select_the_as_option(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		opt = arg1;
	}

	@Then("^the Result field should be (\\d+)$")
	public void the_Result_field_should_be(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
		TestCalculator tC = new TestCalculator();
	    //throw new PendingException();
		if(opt.equalsIgnoreCase("add"))
			assertEquals(arg1,tC.add(a, b));
		else
			assertEquals(arg1,tC.sub(a, b));
			
		//assertEquals(arg1, a+b);
	}

}
