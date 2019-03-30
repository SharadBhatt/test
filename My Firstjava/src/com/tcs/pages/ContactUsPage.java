package com.tcs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {
	
	@FindBy(xpath="//*[@id='txtName']")
	WebElement nameparambyxpath;
	
	@FindBy(id="txtEmail") 
	WebElement emailparambyid;
	//By nameparambyxpath =By.xpath("//*[@id='txtName']");
	//By emailparambyid = By.id("txtEmail");
	By clicksaveparambyid = By.id("//*[@id='btnSubmit']");
	By selectparambyid = By.id("ddlSubject");
	
	public void setusername(WebDriver driver, String name){
		nameparambyxpath.sendKeys(name); 
		
	}
	

	public void setemail(WebDriver d, String name){
		emailparambyid.sendKeys(name);
		
	}
	
	public void SetSelect(WebDriver d,String webenquiry){
		Select myselect =new Select(d.findElement(selectparambyid));
		myselect.selectByValue(webenquiry);
		
	}
	
	public void clickSave(WebDriver d){
		d.findElement(clicksaveparambyid).click();
		
		
	}
}
