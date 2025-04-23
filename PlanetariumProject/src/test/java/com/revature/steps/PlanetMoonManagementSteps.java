package com.revature.steps;

import io.cucumber.java.en.Given;
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
        Assert.assertTrue(homePage.arePlanetsVisible());
    }

    @When("the user moons are visible")
    public void the_user_moons_are_visible() {
        Assert.assertTrue(homePage.areMoonsVisible());
    }

    @When("the user provides planet name {string}")
    public void the_user_provides_planet_name(String planetID) {
        homePage.enterPlanetName(planetID);
    }

    @When("the user provides moon name {string}")
    public void the_user_provides_moon_name(String moonID) {
        homePage.enterMoonName(moonID);
    }

    @When("the user selects {string} from the planet dropdown")
    public void the_user_selects_from_the_planet_dropdown(String planetID) {
        homePage.selectPlanetFromDropdown(planetID);
    }
    @When("the user clicks the Manage button for the planet {string}")
    public void the_user_clicks_the_manage_button_for_the_planet(String planetID){
        homePage.clickManageButtonFor("planet", planetID);
}
    @When("the user clicks the Manage button for the moon {string}")
    public void the_user_clicks_the_manage_button_for_the_moon(String moonID){
        homePage.clickManageButtonFor("moon", moonID);
    }

    @When("the user attaches the moon {string} to the planet {string}")
    public void the_user_attaches_the_moon_to_the_moon(String moonID, String planetID) {
        homePage.attachMoonToPlanet(moonID, planetID);
    }

    @When("the user clicks the add button")
    public void the_user_clicks_the_add_button(){
        homePage.clickAddButton();
    }

    @When("the user clicks the remove button")
    public void the_user_clicks_the_remove_button(){
        homePage.clickRemoveButton();
    }
    @When("the user provides invalid file type")
    public void the_user_provides_invalid_file_type(){
        homePage.uploadFile(".GIF", ".TIFF", ".BMP");
    }
}
