package com.mavenGhost;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAuthenticate {
	WebDriver driver;
	
@BeforeTest
	public void browserSetup() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ROHIT\\eclipse-workspace\\Ghost\\drivers\\chrome driver\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
@AfterTest
public void closeBrowser() {
	driver.close();
}
@Test (enabled = false)
public void checkBox() throws InterruptedException {
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]")).click();
	Thread.sleep(2000);
}
@Test
public void keyboard() {
	Actions ac=new Actions(driver);
	driver.get("https://the-internet.herokuapp.com/context_menu");
	WebElement cc=driver.findElement(By.id("hot-spot"));
	ac.contextClick(cc).build().perform();
}

	
		

}