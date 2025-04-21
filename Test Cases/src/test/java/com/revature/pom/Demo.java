package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.revature.TestRunner.driver;

public class Demo {
    public static void main(String[] args) {
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            RegistrationPage registrationPage = new RegistrationPage(driver);
            registrationPage.goToRegistrationPage();
            registrationPage.enterUsername("<registrationusername>");
            registrationPage.enterPassword("<registrationpassword>");
            registrationPage.clickRegisterButton();
            System.out.println(driver.getTitle());
        } finally {
            if (driver != null) driver.quit();

        try {
                driver = new ChromeDriver();
            LoginPage loginPage = new LoginPage(driver);
            loginPage.goToLoginPage();
            loginPage.enterUsername("<registrationusername>");
            loginPage.enterPassword("<registrationpassword>");
            loginPage.clickLoginButton();
            System.out.println(driver.getTitle());
        } finally {
            if (driver != null) driver.quit();
        try {
                    driver = new ChromeDriver();
            HomePage homePage = new HomePage(driver);
            homePage.goToHomePage();
            homePage.enterUsername("<registrationusername>");
            homePage.enterPassword("<registrationpassword>");
            homePage.clickLoginButton();
            System.out.println(driver.getTitle());

        } finally {
            if (driver != null) driver.quit();
                }
            }
        }
    }
}