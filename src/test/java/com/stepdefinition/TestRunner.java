package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.stepdefinition",plugin="html:target",dryRun=false,
                                         monochrome=true,strict=false)


public class TestRunner {
	
	                           
	
	
	

}
