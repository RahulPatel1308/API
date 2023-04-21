package calls;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Basicauth {
	
	@Test
	public void demo(){
		RestAssured.given().auth().preemptive().basic("postman","password").when().get("https://postman-echo.com/basic-auth").getStatusCode();
		
	}

}
