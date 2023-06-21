package com.ericsson.estee.ui.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.ericsson.estee.ui.pageobjects.ServicesPage;
import com.ericsson.estee.ui.utils.TestContextSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ServicesPageStepDefinition {
	TestContextSetup testContextSetup;
	ServicesPage sp;
	public ServicesPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.sp=testContextSetup.pageObjectManager.getServicesPage();
	}

	@Then("user is in services page")
	public void user_is_in_services_page() {
		boolean assertInServicePage =sp.user_is_in_services_page();
		Assert.assertEquals(assertInServicePage, true);
	}
	@When("user click on find a store near you")
	public void user_click_on_find_a_store_near_you() {
		boolean assertFindaStoreLink =sp.user_click_on_find_a_store_near_you();
		Assert.assertEquals(assertFindaStoreLink, true);
	}
	@Then("user should be taken to find a store page")
	public void user_should_be_taken_to_find_a_store_page() {
		boolean assertFindAStorePage=sp.user_should_be_taken_to_find_a_store_page();
		Assert.assertEquals(assertFindAStorePage, true);
	
	}
	@When("user enter the zip code and city")
	public void user_enter_the_zip_code_and_city() {
		boolean assertEnterZipCode=sp.user_enter_the_zip_code_and_city();
		Assert.assertEquals(assertEnterZipCode, true);
	  
	}
	@When("click find a store button")
	public void click_find_a_store_button() {
		boolean assertFindAStrorebtnClick= sp.click_find_a_store_button();
		Assert.assertEquals(assertFindAStrorebtnClick, true);
	}
	@Then("all the stores with city and zipcode entered should be listed")
	public void all_the_stores_with_city_and_zipcode_entered_should_be_listed() {
		boolean assertFindStores=sp.all_the_stores_with_city_and_zipcode_entered_should_be_listed();
		Assert.assertEquals(assertFindStores, true);
	  
	}

}
