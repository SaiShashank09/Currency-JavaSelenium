package com.exer.table.stepdefs;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.exer.table.runner.CommonObjects;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BasicStepDefs extends CommonObjects {

	@Before
	public void start() {

		switch (browserType) {
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "/Users/saishashanksarikonda/Documents/Sai-Testing/chromedriver");
			driver = new ChromeDriver();
			break;

		default:
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10);
	}

	@After
	public void end() throws Throwable {

		if (scenario.isFailed()) {

			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/jpeg");
		}

		try {

			driver.quit();
		} catch (Exception e) {

		}
	}

}
