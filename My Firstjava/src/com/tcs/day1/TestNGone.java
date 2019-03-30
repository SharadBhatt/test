package com.tcs.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGone {
	WebDriver driver;
	@Test
	public void Contactus() throws InterruptedException {
		
		
	  Thread.sleep(2000);
	  driver.get("https://www.toolsqa.com/automation-practice-form");
		driver.findElement(By.id("submit")).click();
		  
 }
  
		  @Test(dependsOnMethods={"f"})
		 public void Mousetest() throws InterruptedException {
			  
		driver.get("https://techcanvass.com/");
		Actions action =new Actions(driver);
		Thread.sleep(1000);
		WebElement ce=driver.findElement(By.linkText("Courses"));
		Thread.sleep(1000);
		action.moveToElement(ce).build().perform();
		Thread.sleep(1000);
		WebElement au=driver.findElement(By.linkText("Automation Testing Courses"));
		Thread.sleep(1000);
		action.moveToElement(au).build().perform();
		Thread.sleep(1000);
		WebElement se=driver.findElement(By.linkText("Selenium Training"));
		se.click();
		  }
		  @BeforeTest
		  public void beforeTest() {
			
			  System.setProperty("webdriver.chrome.driver","D:\\sharad\\chromedriver_win32\\chromedriver.exe" );
			  driver = new ChromeDriver();
				driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
				driver.manage().window().maximize();

		  }

		  @AfterTest
		  public void afterTest() {
			  driver.close();
			
		  }
}
