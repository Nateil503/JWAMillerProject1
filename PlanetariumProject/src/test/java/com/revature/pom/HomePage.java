package com.revature.pom;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.revature.TestRunner.*;

public class HomePage extends ParentPOM {

    private WebDriverWait alertWait;

    @FindBy(id = "planetNameInput")
    private WebElement planetInput;
    @FindBy(id = "planetImageInput")
    private WebElement planetImageInput;
    @FindBy(id = "moonImageInput")
    private WebElement moonImageInput;
    @FindBy(id = "moonNameInput")
    private WebElement moonInput;
    @FindBy(id = "orbitedPlanetInput")
    private WebElement parentPlanet;

    @FindBy(xpath = "//table[@id='celestialTable']")
    private WebElement celestialTable;
    @FindBy(id = "locationSelect")
    private WebElement optionDropdown;
    @FindBy(id = "attach-button")
    private WebElement attachButton;
    @FindBy(className = "submit-button")
    private WebElement submitButton;
    @FindBy(id = "deleteButton")
    private WebElement deleteButton;
    @FindBy(id = "greeting")
    private WebElement greeting;


    // note: make this a reference to your login page
    private String url = String.format("http://localhost:8080/", System.getenv("PLANETARIUM_URL"));

    public HomePage(WebDriver driver, String title) {
        super(driver, title);
        alertWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver, this);
    }

    public void selectOptionFromDropdown(String type) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("locationSelect")));
        wait.until(ExpectedConditions.visibilityOf(optionDropdown));
        wait.until(ExpectedConditions.elementToBeClickable(optionDropdown));

        Select dropdown = new Select(optionDropdown);
        dropdown.selectByVisibleText(type);
    }

    public void goToHomePage() {
        driver.get(url);
    }

    public String getGreetingText() {
        return greeting.getText();

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

    public void clickDeleteButton() {
        deleteButton.click();
    }
    // can use this to validate we have returned to the login page after a successful registration

    public String getTitle() {
        return title;
    }

    public boolean arePlanetsAndMoonsVisible() {
        try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(celestialTable));

        if (celestialTable.isDisplayed()) {
            System.out.println("Celestial table is visible.");
            return true;
        } else {
            System.out.println("Celestial table is not visible, potential defect.");
            return false;
        }
    }catch (TimeoutException | NoSuchElementException e){
                System.out.println("Celestial table not visible:" + e.getMessage());
                return false;
            }

    }

        public void uploadFile (String file){
            if (!(file.endsWith(".png") || file.endsWith(".jpeg"))) {
                throw new IllegalArgumentException("Invalid file type: " + file);
            }
            Select dropdown = new Select(optionDropdown);
            String selected = dropdown.getFirstSelectedOption().getText().toLowerCase();

            if (selected.contains("planet")) {
                planetImageInput.sendKeys(file);
            } else if (selected.contains("moon")) {
                moonImageInput.sendKeys(file);
            }
        }

        public void enterPlanetID (String planetID){
            parentPlanet.clear();
            parentPlanet.sendKeys(planetID);
        }

    public void waitForAlert() {
        alertWait.until(ExpectedConditions.alertIsPresent());

    }
}


