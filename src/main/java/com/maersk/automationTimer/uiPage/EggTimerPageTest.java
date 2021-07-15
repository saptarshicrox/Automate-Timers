package com.maersk.automationTimer.uiPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.maersk.automationTimer.utility.BasePage;
import com.maersk.automationTimer.utility.StopWatch;




public class EggTimerPageTest extends BasePage{
	
	public static WebDriver wdriver;
	StopWatch countdownTimer = new StopWatch();
	
	
	@FindBy(xpath = "//*[@id=\'EggTimer-start-time-input-text\']")
	WebElement inputTextBox; 
	
	@FindBy(xpath = "//button[contains(text(), 'Start')]")
	WebElement startButton;
	
	
	@FindBy(xpath = "//*[@class='ClassicTimer-time']")
	List<WebElement> parentTimer;
	
	
	@FindBy(xpath = "//*[@class='ClassicTimer-inner']")
	List<WebElement> innerTimer;
	
	@FindBy(xpath = "//*[@class='ClassicTimer']")
	WebElement outerTimer;
	
	
	@FindBy(xpath = "//title")
	WebElement title;
	
//		WebDriverWait wait = new WebDriverWait(wdriver, 5);
	
	public EggTimerPageTest(WebDriver wdriver) {
		super(wdriver); // super(wdriver)
		PageFactory.initElements(wdriver, this);
	}
	
	
	
	
	public void assertOnCountdown(String duration) throws InterruptedException {
		
		
		int testDuration = Integer.parseInt(duration) * 1000; // converting to millisecond
		
		
		waitUntilElementAppears(inputTextBox);
		
			inputTextBox.sendKeys(duration);
			startButton.click();
			
			
			ArrayList<String> countdownTime = new ArrayList<>();
			//fetch the time dynamically
			long startTime = System.currentTimeMillis();
			
			while(false || (System.currentTimeMillis() - startTime) < 24000) {
				Thread.sleep(1000);
				String timerText = title.getAttribute("innerHTML"); 
				countdownTime.add(timerText);
				
			}
			
			
			
			
			String finalTimer = title.getAttribute("innerHTML");
			
			
			
			//Checking for the timers working
			
			String timer1 =  countdownTime.get(1);
			
			String[] splitTime1 = timer1.split(":");
			
			String actualTimer1 = splitTime1[2];
			
			String timer2 =  countdownTime.get(0);
			
			String[] splitTime2 = timer2.split(":");
			
			String actualTimer2 = splitTime2[2];
			
			int finalTime1 = Integer.parseInt(actualTimer1);
			int finalTime2 = Integer.parseInt(actualTimer2);
			
			
			
			int difference = finalTime2 - finalTime1;
			
			//Assert on the countdown working
			Assert.assertEquals(difference, 1, "Assertion for countdown passed");
			Reporter.log("\nCountdown working!", true);
			
			
			
			
			
			
			//Assert the timer at 00:00:00 marking the end of the countdown
			
			Assert.assertEquals(finalTimer, "00:00:00","Countdown finished successfully");
			Reporter.log("\nCountdown finished successfully!", true);
			
			
			
			
		
	}

}
