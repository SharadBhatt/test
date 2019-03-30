package com.tcs.test;

import org.testng.annotations.Test;

import com.tcs.pages.ContactUsPage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.runner.notification.RunListener.ThreadSafe;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
	
public class FirstTestNG {
	WebDriver driver;

		 @Test
		 public void login(){
			 //ContactUsPage con = new ContactUsPage();
			 ContactUsPage con = PageFactory.initElements(driver,ContactUsPage.class);
					con.setusername(driver, "Sharad");
					con.setemail(driver,"Sharadbhatt@gmail.com");
					con.SetSelect(driver, "webenquiry");
					con.clickSave(driver);
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
