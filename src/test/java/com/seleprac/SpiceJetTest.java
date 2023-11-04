package com.seleprac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SpiceJetTest {
	static WebDriver driver;

	@BeforeTest
	static void BrowerSetuo() {
		System.setProperty("WebDriver.firefox.driver",
				"C:\\Users\\ROHIT\\eclipse-workspace\\Ghost\\drivers\\firefox driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("span[role='button']")).click();
	}

	@AfterTest
	static void BrowerClose() {
		driver.close();
	}
	@Test(enabled = false)
	static void RadioButtonCheck() throws InterruptedException {
		driver.findElement(By.cssSelector("li[data-cy='roundTrip'] span[class='tabsCircle appendRight5']")).click();
		driver.findElement(By.id("fromCity")).sendKeys("Mumbai");
		List <WebElement> options = driver.findElements(By.cssSelector("p[class='font14 appendBottom5 blackText']"));
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("mumbai")) {
				option.click();
			}
		}
		Thread.sleep(2000);
	}

	}
