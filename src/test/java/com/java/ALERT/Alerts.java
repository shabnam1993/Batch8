package com.java.ALERT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");

//		Thread.sleep(5000);
		driver.findElement(By.id("alertButton")).click();
		//click ok button
//		driver.switchTo().alert().accept();
//		Thread.sleep(3000);
//		driver.switchTo().alert().sendKeys("12345");
//		driver.switchTo().alert().accept();
		
			Thread.sleep(4000)	;
			driver.close();

	}

}


    