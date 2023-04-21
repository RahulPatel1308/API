package calls;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BearerToken {
	
	@Test
	public void bearerTokenAuthenticationTest() {
		
		
		int code=RestAssured.
		given().auth().preemptive().basic("rahulpatel0813@gmail.com", "Rahul@130894").get("https://github.com/login").getStatusCode();
		
		System.out.println("Response code from server" + code);

		
	/*	RestAssured.baseURI = "https://api.github.com/repos/";
		
		RequestSpecification request = RestAssured.given();
		
		String payload = "{\r\n" + 
				"  \"userName\": \"rahulpatel0813@gmail.com\",\r\n" + 
				"  \"password\": \"Rahul@130894\"\r\n" +
						""+"}";
		
		request.header("Content-Type","application/json");
		
		Response responseFromGenerateToken =request.body(payload).post("/Account/v1/GenerateToken");
		
		responseFromGenerateToken.prettyPrint();
		
		String jsonString = responseFromGenerateToken.getBody().asString();
		
		String tokenGenerated = JsonPath.from(jsonString).get("token");
		
		request.header("Authorization","Bearer "+tokenGenerated)
				.header("Content-Type","application/json");
		
		String addBookDetails = "{\r\n" + 
				"  \"userId\": \"a178a104-e3c0-4f50-bbd5-3e4919f063e8\",\r\n" + 
				"  \"collectionOfIsbns\": [\r\n" + 
				"    {\r\n" + 
				"      \"isbn\": \"9781449325862\"\r\n" + 
				"    }\r\n" + 
				"  ]\r\n" + 
				"}";
		
	    Response repositery =request.body(addBookDetails).get("repos/{{RahulPatel1308}}/{{My-projects}}");
		
		Assert.assertEquals(200, repositery.getStatusCode());
		
		repositery.prettyPrint();  */
		
				
	}
	}
