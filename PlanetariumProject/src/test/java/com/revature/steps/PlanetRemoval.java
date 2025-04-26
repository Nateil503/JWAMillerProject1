package com.revature.steps;

import io.cucumber.java.en.When;

import static com.revature.TestRunner.*;

public class PlanetRemoval {

    @When("the user clicks the delete button")
    public void the_user_clicks_the_delete_button(){
        homePage.clickDeleteButton();
    }

}
