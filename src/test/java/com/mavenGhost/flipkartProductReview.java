package com.mavenGhost;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class flipkartProductReview {
	WebDriver driver=new ChromeDriver();
	SoftAssert soft=new SoftAssert();
		@BeforeTest
		public void browserSet() {
		System.setProperty("Webdriver.chrome.driver", "D:\\\\BytesSquare\\\\Selenium\\\\Installation\\\\Driver\\\\chrome driver\\\\chromedriver-win64\\\\chromedriver.exe");
		driver.manage().window().maximize();
		}
		
		@Test(priority = 1)
		public void productSearch() throws InterruptedException {
			driver.get("https://www.flipkart.com/search?q=iphone+14&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_1_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_1_na_na_na&as-pos=2&as-type=RECENT&suggestionId=iphone+14%7CMobiles&requestId=dc19c74e-f22e-4c7a-860e-a4321bea6882&as-backfill=on");
			Thread.sleep(4000);
			WebElement product=driver.findElement(By.xpath("//body/div[@id='container']/div/div[@class='_36fx1h _6t1WkM _3HqJxg']/div[@class='_1YokD2 _2GoDe3']/div[@class='_1YokD2 _3Mn1Gg']/div[2]/div[1]/div[1]/div[1]"));
			product.click();
			Thread.sleep(2000);
		}
		
		@Test(priority = 2)
		public void checkdetails() {
			WebElement prod_name=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/h1/span"));
			soft.assertTrue(prod_name.isDisplayed());
			WebElement prod_price=driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
			soft.assertTrue(prod_price.isDisplayed());
			soft.assertAll();
		}
		
		@Test(priority = 3)
		public void prodreview() {
			WebElement reviewHeading=driver.findElement(By.xpath("//div[text()='Ratings & Reviews']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", reviewHeading);
		}
		
		@AfterTest
		public void close() {
			driver.quit();
		}	
	}

