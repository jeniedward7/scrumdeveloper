package com.csd.rpn.test;

import junit.framework.TestCase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/rpnCalculator")
public class RPNCalcRunner extends TestCase {

}
