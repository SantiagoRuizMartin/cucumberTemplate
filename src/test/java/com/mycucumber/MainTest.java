package com.mycucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        plugin = {"pretty", "json:target/cucumber.json"},
        features = {"src/main/resources"},
        monochrome = true,
        glue = "com.mycucumber"
)
public class MainTest extends AbstractTestNGCucumberTests {
}
