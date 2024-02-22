package com.java.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runconfigfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver  driver = new ChromeDriver();
		Propertiesclas prop = new Propertiesclas();
driver.get(prop.geturl());

driver.findElement(By.id("pass")).sendKeys(prop.getpassword());

driver.findElement(By.id("email")).sendKeys(prop.getusername());


	}

}
