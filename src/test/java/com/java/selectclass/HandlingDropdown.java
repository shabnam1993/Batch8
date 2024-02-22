
package com.java.selectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");

//		Thread.sleep(5000);
	WebElement element =	driver.findElement(By.className("col-lg-3"));
		
		Select dropdown = new Select(element);
//		dropdown.selectByVisibleText("Google");
//		dropdown.selectByValue("Yahoo");
        dropdown.selectByIndex(3);
        if(dropdown.isMultiple()==true) {
        	System.out.println("dropdown is multiple");
        }else {
        	System.out.println("dropdown is not multiple");
        	
        }
        	List <WebElement> alldropdownoption = dropdown.getOptions();
        	System.out.println("total number of option: "+ alldropdownoption.size());
        	for(WebElement el:alldropdownoption) {
        		System.out.println(el.getText());
        	}
        
		Thread.sleep(4000);
		
		driver.close();
	}
}
