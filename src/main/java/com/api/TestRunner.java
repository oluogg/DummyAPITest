package com.api;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/api/feature",
        tags = {"@api" },
        plugin = { "pretty", "html:target/html", "json:target/cucumber.json" }
        )

// use this class to trigger all the tests
public class TestRunner {
}
