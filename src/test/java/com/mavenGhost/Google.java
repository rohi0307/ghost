package com.mavenGhost;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;
	
	@Test
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", "D:\\\\BytesSquare\\\\Selenium\\\\Installation\\\\Driver\\\\chrome driver\\\\chromedriver-win64\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	public void search() {
		WebElement searchbox=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
		searchbox.sendKeys("Manual testing");
		WebElement searchbtn=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		searchbtn.click();
	}
}
