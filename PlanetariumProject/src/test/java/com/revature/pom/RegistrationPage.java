package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class RegistrationPage extends ParentPOM{
    // Constructor ^^
    private WebDriverWait alertWait;

    @FindBy(id = "usernameInput")
    private WebElement usernameInput;
    @FindBy(id = "passwordInput")
    private WebElement passwordInput;
    @FindBy(xpath = "//input[3]")
    private WebElement registerButton;

    private String url = String.format("http://loginhost:8080/", System.getenv("PLANETARIUM_URL"));

    /*
    Make sure you have reference to your driver
    Make sure you have reference to your web elements
    Manage creating references to those elements (Facilitated by FindBy)
    Encapsulation to create the public methods
 */

    public RegistrationPage(WebDriver driver, String title) {
        super(driver, title);
        alertWait = new WebDriverWait(driver, Duration.ofSeconds(1));
    }

    public void enterUsername(String username){
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

    public String getTitle(){
        return title;
    }

    public void waitForAlert(){
        alertWait.until(ExpectedConditions.alertIsPresent());
    }

}
