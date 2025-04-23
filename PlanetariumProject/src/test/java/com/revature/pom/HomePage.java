package com.revature.pom;

import io.cucumber.java.mk_latn.No;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v133.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class HomePage extends ParentPOM {

    private WebDriverWait alertWait;

    @FindBy(id = "planetNameInput")
    private WebElement planetInput;
    @FindBy(id = "moonNameInput")
    private WebElement moonInput;
    @FindBy(id = "orbitedPlanetInput")
    private WebElement parentPlanet;
    @FindBy(tagName = "<tr>")
    private WebElement planetContainer;
    @FindBy(id = "moon-container")
    private WebElement moonContainer;
    @FindBy(id = "locationSelect")
    private WebElement optionDropdown;
    @FindBy(id = "attach-button")
    private WebElement attachButton;
    @FindBy(id = "SubmitButton")
    private WebElement submitButton;
    @FindBy(id = "delete-button")
    private WebElement deleteButton;
    @FindBy(id = "file-upload")
    private WebElement fileUploadInput;


    // note: make this a reference to your login page
    private String url = String.format("http://localhost:8080/", System.getenv("PLANETARIUM_URL"));

    public HomePage(WebDriver driver, String title) {
        super(driver, title);
        alertWait = new WebDriverWait(driver, Duration.ofSeconds(1));
        PageFactory.initElements(driver, this);
    }

    public void selectOptionFromDropdown(String type) {
        Select dropdown = new Select(optionDropdown);
        dropdown.selectByVisibleText(type);
    }

    public void goToHomePage() {
        driver.get(url);
    }

    public void enterPlanetName(String planetName) {
        planetInput.clear();
        planetInput.sendKeys(planetName);
    }

    public void enterMoonName(String moonName) {
        moonInput.clear();
        moonInput.sendKeys(moonName);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void clickDeleteButton(){
        deleteButton.click();
    }
    // can use this to validate we have returned to the login page after a successful registration

    public String getTitle() {
        return title;
    }

    public void setMoonContainer(WebElement moonContainer) {
        this.moonContainer = moonContainer;
    }

    public void setPlanetContainer(WebElement planetContainer) {
        this.planetContainer = planetContainer;
    }

    public boolean arePlanetsVisible() {
        return planetContainer.isDisplayed();
    }

    public boolean areMoonsVisible() {
        return moonContainer.isDisplayed();
    }


    public void uploadFile(String filePath) {
        fileUploadInput.sendKeys(filePath);
    }

    public void enterPlanetID(String planetID) {
    }
}


