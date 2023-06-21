package com.ericsson.estee.ui.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;


import com.ericsson.estee.ui.pageobjects.LoginPage;
import com.ericsson.estee.ui.utils.TestContextSetup;

import io.cucumber.java.en.Then;

public class LoginPageStepDefinition {
	TestContextSetup testContextSetup; //every step definition should have testContextSetup class object as data member
	LoginPage loginPage;//every step definition should have its page class object as data member
	String expectedLoginPgTitle = "My Account";

	public LoginPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.loginPage = testContextSetup.pageObjectManager.getLoginPage();
		}

	

	@Then("^enters Existing User email(.+)$")
	public void enters_exiting_user_email(String emailId) {
		boolean enterExitingUserEmailId=loginPage.enterExitingUserEmailId(emailId);
		Assert.assertEquals(enterExitingUserEmailId, true);

	}

	@Then("^enters Existing User password(.+)$")
	public void enters_exiting_user_password(String password) {
		boolean enterExitingUserPassword=loginPage.enterExitingUserPassword(password);
		Assert.assertEquals(enterExitingUserPassword, true);

	}

	@Then("user clicks Sign in button")
	public void user_clicks_sign_in_button() {
		boolean clickSignInBtn=loginPage.clickSignInBtn();
		Assert.assertEquals(clickSignInBtn, true);
	}

	@Then("user lands to Myaccount Page")
	public void user_lands_to_myaccount_page() {
		String actualLoginPgTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedLoginPgTitle,actualLoginPgTitle);
	}

}
