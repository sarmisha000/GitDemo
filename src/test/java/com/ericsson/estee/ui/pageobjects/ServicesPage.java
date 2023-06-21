package com.ericsson.estee.ui.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ServicesPage extends BasePage {
	//private WebDriver driver;
	///private JavascriptExecutor javascriptExecutor;

	private By storeLocatorLink = By
			.xpath(".//div[@class='stores are reopening banner']//span[contains(text(),'FIND A STORE NEAR YOU')]");
	private By findAStoretxt = By.xpath(
			".//div[@class='store-locator store-locator-content store-locator--local-search']//h1[@class='store-locator__title' and contains(text(),'Find a Store')]");
	private By zipCode = By.xpath(".//form[@class='local-search-form']//input[@id='zip-field' and @name='zip-field']");
	private By cityselectdropdown = By.xpath(".//a[@class='selectBox local-search-form__city selectbox selectBox-dropdown']");
	//private By cityList = By.xpath("//select[@data-test-id='storelocator_City']");
	private By selectCity =By.cssSelector(".local-search-form__city-selectBox-dropdown-menu>li:nth-child(4)>a");
			
	private By submitbtn = By.xpath(
			".//form[@class='local-search-form']/div[@class='local-search-form__inner']//input[@type='submit' and @value='Find a Store']");
	private By viewAllLink = By
			.xpath(".//form[@class='local-search-form']//div[@class='store-results']//a[text()='View All']");
	private By citySearchresult = By.xpath("//div[@class='store-results']//div[contains (@class,'door-row door-row-')]//div[@class='door-row__address']");

	private By servicePage = By.xpath(".//div[@id='content']//h2[contains(text(),\"Beauty Services\")]");
	private By nearestStore =By.xpath(".//div[@class='content column column-main']//h3[text()='Our stores are open!']");

	public ServicesPage(WebDriver driver) {
		super(driver);
		//this.driver = driver;
		//this.javascriptExecutor=javascriptExecutor;
	}
	public boolean user_is_in_services_page() {
		boolean flag=false;
		try {
			WebElement servicePageHeading = driver.findElement(servicePage);
			if(servicePageHeading.getText().equalsIgnoreCase("Beauty Services"))
			{
				flag=true;
			}
		}
		catch(Exception exception)
		{exception.printStackTrace();}
return flag;
	}

	public boolean user_click_on_find_a_store_near_you() {
		boolean flag = false;
		try {
			WebElement nearestStores=driver.findElement(nearestStore);
			if (nearestStores.isDisplayed()) {
				WebElement storeLocator = driver.findElement(storeLocatorLink);
				javascriptExecutor.executeScript("arguments[0].click();",storeLocator);
				flag = true;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean user_should_be_taken_to_find_a_store_page() {
		boolean flag = false;
		try {
			WebElement findAStoreTxt = driver.findElement(findAStoretxt);
			if (findAStoreTxt.isDisplayed()) {
				flag = true;
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean user_enter_the_zip_code_and_city() {
		boolean flag = false;
		try {
		//	WebElement zip = driver.findElement(zipCode);
		//	Thread.sleep(500);//mot needed as implicit wait is already there
		//	zip.click();
		//	zip.sendKeys("600042");
		WebElement cityDropDown = driver.findElement(cityselectdropdown);
		//wait.until(ExpectedConditions.elementToBeClickable(cityDropDown));
		cityDropDown.click();
		//Select city = new Select(cityDropDown);
	//city.selectByVisibleText("Chennai");
		WebElement city= driver.findElement(selectCity);
		city.click();
		
			flag = true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean click_find_a_store_button() {
		boolean flag = false;
		try {
			WebElement finAStorebtn = driver.findElement(submitbtn);
			finAStorebtn.click();
			flag = true;
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;
	}

	public boolean all_the_stores_with_city_and_zipcode_entered_should_be_listed() {
		boolean flag = false;
		try {
			
	WebElement viewAll = driver.findElement(viewAllLink);
			//actions.scrollToElement(viewAll).click().perform();
	//viewAll.click(); //didn't work
	javascriptExecutor.executeScript("arguments[0].click();",viewAll);
			List<WebElement> nearstores = driver.findElements(citySearchresult);
			for (WebElement i : nearstores) {
				System.out.println(i.getText());
				if (i.getText().trim().contains("Chennai")||i.getText().trim().contains("chennai")) {
					flag = true;
									
				} else {
					flag = false;
					break;
				}
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return flag;

	}

}
