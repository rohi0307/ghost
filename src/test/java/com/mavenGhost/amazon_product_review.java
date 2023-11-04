package com.mavenGhost;

import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amazon_product_review {
	WebDriver driver;
	@Test
	public void browserSet() {
		System.setProperty("Webdriver.chrome.driver", "D:\\\\BytesSquare\\\\Selenium\\\\Installation\\\\Driver\\\\chrome driver\\\\chromedriver-win64\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("iphone 14");
		WebElement searchbtn=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbtn.click();
		}
	@Test
	public void searchedProduct() {
		WebElement result=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
		result.click();
	}
	
	@Test
	public void checkDetails() {
		WebElement product_name=driver.findElement(By.xpath("//span[@id='productTitle']"));
		Assert.assertTrue(product_name.isDisplayed());
		WebElement product_price=driver.findElement(By.xpath("//*[@id=\"corePriceDisplay_desktop_feature_div\"]/div[1]/span[2]/span[2]/span[2]"));
		Assert.assertTrue(product_price.isDisplayed());
	}
	
	@Test
	public void productReview() throws InterruptedException {
		WebElement proReview=driver.findElement(By.xpath("//h2[text()='Customer reviews']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", proReview);
		Thread.sleep(2000);
		Assert.assertTrue(proReview.isDisplayed());
	}
}
