package com.java.APIrestAssured;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Firstgetrequest {
//	https://reqres.in/api/users/2
	@Test
	void test1() {
		
	 Response res =	RestAssured.get("https://reqres.in/api/users/2");
		System.out.println(res.asString());
		System.out.println("get status code"  +res.getStatusCode());
	}
	}
 
