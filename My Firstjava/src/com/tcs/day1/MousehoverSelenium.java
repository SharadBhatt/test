package com.tcs.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/sharad/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://techcanvass.com/");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Actions action =new Actions(driver);
		//Thread.sleep(2000);
		WebElement ce=driver.findElement(By.linkText("Courses"));
		//Thread.sleep(2000);
		action.moveToElement(ce).build().perform();
		//Thread.sleep(2000);
		WebElement au=driver.findElement(By.linkText("Automation Testing Courses"));
		//Thread.sleep(2000);
		action.moveToElement(au).build().perform();
		//Thread.sleep(2000);
		WebElement se=driver.findElement(By.linkText("Selenium Training"));
		se.click();
		
		

	}

}
