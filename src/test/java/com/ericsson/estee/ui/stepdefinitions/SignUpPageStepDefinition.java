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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.ericsson.estee.ui.pageobjects.SignUpPage;
import com.ericsson.estee.ui.utils.TestContextSetup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUpPageStepDefinition {
	TestContextSetup testContextSetup;
	SignUpPage signUpPage;

	public SignUpPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.signUpPage = testContextSetup.pageObjectManager.getSignUpPage();

	}

	@Then("user enters first name")
	public void user_enters_first_name() {
		boolean enterFirstName=signUpPage.enterFirstName();
		Assert.assertEquals(enterFirstName, true);
	}

	@Then("user enters email")
	public void user_enters_email() {
		boolean enterEmail=signUpPage.enterEmail();
		Assert.assertEquals(enterEmail, true);

	}

	@Then("user enters password")
	public void user_enters_password() {
		boolean enterPassword=signUpPage.enterPassword();
		Assert.assertEquals(enterPassword, true);

	}

	@Then("user clicks terms and conditions check box")
	public void user_clicks_terms_and_conditions_check_box() {
		boolean clickAcceptTcChkBox=signUpPage.clickAcceptTcChkBox();
		Assert.assertEquals(clickAcceptTcChkBox, true);
	}

	@Then("user clicks create account button")
	public void user_clicks_create_account_button() {
		boolean clickCreateAccBtn=signUpPage.clickCreateAccBtn();
		Assert.assertEquals(clickCreateAccBtn, true);
	}
	@Then("user clicks sign in link for Exiting User")
	public void user_clicks_sign_in_link_for_exiting_user() {
		
		// need to click singn in link for existing user from signup pg
		// exitingUserSignInbtn =
		// driver.findElement(By.xpath("//div[@data-test-id='form_sign_in']/a"));
		// javaScriptExecutor.executeScript("arguments[0].click()",
		// exitingUserSignInbtn);

		//// div[@data-test-id='form_sign_in']/a
		boolean assertClickExistingUserSignInLink = signUpPage.clickExistingUserSignInLink();
		Assert.assertEquals(assertClickExistingUserSignInLink, true);
	}

}
