package com.Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public WebDriver driver;
	String pathToDriver = "C:\\Users\\krish\\Documents\\chromedriver.exe";

	public BaseClass() {
		if (this.driver == null) {
			System.setProperty("webdriver.chrome.driver", pathToDriver);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	}

	public void openURL() {
		driver.get("http://google.com");
		
	}

	public void closeApplication() {
		driver.quit();
	}
}
