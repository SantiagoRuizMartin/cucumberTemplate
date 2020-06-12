package com.mycucumber;

import cucumber.api.java8.En;
import org.testng.Assert;

public class JavaStepDefinitions implements En {
    public JavaStepDefinitions(MyKotlinLogic myKotlinLogic,
                               TemplateLogic javaTemplateLogic) {
        Given("^the background is ready$", () -> {
            myKotlinLogic.printAnything("this is my first test");
            Assert.assertTrue(true);
        });
        Given("^the (.*) are ready$", (String parameter) -> {
            myKotlinLogic.printAnything("this is my parameter " + parameter);
            Assert.assertTrue(true);
        });
        And("^additional Step$", () -> {
            myKotlinLogic.printAnything("this is my additional step");
            Assert.assertTrue(true);
        });
        When("^The functionality is used$", () -> {
            javaTemplateLogic.printMessageJava("The functionality was used using java");
            Assert.assertTrue(true);
        });
        Then("^The functionality should work$", () -> {
            javaTemplateLogic.printMessageJava("The functionality should work using java");
            Assert.assertTrue(true);
        });
    }
}
