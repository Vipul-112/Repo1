package CollectionOfReq;

import static org.testng.Assert.assertEquals;

import java.util.Random;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Delete {
	public static String title = GetRandomStr();
	
	@Test
	public void TC1()
	{
		//creation
		
		RestAssured.baseURI = "http://localhost:3000/";
		Response Resp1 = given().contentType(ContentType.JSON).body("{ \n"
				+ "\"title\": \"" + "\",\n"
				+ "      \"author\": \"Ritali\"\n"
				+ "    }").post("/posts");
		
		//DISPLAY
		given().get("/posts").then().log().all();
		assertEquals(Resp1.getStatusCode(), 201);
		
		String NewDataAdded = Resp1.jsonPath().getString("id");
		
		//DELETION
		Response RespOfDelereq = given().delete("/posts/" + NewDataAdded + "");
				
				//verify 
				assertEquals(RespOfDelereq.getStatusCode(), 200);
		System.out.println("stsus code after deletion : " + RespOfDelereq.statusCode());
	}
		
		//code to generate random variable
		public static String GetRandomStr()
		{
			Random random = new Random();
			String NewTitle = "New_" + random.nextInt();
			return NewTitle;
			
		}
	

}

