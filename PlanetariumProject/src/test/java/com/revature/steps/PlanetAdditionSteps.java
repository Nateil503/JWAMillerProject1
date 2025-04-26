package com.revature.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

import static com.revature.TestRunner.*;

public class PlanetAdditionSteps {
    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        loginPage.goToLoginPage();
        loginPage.enterUsername("Batman");
        loginPage.enterPassword("Iamthenight1939");
        loginPage.clickLoginButton();
    }



    @When("the user selects {string} from the dropdown")
    public void the_user_selects_planet_from_the_dropdown(String type) {
        homePage.selectOptionFromDropdown(type);
    }

    @When("the user provides planet name {string}")
    public void the_user_provides_planet_name(String planetName) {
        homePage.enterPlanetName(planetName);
    }

    @When("the user clicks the submit button")
    public void the_user_clicks_the_submit_button() {
        homePage.clickSubmitButton();
    }

    public void waitForAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
    }

}
