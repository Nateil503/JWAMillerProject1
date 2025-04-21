package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends ParentPOM {

    private WebDriverWait alertWait;

    @FindBy(id = "usernameInput")
    private WebElement usernameInput;
    @FindBy(id = "passwordInput")
    private WebElement passwordInput;
    @FindBy(xpath = "//input[4]")
    private WebElement loginButton;


    // note: make this a reference to your login page
    private String url = String.format("http://localhost:8080/", System.getenv("PLANETARIUM_URL"));

    public HomePage(WebDriver driver, String title) {
        super(driver, title);
    }


    public void goToHomePage() {
        driver.get(url);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInput.sendKeys(password);

    // can use this to validate we have returned to the login page after a successful registration

    public String getTitle() {
        return title;
    }

    }
}

