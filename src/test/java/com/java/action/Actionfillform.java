package com.java.action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import groovyjarjarantlr4.v4.codegen.model.Action;

public class Actionfillform {
 
 public static void main(String[] args) {
	

 WebDriver driver  = new ChromeDriver();
  driver.get("https://www.saucedemo.com/");   
// driver.findElement(By.id("user-name")).sendKeys("standard_user");
// driver.findElement(By.id("password")).sendKeys("secret_sauce");
// 
// driver.findElement(By.id("login-button")).click();
// 
  Actions action = new Actions(driver);
  Action   seriesofaction = action.moveToElement(driver.findElement(By.id("user-name"))).click().sendKeys("user-name", Keys.TAB).sendKeys("secret_sauce", Keys.ENTER).build();
  
  seriesofaction.perform();
}
}