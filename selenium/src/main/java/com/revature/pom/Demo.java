package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {
        WebDriver driver = null;
        try{
            driver = new ChromeDriver();
            WikiPage wikiPage = new WikiPage(driver);
            wikiPage.goToWikiHome();
            wikiPage.enterSearchText("puppy");
            wikiPage.clickSearchButton();
            System.out.println(driver.getTitle());

            wikiPage.goToWikiHome();
            wikiPage.enterSearchText("apple");
            wikiPage.clickSearchButton();
            System.out.println(driver.getTitle());

        } finally {
            if(driver != null) driver.quit();
        }
    }

}