package com.test.engine.ws.restclient;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestClient {

    private static final Logger LOG = LoggerFactory.getLogger(RestClient.class.getSimpleName());
    private static final String BASE_URL = System.getProperty("restclient.base.url");
    private static final String CONTENT_TYPE = "application/json";
    private static final String EMPTY = "";
    private static ResponseOptions<Response> response;

    public void getWeatherDetails() {
        RestAssured.baseURI = BASE_URL;
        RequestSpecification httpRequest = RestAssured.given();

    }

}
