package com.globant.tdd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/acceptanceTest/resources/com/globant/tdd",
        glue="com.globant.tdd",
        format={"pretty","html://reports/test-report"})
public class CucumberRunner {

}
