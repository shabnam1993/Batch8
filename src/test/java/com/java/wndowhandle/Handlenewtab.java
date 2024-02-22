package com.java.wndowhandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlenewtab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
   String parentwindow = driver.getWindowHandle();
   System.out.println("parent window"  + parentwindow);
//		Thread.sleep(5000);
		driver.findElement(By.id("newTabBtn")).click();
	Set<String>	windowhandles= driver.getWindowHandles();
		for(String handle: windowhandles) {
			System.out.println("child window"  +handle);//here you will get 2 window parent & child
			if(!handle.equals(parentwindow)) {
				driver.switchTo().window(handle);
			
			driver.findElement(By.id("firstName")).sendKeys("shabnam");
			Thread.sleep(5000);
			driver.close();
		}
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("name")).sendKeys("pooja");
		
		Thread.sleep(4000);
//		driver.close();
		
	}

}
