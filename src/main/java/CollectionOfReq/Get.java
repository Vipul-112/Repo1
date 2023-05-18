package CollectionOfReq;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class Get {

	@Test
	public void TC1()
	{
//		//Base URL
//	    RestAssured.baseURI = "http://localhost:3000/";
//	    
//	    //To Get Details In Console
//	    given().get("/posts/2").then().statusCode(200).log().all();
//	    
//	    //Send the request snd get the response
//	   Response Resp = given().get("/posts/2").then().statusCode(200).extract().response();
//	    
//	    assertEquals(Resp.getStatusCode(), 200);
//	    assertEquals(Resp.jsonPath().getString("id"),"2");
//	    assertEquals(Resp.jsonPath().getString("title"),"Wipro Work");
	    
	}

	
	
}
