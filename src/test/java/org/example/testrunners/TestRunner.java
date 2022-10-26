package org.example.testrunners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"org.example"},
        plugin = "pretty",
        monochrome = true,
        tags = "@SmokeTest"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
