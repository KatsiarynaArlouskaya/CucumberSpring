package com.epam.arlouskaya.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        glue = "com.epam.arlouskaya.runner",
        features ="src/test/resources/features/example.feature"
        )
public class RunTests {

}