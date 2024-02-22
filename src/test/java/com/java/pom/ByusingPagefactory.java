package com.java.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ByusingPagefactory {
	
	WebDriver driver ;
	ByusingPagefactory(WebDriver d){
		driver = d;
		PageFactory.initElements(driver,this);
	}
	
//	identified webelement by using findby annotations
	@FindBy(id="user-name")
WebElement username;
	
	@FindBy(id="password")
	WebElement pass;
	
	@FindBy(id="login-button")
	WebElement logbut;
	
	
//	created method to perform the action on webelement
	public void enterusername(String  uname) {
		username.sendKeys(uname);
	}
	
	
		
		public void enterpassword(String  passname) {
			pass.sendKeys(passname);
		}
		
		
		
		public void enterloginbutton() {
			logbut.click();;
			
			
	}
}
