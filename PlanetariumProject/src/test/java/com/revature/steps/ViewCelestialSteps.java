package com.revature.steps;

import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.revature.TestRunner.homePage;

public class ViewCelestialSteps {
    @When("the user planets are visible")
    public void the_user_planets_are_visible() {
        Assert.assertTrue(homePage.arePlanetsAndMoonsVisible());
    }


    @When("the user moons are visible")
    public void the_user_moons_are_visible() {
        Assert.assertTrue(homePage.arePlanetsAndMoonsVisible());
    }
}
