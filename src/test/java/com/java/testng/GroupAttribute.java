package com.java.testng;

import org.testng.annotations.Test;

public class GroupAttribute {
	@Test(groups = "software")
	public void infosys() {
		System.out.println("infosys");
	}
	
	
	@Test(groups = "software")
	public void vipro() {
		System.out.println("viprow");
	}

	@Test(groups = "automobile")
	public void Maruti() {
		System.out.println("maruti");
	}
	@Test(groups = "automobile")
	public void tata() {
		System.out.println("tata");
	}
}
