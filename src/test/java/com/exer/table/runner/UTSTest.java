package com.exer.table.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.exer.table.pages.basic.Page;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features 	= { "src/test/resources/features" }, 
		glue 		= { "com.exer.table.stepdefs" },
		tags 		= { "@testTable" }, 
		dryRun 		= false, 
		strict 		= false,
		monochrome 	= true, 
		plugin 		= { "json:target/cucumber.json" })

public class UTSTest extends CommonObjects {


	@BeforeClass
	public static void setupSuite() {
		
		page = new Page();

	}

	@AfterClass
	public static void tearDownSuite() {

driver.close();
	}
}
