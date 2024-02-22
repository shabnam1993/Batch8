package com.java.testng;

import org.testng.annotations.Test;

public class EnableDisablemethod {
	
	@Test
	public void mobilelogin() {
		System.out.println(" moblile login personal loan");
	}
	@Test
	public void weblogin() {
		System.out.println(" WEB login personal loan");
	}
	
	@Test(enabled = true)
	public void APIlogin() {
		System.out.println(" mAPI login personal loan");
	}
	

}
