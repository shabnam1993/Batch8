package com.java.APIrestAssured03;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CURDoperation {
	
	@Test
 public void getmethod() {
	 
	 Response res =	RestAssured.get("https://reqres.in/api/users/2");
 System.out.println(res.asString());
System.out.println(res.getStatusCode());	 

System.out.println(res.getHeader("date"));	


System.out.println(res.getBody());
System.out.println(res.getTime());	 

 }
}
