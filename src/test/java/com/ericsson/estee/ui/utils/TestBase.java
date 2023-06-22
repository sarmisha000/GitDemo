//This is test base
package com.ericsson.estee.ui.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class TestBase {
//driver is initialized in TestBase.java
//webDriverManager() gives u the driver; 
//pageObjectManager takes the driver from webDriverManager and delegates to all page object files
//the managers r initialized in TestContextSetup
	private WebDriver driver;
	private Properties prop;
	
	public WebDriver webDriverManager() {//creates the webdriver
		String url = "";
		String browser = "";
		
		if(prop == null) {
			try {
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
				prop = new Properties();
				prop.load(fis);
				url = prop.getProperty("tsturl");
				String browserValueFromPropertiesFile = prop.getProperty("browser");
				String browserValueFromMaven = System.getProperty("browser");
				browser = browserValueFromMaven!=null ? browserValueFromMaven : browserValueFromPropertiesFile;
				
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		if(driver == null) {
			//String browser = prop.getProperty("browser");
			if(browser.equalsIgnoreCase("chrome")) {
				System.out.println("chrome driver");
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver.exe");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--disable-notifications");
				chromeOptions.setAcceptInsecureCerts(true);
				driver = new ChromeDriver(chromeOptions);
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				System.out.println("firefox driver");
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//src//test//resources//geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.manage().deleteAllCookies();
			driver.get(url);
		}
		return driver;
	}

}
