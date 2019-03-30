package com.tcs.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/sharad/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://lms.techcanvass.co.in/");
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		WebElement namelink=(WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtLoginid")));
		namelink.sendKeys("Sharad");
		//driver.findElement(By.id("txtLoginid")).sendKeys("Sharad"); 
		driver.findElement(By.id("txtpassword")).sendKeys("evn123");
		driver.findElement(By.id("btnLogin")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtLoginid")).clear();
		driver.findElement(By.id("txtpassword")).clear();
	}
}