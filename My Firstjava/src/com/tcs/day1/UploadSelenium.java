package com.tcs.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/sharad/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/upload/");
		//driver.findElements(By.id("upload;
		driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Public\\Documents\\Sharad\\selenium.txt");
		driver.findElement(By.id("terms")).click();
	}

}
	