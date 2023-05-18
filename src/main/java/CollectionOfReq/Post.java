package CollectionOfReq;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post {
	@Test
	public void TC1() {
		// Base URL
		RestAssured.baseURI = "http://localhost:3000/";

		// To Get Details In Console
		Response Resp2 = given().contentType(ContentType.JSON).body("{\n" + "      \"id\": 8,\n"
				+ "      \"title\": \"working5\",\n" + "      \"author\": \"Java\"\n" + "    }").when().post("/posts");

		// Response code of Post Request
		assertEquals(Resp2.getStatusCode(), 201);

		// Send the request snd get the response
		Response Resp1 = given().get("/posts/8").then().extract().response();

		assertEquals(Resp1.getStatusCode(), 200);
		assertEquals(Resp1.jsonPath().getString("id"), "8");
		assertEquals(Resp1.jsonPath().getString("title"), "working5");
	}

}
