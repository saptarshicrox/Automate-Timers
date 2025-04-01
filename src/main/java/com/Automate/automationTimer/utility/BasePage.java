package com.Automate.automationTimer.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver wdriver;
	String sectionName = null;
	
	
	
	public BasePage(WebDriver wdriver2) {
		// TODO Auto-generated constructor stub
	}
	
	public void waitUntilElementAppears(String xpath) {
		WebDriverWait wait = new WebDriverWait(wdriver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
	}


	public void waitUntilElementAppears(WebElement element) {

		WebDriverWait wait = new WebDriverWait(wdriver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public WebDriver launchBrowser(String url) {

	
			System.setProperty("webdriver.chrome.driver", "./browserDrivers/chromedriver.exe");
			wdriver = new ChromeDriver();
		
		System.err.println(url);
		
		wdriver.get(url);
		wdriver.manage().window().maximize();
		return wdriver;
	}

}
