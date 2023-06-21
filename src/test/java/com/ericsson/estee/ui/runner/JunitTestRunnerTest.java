package com.ericsson.estee.ui.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@RunWith(Cucumber.class)
//rerun:target/failed_scenarios.txt rerun plugin documents the failed scenarios in the txt file


@CucumberOptions(features = "src/test/java/com/ericsson/estee/ui/features", glue = "com/ericsson/estee/ui/stepdefinitions", monochrome = true, tags = "@login", 
plugin = {"pretty", "html:target/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed_scenarios.txt"},
dryRun = false)
public class JunitTestRunnerTest {
		
}