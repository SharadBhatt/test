package com.tcs.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/sharad/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		Thread.sleep(2000);
		driver.switchTo().frame("a077aa5e");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/a/img")).click();
	}

}
