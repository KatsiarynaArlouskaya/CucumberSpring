package com.epam.arlouskaya.runner;


import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;

import java.io.IOException;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/*
 * Helper class to provide Cucumber JVM configuration:
 * -how to run feature with TestNG
 */
@Test(groups = "cucumber")
@CucumberOptions(
        format = {"pretty", "html:target/cucumber"},
        dryRun=false,
        features ="src/test/resources/features/",
     //   glue ="scr/test/java/com/epam/arlouskaya/steps/",
        tags="@RunMe")
public class RunTests extends AbstractTestNGCucumberTests {

    @Test(groups = "cucumber", description = "Runs Cucumber Features")
    public void run_cukes () throws IOException {

        new TestNGCucumberRunner(getClass()).runCukes();
    }
}