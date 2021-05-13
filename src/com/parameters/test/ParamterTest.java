package com.parameters.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {

	WebDriver driver;

	@Test
	@Parameters({ "browser", "url", "emailid" })
	// by using enviromental variables --in paramter format which are frequenty used
	// hence
	// data drivern concepts---excel file,testng.xml,propertiesfile--can store--env
	// variable,object repos,test data

	public void YahooLoginTest(String browser, String url, String emailid) throws InterruptedException {

		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver90\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver", "C:\\chromedriver90\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void LogOut() {
		driver.quit();
	}

}
	