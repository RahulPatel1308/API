package calls;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HTTP_post {
 
	@Test
	public void post_request() {
		
		//Step 1 we will specify end point URL base url
		
				RestAssured.baseURI="https://reqres.in";
				
				//Step2 Request object for type of request
				
				RequestSpecification httprequest=RestAssured.given();
				
				// step 3 Resposnse Create object 
				// create pay load
				// we need to create json object
				
				JSONObject RequestEntity =new JSONObject();
				RequestEntity.put("name", "morpheus");
				RequestEntity.put("job", "zion residen");
		
				//specify format 
				httprequest.header("Content.Type","application/json");
				
				//values in payload will be converted into json format
				
				httprequest.body(RequestEntity.toString());
				Response httpresponse=httprequest.request(Method.POST,"/api/users/2");
				String response=httpresponse.getBody().asString();
				System.out.println(response);
			    int code =	httpresponse.getStatusCode();
				System.out.println(code);
				Assert.assertEquals(code,201);
				
				//status line
				String statusline= httpresponse.getStatusLine();
				System.out.println(statusline);
				Assert.assertEquals(statusline, "HTTP/1.1 201 Created");
	}
}
