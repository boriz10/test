package com.test.ws.restclient;

import com.test.common.dto.*;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.pages.PageObject;
import org.assertj.core.api.SoftAssertions;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class RestClient extends PageObject {

    private static final Logger LOG = LoggerFactory.getLogger(RestClient.class.getSimpleName());
    private static final String WEATHER_URL = System.getProperty("restclient.weather.url");
    private static final String CUSTOMER_URL = System.getProperty("restclient.customer.url");
    private static final String CONTENT_TYPE = "application/json";
    private static ResponseOptions<Response> response;
    private static RequestSpecification request;

    public RestClient() {
        RestAssured.replaceFiltersWith(ResponseLoggingFilter.responseLogger(), new RequestLoggingFilter());
    }

    public void getWeatherDetails(String city) {
        RestAssured.baseURI = WEATHER_URL;
        response = RestAssured.given().get("/"+city);

    }

    public void statusCodeVerification(int statusCode) {
        assertThat(response.getStatusCode()).as("wrong status code").isEqualTo(statusCode);
    }

    public void weatherResponseVerification(String value) {
        if (response.getStatusCode() == 200) {
            WeatherDTO responseBody = response.getBody().as(WeatherDTO.class);
            SoftAssertions assertions = new SoftAssertions();
            assertions.assertThat(responseBody.getCity()).isEqualTo(value);
            assertions.assertThat(responseBody.getHumidity()).isNotEmpty();
            assertions.assertThat(responseBody.getTemperature()).isNotEmpty();
            assertions.assertThat(responseBody.getWindDirectionDegree()).isNotEmpty();
            assertions.assertThat(responseBody.getWindSpeed()).isNotEmpty();
            assertions.assertThat(responseBody.getWeatherDescription()).isNotEmpty();
            assertions.assertAll();
        }
        else if (response.getStatusCode() == 400) {
            WeatherFaultResponseDTO responseBody = response.getBody().as(WeatherFaultResponseDTO.class);
            SoftAssertions assertions = new SoftAssertions();
            assertions.assertThat(responseBody.getFaultId()).isNotNull();
            assertions.assertThat(responseBody.getFault()).isEqualTo(value);
            assertions.assertAll();
        }
    }

    public void customerRegistration(String endpoint) {
        RestAssured.baseURI = CUSTOMER_URL;
        request = RestAssured.given();
        JSONObject requestParams = new JSONObject();
        requestParams.put("FirstName", "KJH");
        requestParams.put("LastName", "KJGCCD");
        requestParams.put("UserName", "khjgf");
        requestParams.put("Password", "865rgf");
        requestParams.put("Email", "khf@cfgh.jg");

        request.body(requestParams.toJSONString());
        response = request.post("/"+endpoint);

    }

    public void customerResponseVerification(String value) {
        if (response.getStatusCode() == 201) {
            RegistrationSuccesDTO responseBody = response.getBody().as(RegistrationSuccesDTO.class);
            SoftAssertions assertions = new SoftAssertions();
            assertions.assertThat(responseBody.getSuccessCode()).isNotNull();
            assertions.assertThat(responseBody.getMessage()).isEqualTo(value);
            assertions.assertAll();
        }
        else if (response.getStatusCode() == 200) {
            RegistrationFaultDTO responseBody = response.getBody().as(RegistrationFaultDTO.class);
            SoftAssertions assertions = new SoftAssertions();
            assertions.assertThat(responseBody.getFault()).isNotNull();
            assertions.assertThat(responseBody.getFaultId()).isEqualTo(value);
            assertions.assertAll();
        }
    }

}
