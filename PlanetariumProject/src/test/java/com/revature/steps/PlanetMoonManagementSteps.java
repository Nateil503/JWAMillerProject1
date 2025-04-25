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

public class PlanetMoonManagementSteps {
    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        loginPage.goToLoginPage();
        loginPage.enterUsername("Batman");
        loginPage.enterPassword("Iamthenight1939");
        loginPage.clickLoginButton();
    }

    @When("the user planets are visible")
    public void the_user_planets_are_visible() {
        Assert.assertTrue(homePage.arePlanetsAndMoonsVisible());
    }

    @When("the user moons are visible")
    public void the_user_moons_are_visible() {
        Assert.assertTrue(homePage.arePlanetsAndMoonsVisible());
    }

    @When("the user provides planet name {string}")
    public void the_user_provides_planet_name(String planetName) {
        homePage.enterPlanetName(planetName);
    }

    @When("the user provides moon name {string}")
    public void the_user_provides_moon_name(String moonName) {
        homePage.enterMoonName(moonName);
    }

    @When("the user selects {string} from the dropdown")
    public void the_user_selects_string_from_the_planet_dropdown(String type) {
        homePage.selectOptionFromDropdown(type);
    }


    @When("the user clicks the submit button")
    public void the_user_clicks_the_submit_button() {
        homePage.clickSubmitButton();
    }

    @When("the user clicks the delete button")
    public void the_user_clicks_the_delete_button(){
        homePage.clickDeleteButton();
    }
    @When("the user uploads invalid {string}")
    public void the_user_uploads_invalid(String filetype){
        String filePath = System.getProperty("user.dir") + "/src/test/resources/test_images/" + filetype;

        File file = new File(filePath);
        if (!file.exists()) {
            throw new IllegalArgumentException("File not found: " + filePath);
        }

    }

    @And("the user provides valid Orbited Planet ID {string}")
    public void theUserProvidesValidOrbitedPlanetID(String planetID) {
        homePage.enterPlanetID(planetID);
    }

}
