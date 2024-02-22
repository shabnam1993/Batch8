package com.java.takescreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshotfullpage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		capture full page screenshot
//		step 1 - convert webdriver objct to takescreenshot interface
		
		TakesScreenshot  screenshot = (TakesScreenshot)driver;
//	step 2	
	File scr =	screenshot.getScreenshotAs(OutputType.FILE);//returns file
	
	File dest = new File("C:\\Users\\800xAInstaller\\eclipse-workspace\\Dependancy\\target\\fullpage.png");
//	step 3
	
	FileUtils.copyFile(scr, dest);
		
		
		
		
		
   
	}

}
