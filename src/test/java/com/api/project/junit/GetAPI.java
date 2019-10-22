package com.api.project.junit;

import org.junit.Test;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class GetAPI {
	
	@Test
	public void getJsonPlaceholder() {
		Response response = given()
			.when()
			.get("https://jsonplaceholder.typicode.com/posts");
		
		System.out.println(response.body().asString());	
		
		
	}
	
	@Test
	public void checkStatusCode() {
		given()
		.when()
		.get("https://jsonplaceholder.typicode.com/posts")
		.then()
		.statusCode(200);
	}

}
