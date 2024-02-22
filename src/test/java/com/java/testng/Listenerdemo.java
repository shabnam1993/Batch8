package com.java.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.java.testng.Listenerclass.class)
public class Listenerdemo {
	@Test
	public void login() {
		System.out.println("loginpage");
		Reporter.log("login method");
	Assert.assertTrue(true);
	Reporter.log("assert true & testcase pass");
	
	}
	
	
	
	@Test
	public void fail() {
	System.out.println("loginfail");
	
	Assert.assertTrue(false);
		
		
	}
}