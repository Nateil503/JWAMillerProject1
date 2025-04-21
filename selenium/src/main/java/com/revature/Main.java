package com.revature;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create the driver to perform browser automation. (Pre-version 4)
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.get("https://wikipedia.org/");
            /*
                In order to interact w/ the DOM and provide selenium with information
                you have to use a locator strategy. (Ways to identify one or more elements
                in the DOM
             */
            WebElement searchBar = driver.findElement(By.id("searchInput"));
            // checking the content of the element via text
            searchBar.sendKeys("puppy");
            WebElement searchButton = driver.findElement(By.className("pure-button-primary-progressive"));
            searchButton.click();
            System.out.println(driver.getTitle());
            driver.get("https://wikipedia.org/");
            searchBar.sendKeys("apple");
            searchButton.click();
            System.out.println(driver.getTitle());
            /*
            driver.findElement()
            driver.findElements()
            driver.getTitle()
             */

        } finally {
            // don't forget to quit the driver when finished

            if (driver != null) {
                driver.quit();
            }
        }
    }
}