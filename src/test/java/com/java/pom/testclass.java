package com.java.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://www.saucedemo.com");
//	Loginpage obj = new Loginpage(driver);

	ByusingPagefactory obj2 = new  ByusingPagefactory(driver);
	obj2.enterloginbutton();
	obj2.enterpassword("secret_sauce");
	obj2.enterusername("standard_user");
	obj2.enterloginbutton();
	
	
//	ByusingPagefactory obj2 = new  ByusingPagefactory(driver);
//	
//	
//	obj2.enterusername("standard_user");
//	
//	obj2.enterpassword("secret_sauce");
//	
//	obj2.enterloginbutton();
}
}
