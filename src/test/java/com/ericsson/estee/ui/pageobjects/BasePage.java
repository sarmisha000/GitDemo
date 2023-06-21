package com.ericsson.estee.ui.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions actions;
	public JavascriptExecutor javascriptExecutor;
	
	public BasePage(WebDriver driver)
	{
	this.driver= driver;
	wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	actions = new Actions(driver);
	javascriptExecutor = (JavascriptExecutor) driver;
	}
}
