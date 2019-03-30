package com.tcs.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.Select;
public class Medoplus {

	public static void main(String[] args) {



		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\sharad\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://medopsplus.techcanvass.co.in/");
		driver.findElement(By.id("txtUserName")).sendKeys("sharad");
		driver.findElement(By.id("txtPassword")).sendKeys("maddy123");
		driver.findElement(By.id("LoginButton")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("txtUserName")).clear();
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.name("txtUserName")).sendKeys("avinash");
		driver.findElement(By.name("txtPassword")).sendKeys("avinash");
		driver.findElement(By.id("LoginButton")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtBillNo")).sendKeys("1234");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFName")).sendKeys("Black");
		driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_txtLName']")).sendKeys("smith");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLName")).sendKeys("Smith");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtAge")).sendKeys("32");
		Select myselect = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddldoctorname")));
		//myselect.selectByIndex(3);
		//myselect.selectByVisibleText("Dr. Asiya");
		myselect.selectByValue("3");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtContactNo")).sendKeys("12457890");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtRefDoct")).sendKeys("Dr.Ramesh");
		Select bill = new Select(driver.findElement(By.name("ctl00$ContentPlaceHolder1$ddlBillType")));
		bill.selectByValue("4");
		//driver.findElement(By.xpath("//*[@id='ctl00_ContentPlaceHolder1_BtnSearch']")).click();
		//driver.switchTo().alert().accept();
		/*try {
			driver.findElement(By.name("ctl00_ContentPlaceHolder1_txtbiltotal")).sendKeys("2000");
		} catch (StaleElementReferenceException e) {
			System.out.println("exception");
			
		} */
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtbiltotal")).sendKeys("2000");
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtDiscountPer")).sendKeys("10");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtamntrecive")).sendKeys("3000");
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$B2")).click();

	}

}
