package com.mavenGhost;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragDrop {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "D:\\BytesSquare\\Selenium\\Installation\\Driver\\chrome driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(null);
	}

}
