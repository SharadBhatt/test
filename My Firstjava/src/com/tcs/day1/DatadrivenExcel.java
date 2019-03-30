package com.tcs.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatadrivenExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/sharad/chromedriver_win32/chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://lms.techcanvass.co.in/");
		FileInputStream fs= new FileInputStream("C:\\Users\\Public\\Documents\\Sharad\\datadriven.xls");
		HSSFWorkbook xw = new HSSFWorkbook(fs);
		HSSFSheet xs = xw.getSheetAt(0);
		for(int i=1; i<=xs.getLastRowNum();i++){
			int j=1;
			HSSFCell id,password;
			id=xs.getRow(i).getCell(j);
			password=xs.getRow(i).getCell(j+1);
			System.out.println(id.toString());
			System.out.println(password.toString());
			driver.findElement(By.id("txtLoginid")).sendKeys(id.toString());; 
			driver.findElement(By.id("txtpassword")).sendKeys(password.toString());;
			driver.findElement(By.id("btnLogin")).click();
			driver.switchTo().alert().accept();
			driver.findElement(By.id("txtLoginid")).clear();
			driver.findElement(By.id("txtpassword")).clear();
			
		}
	}

}
