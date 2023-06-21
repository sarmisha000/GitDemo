package com.ericsson.estee.ui.stepdefinitions;

import java.time.Duration;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.ericsson.estee.ui.pageobjects.HomePage;
import com.ericsson.estee.ui.pageobjects.PageObjectManager;
import com.ericsson.estee.ui.utils.TestContextSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {

	TestContextSetup testContextSetup;
	HomePage hp;

	public HomePageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.hp = testContextSetup.pageObjectManager.getHomePage();
	}

	@Given("user is on Home page")
	public void user_is_on_home_page() {

		boolean assertClickAcceptCookieBtn = hp.clickAcceptCookieBtn();
		Assert.assertEquals(assertClickAcceptCookieBtn, true);

	}

	@When("user clicks sign in link")
	public void user_clicks_sign_in_link() {

		boolean assertClickSignInLink = hp.clickSignInLink();
		Assert.assertEquals(assertClickSignInLink, true);
	}
	
	@When("user clicks services link")
	public void user_clicks_services_link() throws Exception {

		boolean assertClickServicesLink = hp.clickServicesLink();
		Assert.assertEquals(assertClickServicesLink, true);
	}
}
