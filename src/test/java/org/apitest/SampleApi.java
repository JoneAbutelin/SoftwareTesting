package org.apitest;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.http.ContentType;

import java.util.HashMap;
import java.util.Map;

public class SampleApi {

	@Test
	public void getReq() {
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		ResponseBody body = response.body();
		System.out.println(body.asPrettyString());
	}

	@Test
	public void postReq() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("name", "John Doe");
		requestBody.put("salary", "50000");
		requestBody.put("age", "30");

		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(requestBody)
				.post("https://dummy.restapiexample.com/api/v1/create");

		ResponseBody body = response.body();
		System.out.println(body.asPrettyString());
	}

	@Test
	public void putReq() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("name", "John Updated");
		requestBody.put("salary", "60000");
		requestBody.put("age", "32");

		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
				.body(requestBody)
				.put("https://dummy.restapiexample.com/api/v1/update/21");

		ResponseBody body = response.body();
		System.out.println(body.asPrettyString());
	}

	@Test
	public void deleteReq() {
		Response response = RestAssured.delete("https://dummy.restapiexample.com/api/v1/delete/2");
		ResponseBody body = response.body();
		System.out.println(body.asPrettyString());
	}

}
