package com.java.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	
		
		Thread.sleep(5000);
		
	String url =	driver.getCurrentUrl();
		System.out.println(url);
//		driver.navigate().back();
//		Thread.sleep(5000);
//		driver.navigate().forward();
//		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("shabnamamm@996");
		Thread.sleep(5000);
		dr
		
		driver.close();
	}

}
