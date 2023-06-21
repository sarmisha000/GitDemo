package com.ericsson.estee.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage {
	//private WebDriver driver;
	//private JavascriptExecutor javascriptExecutor;
	private By firstNameTxtBox = By.xpath("//input[@id='sign-in-component__FIRST_NAME']");
	private By acceptTcChkBox = By.xpath("//input[@id='sign-in-component__ACCEPTED_PRIVACY_POLICY']");
	private By email = By.xpath("//input[@id='sign-in-component__PC_EMAIL_ADDRESS']");
	private By password = By.xpath("//input[@data-test-id='gnav_register_form_password']");
	private By createAccBtn = By.xpath("//input[@data-test-id='gnav_form_register']");
	private By existingUserSignInLink = By.xpath("//div[@data-test-id='gnav_form_login']/a");

	public SignUpPage(WebDriver driver) {
		super(driver);
	//	this.driver = driver;
		
	}

	public boolean enterFirstName() {
		boolean flag = false;
		try {
			driver.findElement(firstNameTxtBox).sendKeys("ananda");
			flag = true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean enterEmail() {
		boolean flag = false;
		try {
			driver.findElement(email).sendKeys("tajautomation11+14@gmail.com");
			flag = true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean enterPassword() {
		boolean flag = false;
		try {
			driver.findElement(password).sendKeys("Selenium123");
			flag = true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean clickAcceptTcChkBox() {
		boolean flag = false;
		try {
			// driver.findElement(acceptTcChkBox).click();
			WebElement locAcceptTcChkBox = driver.findElement(acceptTcChkBox);
			javascriptExecutor.executeScript("arguments[0].click();", locAcceptTcChkBox);
			flag = true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean clickCreateAccBtn() {
		boolean flag = false;
		try {
			// driver.findElement(acceptTcChkBox).click();
			WebElement locCreateAccBtn = driver.findElement(createAccBtn);
			javascriptExecutor.executeScript("arguments[0].click();", locCreateAccBtn);
			flag = true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean clickExistingUserSignInLink() {
		boolean flag = false;
		try {
			Thread.sleep(10000);

			WebElement locExistingUserSignInLink = driver.findElement(existingUserSignInLink);
			javascriptExecutor.executeScript("arguments[0].click();", locExistingUserSignInLink);
			flag = true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		return flag;
	}
}
