package com.revature.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.revature.TestRunner.*;

public class PlanetMoonManagementSteps {
    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        homePage.goToHomePage();
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
    public void the_user_provides_planet_name(String planetID) {
        homePage.enterPlanetName(planetID);
    }

    @When("the user provides moon name {string}")
    public void the_user_provides_moon_name(String moonID) {
        homePage.enterMoonName(moonID);
    }

    @When("the user selects {string} from the dropdown")
    public void the_user_selects_from_the_planet_dropdown(String type) {
        homePage.selectOptionFromDropdown(type);
    }

    @When("the user provides parent planet")
    public void the_user_provides_parent_planet(String planetID){
        homePage.enterPlanetID(planetID);
    }

    @When("the user clicks the submit {string} button")
    public void the_user_clicks_the_submit_button() {
        homePage.clickSubmitButton();
    }

    @When("the user clicks the delete button")
    public void the_user_clicks_the_delete_button(){
        homePage.clickDeleteButton();
    }
    @When("the user provides invalid {string}")
    public void the_user_provides_invalid(String filetype){
        homePage.uploadFile("invalid" + filetype);
    }
    @When("the user provides valid file type")
    public void the_user_provides_valid() {
        homePage.uploadFile("valid.png");
    }

    @And("the user provides valid Orbited Planet ID")
    public void theUserProvidesValidOrbitedPlanetID(String planetID) {
        homePage.enterPlanetID(planetID);
    }
}
