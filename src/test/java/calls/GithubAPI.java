package calls;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class GithubAPI {
	
	
	String apitoken="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";
	String url= "https://api.github.com";
	
	@Test
	public void verifyrepo () {
		
		String getURL =url+ "/user/repos";
		
		 String resp = RestAssured.given().auth().oauth2(apitoken).get(getURL).asPrettyString();
		
		 System.out.println(resp);
		 
		 
		 
		
	}

}
