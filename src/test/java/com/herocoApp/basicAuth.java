package com.herocoApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicAuth {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ROHIT\\eclipse-workspace\\Ghost\\drivers\\chrome driver\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com/checkboxes");
	driver.findElement(By.xpath("//input[@type=\"checkbox\"][1]")).click();
	driver.findElement(By.xpath("//input[@type=\"checkbox\"][2]")).clear();
}
	

}
