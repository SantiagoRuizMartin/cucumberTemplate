package com.mycucumber;


import cucumber.api.java8.En;


public class TemplateStepDefinitions implements En {
    public TemplateStepDefinitions() {
        Given("^the background is ready$", () -> {
            // Write code here that turns the phrase above into concrete actions
        });
        When("^The functionality is used$", () -> {
            // Write code here that turns the phrase above into concrete actions
        });
        Then("^The functionality should work$", () -> {
            // Write code here that turns the phrase above into concrete actions
        });
        Given("^the (.*) are ready$", (String Parameter) -> {
            // Write code here that turns the phrase above into concrete actions
        });
        And("^additional Step$", () -> {
            // Write code here that turns the phrase above into concrete actions
        });
    }
}
