package com.java.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngDemo {
	
	@Test
	public void verifypagetitle() {
//		launch chrome browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	String actualtitle =driver.getTitle();
	System.out.println(actualtitle);
    String expectedtitle = "Window Handles Practice - H Y R Tutorials";
//    for verification we use Assert class
    Assert.assertEquals(actualtitle, expectedtitle);
    
    driver.quit();
    		
	}	
		
		
		
	

}
