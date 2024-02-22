package com.java.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderformethod {
	
	@DataProvider(name = "searchdataset")
	public Object[][] searchdata(){
	Object[][] searchkey = new Object[3][2];

	searchkey[0][0]="india";
	searchkey[0][1]="qutubminar";
	
	
	
	searchkey[1][0]="numbers";
	searchkey[1][1]	="12345";
			
	searchkey[2][0]="alphabates";
	searchkey[2][1]="abc";
	
	return searchkey;	
	}
	
	
	
	
	
	
	@Test(dataProvider ="searchdataset" )
	
	public void testcase1gogglesearch(String country,String monument) {
//	public void testgogglesearch() {
WebDriver driver = new ChromeDriver()	;
driver.manage().window().maximize();
driver.get("http://www.google.com");

WebElement seachbox= driver. findElement(By.className("gLFyf"));
seachbox.sendKeys("country" + "  "  + "monument");

driver.findElement(By.name("btnK")).submit();
}
}
