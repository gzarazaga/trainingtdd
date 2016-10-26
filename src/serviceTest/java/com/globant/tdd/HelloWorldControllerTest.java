package com.globant.tdd;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloWorldControllerTest {

    private static final String HELLO_JSON_TEMPLATE = "World";

    @Value("${local.server.port}")
    private int serverPort;

    @Before
    public void before() {
        RestAssured.port = serverPort;
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }


    @Test
    public void whenPostEndpointCalledWithValidNameThenReturnAcceptedStatusAndItSaysHello() {

        String subject = "World";

        given()
                .contentType(ContentType.JSON)
                .body(String.format(HELLO_JSON_TEMPLATE, subject))
        .when()
                .post("/hello")
        .then()
                .statusCode(HttpStatus.ACCEPTED.value())
                .body(equalTo("Hello, World"));

    }

}
