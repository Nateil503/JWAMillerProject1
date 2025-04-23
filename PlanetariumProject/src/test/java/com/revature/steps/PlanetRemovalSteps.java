package com.revature.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static com.revature.TestRunner.loginPage;
import static com.revature.TestRunner.registrationPage;

public class PlanetRemovalSteps {

    @When("the user clicks the register link")
    public void the_user_clicks_the_register_link() {
        loginPage.clickRegistrationLink();
    }
    @When("the user provides username {string} while registering")
    public void the_user_provides_username_while_registering(String username) {
        registrationPage.enterUsername(username);
    }
    @When("the user provides password {string} while registering")
    public void the_user_provides_password_while_registering(String password) {
        registrationPage.enterPassword(password);
    }

    @When("the user clicks the register button")
    public void the_user_clicks_the_register_button(){
        registrationPage.clickRegisterButton();
    }

}
