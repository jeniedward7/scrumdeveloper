package com.hp.csd.sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/greengenie")
public class TestGenie {
	
	
	public String getSource(){
		return "OTP,TRIL";
	}
	
	public String getDestuination(){
		return "guindy,tbm,madura";
	}
	
	
	public String searchBySource(){
		return "-1";
	}
	
	public String searchByDestination(){
		return "-1";
	}
	
	public String searchByBoth(){
		String[] a = {"OTP","TRIL","guindy","tbm","madura"};
		return "OTP,TRIL,guindy,tbm,madura";
	}
	
	

}
