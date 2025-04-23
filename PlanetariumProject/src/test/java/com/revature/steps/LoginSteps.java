package com.revature.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import static com.revature.TestRunner.*;

public class LoginSteps {

    @When("the user provides username {string} while logging in")
    public void the_user_provides_username(String username) {
        loginPage.enterUsername(username);
    }

    @When("the user provides password {string} while logging in")
    public void the_user_provides_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        loginPage.clickLoginButton();
    }

    @And("the user should be redirected to the home page.")
    public void the_user_should_be_redirected_to_the_home_page() {
        Assert.assertEquals(homePage.getTitle(), driver.getTitle());
    }

    @Then("the user should remain on the login page")
    public void the_user_should_remain_on_the_login_page() {
        Assert.assertEquals(loginPage.getTitle(), driver.getTitle());
    }

    @Then("a personalized greeting should appear saying {string}")
    public void a_personalized_greeting_should_appear_saying(String expectedMessage) {
        registrationPage.waitForAlert();
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        alert.accept();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
