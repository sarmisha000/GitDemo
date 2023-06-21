package com.ericsson.estee.ui.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {
//	private WebDriver driver;
	// private JavascriptExecutor javascriptExecutor;
	private By acceptCookiesBtn = By.xpath("//button[@id='onetrust-accept-btn-handler']");
	private By spinWheelCloseBtn = By.xpath(
			"//div[@class='ins-selectable-element ins-element-wrap ins-element-close-button ins-wheel-of-fortune-close-button']//div[@class='ins-element-content']");

	private By signInLink = By.xpath("//span[@data-test-id='gnav_account_menu_login']");
	private By playNowBtn = By.xpath("//button[@class='sp-custom-c15 ins-start-button']");
	private By playNowCrossBtn = By.xpath("//div[@class='ins-close-button']");
	// div[@class='ins-close-button']

	private By servicesLink = By.xpath(
			".//div[@class='basic-menuref-v1 menu-ref js-menu-ref']/h3[@class='menu-ref__title']//a[text()='SERVICES']");
	private By playNowPopup = By.xpath(".//div[@class='ins-welcome-container-c55']");

	public HomePage(WebDriver driver) {
		super(driver);
	//	this.driver = driver;

	}

	public boolean clickAcceptCookieBtn() {
		boolean flag = false;
		try {
			List<WebElement> locAcceptCookiesBtn = driver.findElements(acceptCookiesBtn);
			if (locAcceptCookiesBtn.size() > 0) {

				javascriptExecutor.executeScript("arguments[0].click();", locAcceptCookiesBtn.get(0));
				flag = true;
			}
			else
			{
				System.out.println("Accept cookie window didn't appear");
				flag=true;
			}

			
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean clickToCloseSpinWheel() {
		boolean flag = false;
		try {
			WebElement locSpinWheelCloseBtn = driver.findElement(spinWheelCloseBtn);
			javascriptExecutor.executeScript("arguments[0].click();", locSpinWheelCloseBtn);
			flag = true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean clickSignInLink() {
		boolean flag = false;
		try {
			try {
				// WebElement locPlatNowBtn = driver.findElement(playNowBtn);
				// javascriptExecutor.executeScript("arguments[0].click();", locPlatNowBtn);
			} catch (NoSuchElementException exception) {
				// System.out.println("playNowBtn is not available");
			}
			try {
				WebElement locPlayNowCrossBtn = driver.findElement(playNowCrossBtn);
				javascriptExecutor.executeScript("arguments[0].click();", locPlayNowCrossBtn);
			} catch (NoSuchElementException exception) {
				// System.out.println("playNowCrossBtn is not available");
			}
			WebElement locSignInLink = driver.findElement(signInLink);
			javascriptExecutor.executeScript("arguments[0].click();", locSignInLink);
			flag = true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean clickServicesLink() throws Exception {
		boolean flag = false;
		try {
//		 WebElement playNowPopups=driver.findElement(playNowPopup);
//			WebDriverWait wait = new WebDriverWait(driver,Duration.ofMinutes(30));
//			wait.until(ExpectedConditions.visibilityOf(playNowPopups));
			WebElement serviceLink = driver.findElement(servicesLink);
			javascriptExecutor.executeScript("arguments[0].click();", serviceLink);
			flag = true;
		} catch (NoSuchElementException exception) {
			exception.printStackTrace();
		}
		return flag;

	}
}
