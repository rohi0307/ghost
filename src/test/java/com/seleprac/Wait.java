package com.seleprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wait {
public static void main(String[] args) {
	explicitewait();
}
	static void implicitewait() {
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\ROHIT\\eclipse-workspace\\Ghost\\drivers\\edge driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	static void explicitewait() {
		System.setProperty("WebDriver.edge.driver", "C:\\Users\\ROHIT\\eclipse-workspace\\Ghost\\drivers\\edge driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Actions ac=new Actions(driver);
		driver.findElement(By.id("APjFqb")).sendKeys("marvel");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
	
	}
}
