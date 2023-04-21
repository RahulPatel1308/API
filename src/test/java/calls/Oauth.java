package calls;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Oauth {
	
	
	@Test
	public void accessvalidapi() {
		
		Response resp =RestAssured
		.given()
		.formParam("client_id", "RahulsApp")
		.formParam("client_secret","bfaa6c4f386d991497cf8c0267adc5f8")
		.formParam("grant_type", "client_credentials")
		.post("http://coop.apps.symfonycasts.com/token");
		
	//	System.out.println(resp.jsonPath().prettify());
		
		String Token = resp.jsonPath().get("access_token");
		
		Response resp1 =RestAssured.given().
		auth().
		oauth2(Token).
		post("http://coop.apps.symfonycasts.com/api/3698/chickens-feed");
		
	//  System.out.println("Code " + resp.getStatusCode());
		
		Assert.assertEquals(resp1.getStatusCode(),200);
			
	//	System.out.println("Code"+resp.getBody().asString()); 		
	}
	
	  @Test
      public void accessinvalidapi() {
		
		Response resp =RestAssured
		.given()
		.formParam("client_id", "RahulsApp")
		.formParam("client_secret","bfaa6c4f386d991497cf8c0267adc5f8")
		.formParam("grant_type", "client_credentials")
		.post("http://coop.apps.symfonycasts.com/token");
		
	//	System.out.println(resp.jsonPath().prettify());
		
		String Token = resp.jsonPath().get("access_token");
		
		Response resp1 =RestAssured.given().
		auth().
		oauth2(Token).
		post("http://coop.apps.symfonycasts.com/api/3698/eggs-collect");
		
	   System.out.println("Code"+resp.getBody().asString()); 
	  
	   System.out.println("Code " + resp.getStatusCode());
	   
	   Assert.assertEquals(resp1.getStatusCode(),200);
		
		
	}

}
