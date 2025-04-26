package com.revature.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.revature.TestRunner.driver;
import static com.revature.TestRunner.homePage;

public class MoonAdditionSteps {


    @When("the user provides moon name {string}")
    public void the_user_provides_moon_name(String moonName) {
        homePage.enterMoonName(moonName);
    }

    @And("the user provides valid Orbited Planet ID {string}")
    public void the_user_provides_valid_Orbited_Planet_ID(String planetID) {
        homePage.enterPlanetID(planetID);
    }


    @And("the user provides invalid Orbited Planet ID {string}")
    public void the_user_provides_invalid_Orbited_Planet_ID(String planetID) {
        homePage.enterPlanetID(planetID);
    }

    public void waitForAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
    }

}
