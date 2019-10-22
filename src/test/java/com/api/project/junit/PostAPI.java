package com.api.project.junit;
import static io.restassured.RestAssured.given;
import org.junit.Test;
import com.api.project.models.Post;
import io.restassured.http.ContentType;

public class PostAPI 
{	
	@Test
	public void checkPostsAPI() 
	{
		Post post = new Post();
		post.setBody("helo welcom eto stockholm");
		post.setTitle("stockholm");
		post.setUserId("2");	
		
		given()
		.contentType(ContentType.JSON)
				.when()
				.body(post)
				.post("https://jsonplaceholder.typicode.com/posts")
				.then()
				.statusCode(201)
				.log()
				.all();
	
	}

}
