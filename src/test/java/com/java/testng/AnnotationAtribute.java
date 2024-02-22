package com.java.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationAtribute {
	
	@Test(dependsOnMethods = {"testcase2"})
//    @Test(priority = 1)
//	@Test(description = "this is the testcase")
	public void testcase1() {
		
		System.out.println("mobile login testcases");
	}
	
	
//@Test(priority = -1)
//@Test(description = "this is testcase2")
	

	//	@Test(timeOut = 200)//here we mention time limit 200ms but in this we thread.sleep for 400ms then it takes longer time to excute then it wil fail testcase & excute next 

	
	
	@Test
	public void testcase2()  {
//		Thread.sleep(400);
		System.out.println("web login testcases");
		Assert.assertTrue(false);
	}

//@Test(priority = 3)// if priority not mention then it wii consider as 0 then it will excute first
//@Test
public void testcase3() {
	
	System.out.println("api login testcases");
}
}


