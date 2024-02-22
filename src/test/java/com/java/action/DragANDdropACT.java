package com.java.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragANDdropACT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(3000);
//   WebElement source_element = driver.findElement(By.xpath("//div[contains(@id,'box6')]")) ;//rome
//   WebElement target_element  = driver.findElement(By.xpath("//div[contains(@id,'box106')]")) ;//italy

		WebElement source_element =   driver.findElement(By.id("box3"));
		WebElement target_element  =driver.findElement(By.id("box102"));
   Actions act = new Actions(driver);
   act.dragAndDrop(source_element,target_element ).perform();
   
   
//   Thread.sleep(3000);
   
//   driver.close();
   

	}

}
