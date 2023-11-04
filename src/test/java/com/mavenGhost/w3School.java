package com.mavenGhost;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class w3School {
	WebDriver driver=new ChromeDriver();
	SoftAssert soft=new SoftAssert();
	
	@BeforeTest
	public void BrowserSet() {
		System.setProperty("Webdriver.chrome.driver", "D:\\\\BytesSquare\\\\Selenium\\\\Installation\\\\Driver\\\\chrome driver\\\\chromedriver-win64\\\\chromedriver.exe");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/");
		
	}
	@Test(priority = 1)
	public void titleCheck() {
		String expectedTitle="W3Schools Online Web Tutorials";
		String actualTitle =driver.getTitle();
		soft.assertEquals(expectedTitle, actualTitle);
	}
	
	@Test(priority = 2)
	public void login() throws InterruptedException {
	WebElement loginButton=driver.findElement(By.xpath("//a[@class='user-anonymous tnb-login-btn w3-bar-item w3-btn bar-item-hover w3-right ws-light-green ga-top ga-top-login']"));
	soft.assertTrue(loginButton.isDisplayed());
	loginButton.click();
	WebElement username=driver.findElement(By.id("modalusername"));
	soft.assertTrue(username.isDisplayed());
	username.sendKeys("vigeti5590@alvisani.com");
	WebElement password=driver.findElement(By.xpath("//input[@class='PasswordInput_input_field__EWMIU undefined']"));
	soft.assertTrue(password.isDisplayed());
	password.sendKeys("Test@123");
	WebElement loginclick=driver.findElement(By.xpath("//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']"));
	soft.assertTrue(loginclick.isDisplayed());
	loginclick.click();
	Thread.sleep(13000);
	}
	
	@Test(priority = 3)
	public void checkDashboard() {
		WebElement dashboard=driver.findElement(By.xpath("//div[@class='MainHeader_mainHeaderTitle__14sVT']"));
		soft.assertTrue(dashboard.isDisplayed());
		soft.assertAll();
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
