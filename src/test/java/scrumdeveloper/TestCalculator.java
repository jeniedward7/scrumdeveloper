package scrumdeveloper;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/resources")
public class TestCalculator {
	
	
	public int add(int a, int b){
		return a+b;
	}
	
	
	public int sub(int a, int b){
		return a-b;
	}

}
