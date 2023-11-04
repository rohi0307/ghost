package com.mavenGhost;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Locators {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.chrome.driver", "D:\\BytesSquare\\Selenium\\Installation\\Driver\\chrome driver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement email=driver.findElement(By.id("modalusername")); //user name
	email.sendKeys("test@gmail.com");
	WebElement pass=driver.findElement(By.name("current-password"));  //password
	pass.sendKeys("pass#123");
	WebElement login=driver.findElement(By.className("LoginModal_cta_bottom_box_button_login__5Fbwv")); //clicked login button
	login.click();
	Thread.sleep(2000);
	driver.close();

}
}
