package com.globant.tdd;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

/**
 * Created by Gonzalo on 17/9/2016.
 */

public class TennisSteps {
    private RestTemplate restTemplate;

    @Before
    public void setup() throws IOException {
        restTemplate = new RestTemplate();
    }

    @Given("^I am on the 'home' page$")
    public void iAmOnTheHomePage() throws Throwable {
        //
    }
}
