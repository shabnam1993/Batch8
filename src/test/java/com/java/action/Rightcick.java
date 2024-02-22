package com.java.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightcick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(2000);
   WebElement button = driver.findElement(By.xpath("//button[contains(@id,'rightClickBtn')]")) ;
  
   Actions act = new Actions(driver);
   act.contextClick(button).perform();//perform right click action
   
   
   Thread.sleep(5000);
   
   driver.close();
   
   
	}

}
