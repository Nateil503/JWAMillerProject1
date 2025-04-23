package com.revature.steps;

import static com.revature.TestRunner.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class RegistrationSteps {

    /*
        ########## Shared Steps ##########
     */
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.goToLoginPage();
    }
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

    /*
        Note the step syntax below does not match 100% with what we have written in the Feature file.
        Cucumber is able to pass data to our glue methods at runtime, which can simplify the steps we
        write and reduce the number of overall associated methods we need to implement
     */
    @Then("an alert should appear saying {string}")
    public void an_alert_should_appear_saying(String expectedMessage) {
        registrationPage.waitForAlert();
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        alert.accept();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    /*
        ########## Happy Path Steps ##########
     */


    @And("the user should be redirected to the login page.")
    public void the_user_should_be_redirected_to_the_login_page() {
        Assert.assertEquals(loginPage.getTitle(),driver.getTitle());
    }

    /*
        ########## Sad Path Steps ##########
     */

    @Then("the user should remain on the registration page")
    public void the_user_should_remain_on_the_register_page() {
        Assert.assertEquals(registrationPage.getTitle(),driver.getTitle());
    }
    @When("the user clicks on the register link")
    public void the_user_clicks_on_the_register_link() {
        loginPage.clickRegistrationLink();

    }
    @When("the user provides {string} while registering")
    public void the_user_provides_while_registering(String username) {
        // Write code here that turns the phrase above into concrete actions
        registrationPage.enterUsername(username);
    }
    @When("the user provides password {string}")
    public void the_user_provides_password(String password) {
        registrationPage.enterPassword(password);
    }


}
