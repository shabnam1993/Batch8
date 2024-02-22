package com.java.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
WebDriver driver;

Loginpage(WebDriver d) {
	
	driver= d;
}

By username = By.id("user-name");
By password = By.id("password");
By loginbutton = By.id("login-button");


public void enterusername(String  uname) {
	driver.findElement(username).sendKeys(uname);
}
public void enterpassword(String  passname) {
	driver.findElement(password).sendKeys(passname);
}
public void enterloginbutton() {
	driver.findElement(loginbutton).click();;
	
	
	
}
}