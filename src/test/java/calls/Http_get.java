package calls;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

public class Http_get {
	
	@Test
	public void httpget() {
		
		//Step 1 we will specify end point URL base url
		
		RestAssured.baseURI="https://reqres.in/";
		
		//Step2 Request object for type of request
		
		RequestSpecification httprequest=RestAssured.given();
		
		//Resposnse Create object
		
	 io.restassured.response.Response httpresponse=httprequest.request(Method.GET,"/api/users?page=2");
	 String response=httpresponse.getBody().asString();
	 System.out.println(response);
	 int code =httpresponse.getStatusCode();
	 System.out.println(code);
	 
	 //validate status code
	 Assert.assertEquals(code,200);
	 
	 //status line
	String statusline= httpresponse.getStatusLine();
	System.out.println(statusline);
	Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
	
}}
