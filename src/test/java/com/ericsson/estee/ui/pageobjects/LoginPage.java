package com.ericsson.estee.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
	//private WebDriver driver;
	//private JavascriptExecutor javascriptExecutor;

	private By exitingUserEmailId = By.xpath("//input[@id='sign-in-component__EMAIL_ADDRESS']");
	private By exitingUserPassword = By
			.xpath("//input[@id='sign-in-component__PASSWORD' and @data-test-id='gnav_login_form_password']");
	private By signInBtn = By.xpath("//input[@data-test-id='gnav_form_login']");
	private By myAccountsPgTitle = By.xpath("//*[@class='account-page__header']");

	public LoginPage(WebDriver driver) {
		super(driver);
		//this.driver = driver;
	}

	public boolean enterExitingUserEmailId(String emailId) {
		boolean flag=false;
		try {
			WebElement locExitingUserEmailId = driver.findElement(exitingUserEmailId);
			locExitingUserEmailId.clear();
			Thread.sleep(3000);
			locExitingUserEmailId.sendKeys(emailId.trim());
			flag=true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean enterExitingUserPassword(String password) {
		boolean flag=false;
		try {
			WebElement locExitingUserPassword = driver.findElement(exitingUserPassword);
			locExitingUserPassword.clear();
			Thread.sleep(3000);
			locExitingUserPassword.sendKeys(password.trim());
			flag=true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean clickSignInBtn() {
		boolean flag=false;
		try {
			Thread.sleep(5000);
			WebElement locSignInBtn = driver.findElement(signInBtn);
			// javascriptExecutor.executeScript("arguments[0].click();", locSignInBtn);
			locSignInBtn.click();
			flag=true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}
	public String getPageTitle() {
		WebElement locMyAccountsPgTitle = driver.findElement(myAccountsPgTitle);
		return locMyAccountsPgTitle.getText();
	}
}
