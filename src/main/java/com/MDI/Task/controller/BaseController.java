package com.MDI.Task.controller;

import com.MDI.Task.utilities.Constants;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseController {

	public static RequestSpecification createRequest() {
		return new RequestSpecBuilder().setBaseUri(Constants.APPLICATION_HOST).build();
	}
}
