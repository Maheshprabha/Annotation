package com.atmecs.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchChrome {
	String Url = "http://automationpractice.com/index.php";
	String chromeDriverPath = "C:\\Users\\admin\\eclipse-workspace\\Empl\\Driver\\chromedriver.exe";
	public WebDriver driver;
	@BeforeTest
	public void launchChrome() throws InterruptedException {
	System.out.println("launching chrome browser");
	//configure system properties of chrome driver
	System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	//Initializing the webdriver instances
	WebDriver driver = new ChromeDriver();
	//launch the Webdriver
	driver.get(Url);
	Thread.sleep(2000);
	}
	@SuppressWarnings("unused")
	@Test
	public void getTittle() throws InterruptedException {
		System.out.println("Title of the page");
		driver.get("http://automationpractice.com/index.php");
		String title = driver.getTitle();
		Thread.sleep(1000);
		System.out.println("Title is:: " +title);

	//System.out.println("geturl");
    // PageTitle = driver.getTitle();
	//System.out.println("Page title::" +PageTitle);
	//Assert.assertEquals(PageTitle,"My Store");
	}
	@AfterTest
	public void terminateBrowser() {
	driver.close();
	
	}

}
