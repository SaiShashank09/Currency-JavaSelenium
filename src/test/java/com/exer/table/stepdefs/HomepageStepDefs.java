package com.exer.table.stepdefs;


import com.exer.table.allpages.HomePage;
import com.exer.table.runner.CommonObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.fail;



public class HomepageStepDefs extends CommonObjects {

	
	
	@Given("^I navigate to values page$")
	public void i_navigate_to_values_page() throws Throwable {
	   page.openApplication();
	}
	@When("^I am on Values page$")
	public void i_am_on_Values_page() throws Throwable {
		if(HomePage.getPage().verifypagetitle()){
			System.out.println("page title verified successfully");
		}else
		{
			fail("Should have thrown an exception");
		}
	   
	}

	@Then("^I should see right number of values appers on the screen$")
	public void i_should_see_right_number_of_values_appers_on_the_screen() throws Throwable {
		if(HomePage.getPage().verifyValueCount()==5){
			System.out.println("right number of values appeared");
		}else{
			fail("Should have thrown an exception");
		}
		
	}

	@Then("^Values on the screen should be greater than zero$")
	public void values_on_the_screen_should_be_greater_than_zero() throws Throwable {
	    if(HomePage.getPage().validateValues()){
	    	System.out.println("values are greater than zero ");
	    }else{
			fail("Should have thrown an exception");
		}
	}

	@Then("^Total balance should be sum of the listed values on the screen$")
	public void total_balance_should_be_sum_of_the_listed_values_on_the_screen() throws Throwable {
		if(HomePage.getPage().validatetotal()){
	    	System.out.println("Sum of the listed values are equale to total balance");
	    }else{
			fail("Should have thrown an exception");
		}
	}

	@Then("^values should be formatted as currencies$")
	public void values_should_be_formatted_as_currencies() throws Throwable {
		if(HomePage.getPage().currrencyValidator()){
	    	System.out.println("values are formatte as currencies");
	    }else{
			fail("Should have thrown an exception");
		}
		
		
	

	}
	
}
