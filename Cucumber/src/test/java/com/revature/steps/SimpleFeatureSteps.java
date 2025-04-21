package com.revature.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleFeatureSteps {

    @Given("These statements are meant to explain the starting conditions for the Scenario")
    public void these_statements_are_meant_to_explain_the_starting_conditions_for_the_scenario() {
        System.out.println("This should set up some starting condition");
    }

    @When("These statements are meant to explain actions taken to complete the scenario")
    public void these_statements_are_meant_to_explain_actions_taken_to_complete_the_scenario() {
        System.out.println("Some action should be taken here");
    }

    @Then("These statements are meant to explain the expected outcome of the scenario")
    public void these_statements_are_meant_to_explain_the_expected_outcome_of_the_scenario() {
        System.out.println("Here we validate some expected outcome is achieved");
    }

    // these are the steps for the scenario that fails
    @When("These statements can be reused, but only if necessary")
    public void these_statements_can_be_reused_but_only_if_necessary() {
        System.out.println("this is a different when step");
    }

    @Then("These statements are meant to explain the expected outcome of the scenario, if the outcome is not achieved an exception is thrown")
    public void these_statements_are_meant_to_explain_the_expected_outcome_of_the_scenario_if_the_outcome_is_not_achieved_an_exception_is_thrown() {
        throw new RuntimeException("This exception fails the step and scenario");
    }
}

