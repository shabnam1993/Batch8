package com.java.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Actionperformonelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("123456");
		WebElement  password = driver.findElement(By.id("pass"));
		Actions act = new Actions(driver);
//		act.contextClick();
		act.moveToElement(password).build().perform();
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
