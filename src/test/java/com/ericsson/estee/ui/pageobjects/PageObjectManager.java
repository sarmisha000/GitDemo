package com.ericsson.estee.ui.pageobjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	private WebDriver driver;
	private HomePage homePage;
	private SignUpPage signUpPage;
	private LoginPage loginPage;
	private ServicesPage servicesPage;
	//PageObjectManager takes the driver from webdriverManager() and delegates to all files
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		homePage = new HomePage(driver);
		return homePage;
	}
	public SignUpPage getSignUpPage() {
		signUpPage = new SignUpPage(driver);
		return signUpPage;
	}
	public LoginPage getLoginPage() {
		loginPage = new LoginPage(driver);
		return loginPage;
	}
	
	public ServicesPage getServicesPage()
	{
		servicesPage=new ServicesPage(driver);
		return servicesPage;			
	}
	
}
