package com.hp.csd.sample;

import junit.framework.TestCase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/cucumber/greengenieregistation")
public class TestGenieTest extends TestCase{

}
