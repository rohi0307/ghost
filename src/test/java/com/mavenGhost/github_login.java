package com.mavenGhost;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class github_login {
	@Test
	public void github_Login() throws InterruptedException{
		System.setProperty("Webdriver.chrome.driver", "D:\\\\BytesSquare\\\\Selenium\\\\Installation\\\\Driver\\\\chrome driver\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		WebElement username=driver.findElement(By.id("login_field"));
		username.sendKeys("rohitchavan8180@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Ghost#0307");
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(3000);
		WebElement dashboard=driver.findElement(By.xpath("//img[@src=\"https://avatars.githubusercontent.com/u/78890669?v=4\"]"));
		dashboard.click();
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\ROHIT\\eclipse-workspace\\Ghost\\Screenshots\\ss.png");
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
@Test
	public void Wikipedia_Topic_search() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\BytesSquare\\Selenium\\Installation\\Driver\\edge driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org/");
		WebElement search_box=driver.findElement(By.id("searchInput"));
		search_box.sendKeys("Selenium WebDriver");
		WebElement search_button=driver.findElement(By.xpath("//button[@class='pure-button pure-button-primary-progressive']"));
		search_button.click();
		Thread.sleep(2000);
		WebElement firstresult=driver.findElement(By.cssSelector(".mw-search-result-heading a"));
		firstresult.click();
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\ROHIT\\eclipse-workspace\\Ghost\\Screenshots\\wikiresult.png");
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		}
	@Test
	public void language_select_wiki() {
		System.setProperty("webdriver.edge.driver", "D:\\BytesSquare\\Selenium\\Installation\\Driver\\edge driver\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.wikipedia.org/");
		WebElement language=driver.findElement(By.linkText("//span[text()='Read Wikipedia in your language ']"));
		//WebElement hindiselect=driver.findElement(By.linkText("हिन्दी"));
		//hindiselect.click();
		Select sc=new Select(language);
		sc.selectByVisibleText("हिन्दी");
		
		
	}
	}
	











































