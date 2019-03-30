package com.tcs.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myfirstselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","D:/sharad/chromedriver_win32 (3)/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	driver.close();
	
	}

}
