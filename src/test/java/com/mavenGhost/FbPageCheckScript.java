package com.mavenGhost;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FbPageCheckScript {

	public static void main(String[] args) {
		System.setProperty("Webdriver.firefox.driver", "D:\\BytesSquare\\Selenium\\Installation\\Driver\\firefox driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		String str=driver.getCurrentUrl();
		System.out.println(str);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
