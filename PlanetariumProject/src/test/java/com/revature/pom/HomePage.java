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

import java.time.Duration;

public class HomePage extends ParentPOM {

    private WebDriverWait alertWait;

    @FindBy(id = "planetInput")
    private WebElement planetInput;
    @FindBy(id = "moonInput")
    private WebElement moonInput;
    @FindBy(id = "planet-container")
    private WebElement planetContainer;
    @FindBy(id = "moon-container")
    private WebElement moonContainer;
    @FindBy(id = "planet-selector")
    private WebElement planetDropdown;
    @FindBy(id = "attach-button")
    private WebElement attachButton;
    @FindBy(id = "add-button")
    private WebElement addButton;
    @FindBy(id = "manage-button")
    private WebElement manageButton;
    @FindBy(id = "remove-button")
    private WebElement removeButton;
    @FindBy(id = "file-upload")
    private WebElement fileUploadInput;


    // note: make this a reference to your login page
    private String url = String.format("http://localhost:8080/", System.getenv("PLANETARIUM_URL"));

    public HomePage(WebDriver driver, String title) {
        super(driver, title);
        alertWait = new WebDriverWait(driver, Duration.ofSeconds(1));
        PageFactory.initElements(driver, this);
    }

    public void attachMoonToPlanet(String moonName, String planetName) {
        Select selectPlanet = new Select(planetDropdown);
        selectPlanet.selectByVisibleText(planetName);
        moonInput.clear();
        moonInput.sendKeys(moonName);
        attachButton.click();
    }

    public void selectPlanetFromDropdown(String planetName) {
        Select dropdown = new Select(planetDropdown);
        dropdown.selectByVisibleText(planetName);
    }

    public void goToHomePage() {
        driver.get(url);
    }

    public void enterPlanetName(String planetID) {
        planetInput.clear();
        planetInput.sendKeys(planetID);
    }

    public void enterMoonName(String moonID) {
        moonInput.clear();
        moonInput.sendKeys(moonID);
    }

    public void clickAddButton() {
        addButton.click();
    }
    
    public void clickRemoveButton(){
        removeButton.click();
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

    public void clickManageButtonFor(String type, String name){
        String xpath = String.format( "//div[contains(@class, '%s') and @data-name='%s']//button[contains(@class, 'manage-btn')]",
                type.toLowerCase(), name);
        try{
            WebElement manageButton = driver.findElement(By.xpath(xpath));
            manageButton.click();
        } catch (NoSuchElementException e) {
            throw new RuntimeException("Manage button not found for " + type + "'" + name + "'");
        }
}

    public void uploadFile(String s, String s1, String s2) {
    }
}


