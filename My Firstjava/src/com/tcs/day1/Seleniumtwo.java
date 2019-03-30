package com.tcs.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumtwo {
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/sharad/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://techcanvass.com/Contact-Techcanvass.aspx");
		
		driver.manage().window().maximize();
		//driver.findElement(By.id("txtName")).sendKeys("Sharad");
		driver.findElement(By.xpath("//*[@id='txtName']")).sendKeys("Sharad"); 
		driver.findElement(By.id("txtEmail")).sendKeys("Sharadbhatt@gmail.com");
		driver.findElement(By.id("txtContact")).sendKeys("9702757642");
		driver.findElement(By.id("txtMessage")).sendKeys("Hello");
 		Select myselect =new Select(driver.findElement(By.id("ddlSubject")));
		//myselect.selectByIndex(1);
		myselect.selectByValue("Webinar Enquiry");
		//myselect.selectByVisibleText("Webinar Enquiry");
		//driver.findElement(By.name("btnSubmit")).click();
		driver.findElement(By.xpath("//*[@id='btnSubmit']")).click();
		
	}

}
