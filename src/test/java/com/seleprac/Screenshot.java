package com.seleprac;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot {
	static WebDriver driver;
	@BeforeTest
	static void BrowerSetup() throws InterruptedException {
		System.setProperty("WebDriver.firefox.driver", "C:\\Users\\ROHIT\\eclipse-workspace\\Ghost\\drivers\\firefox driver\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/immortal_s_oul/");
		Thread.sleep(3000);
	}
	@AfterTest
	static void CloseBrowser() {
		driver.close();
	}
	@Test
	static void ScreenShot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File destination=ts.getScreenshotAs(OutputType.FILE);
		File source=new File("C:\\Users\\ROHIT\\eclipse-workspace\\Ghost\\Screenshots\\instasc.png");
		FileHandler.copy(destination, source);
	}
	
	
}
