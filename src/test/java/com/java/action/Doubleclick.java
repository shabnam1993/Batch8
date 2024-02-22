package com.java.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
   WebElement button = driver.findElement(By.xpath("//button[contains(@id,'doubleClickBtn')]")) ;
  
   Actions act = new Actions(driver);
   act.doubleClick(button).perform();//perform double click action
   
   
   Thread.sleep(3000);
   
   driver.close();
   
	}
}
