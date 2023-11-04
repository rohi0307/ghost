package com.mavenGhost;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazonMoveCursor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "D:\\BytesSquare\\Selenium\\Installation\\Driver\\chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/ref=nav_logo");
		WebElement cursor=driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(2000);
		Actions ac=new Actions(driver);
		ac.moveToElement(cursor).build().perform();
		Thread.sleep(2000);
		driver.close();
		
	}
}
