package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredApiTest {
	@Test
	public void getUsers() {
		RestAssured.baseURI = "https://gorest.co.in/public/v2/users/";
		RequestSpecification httpRequest = RestAssured.given().relaxedHTTPSValidation();
		Response res = httpRequest.request(Method.GET, "");
		System.out.println(res.getStatusLine());// to print the whole status line
		System.out.println(res.getStatusCode());// to print the status code
		System.out.println(res.prettyPrint());

		int StatCode = res.getStatusCode();
		assertEquals(200, StatCode);// output:PASSED: test.RestAssuredApiTest.getUsers
	}
}
