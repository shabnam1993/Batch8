package com.java.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SoftwareCompanyName {
	
	@Parameters({"softwarecompany","elctronicscampany"})
	@Test
	public void testcase1(String name,String name1) {
		System.out.println(name);
		System.out.println(name1);
	}

}
