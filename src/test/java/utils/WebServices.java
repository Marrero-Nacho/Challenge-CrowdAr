package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class WebServices {
    public Response getRequest(String endpoint) {
        return RestAssured.get(endpoint);
    }
}
