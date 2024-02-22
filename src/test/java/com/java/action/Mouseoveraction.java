package com.java.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.ebay.in/");
		WebElement element = driver.findElement(By.linkText("Marketing & Promotion"));
		
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();//mouse over action
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		

	}

}
