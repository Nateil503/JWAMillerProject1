package com.revature.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
    Page Object Models are used to represent web pages (their elements and actions you intend to take)
    in class form. For a POM to be useful it needs at least three things:
    - a WebDriver to facilitate our actions
    - WebElements to provide consistent references to the elements in the DOM we want to interact with
    - Action methods to have consistent ways of interact with those elements
 */
public class WikiPage {

    // this will be our driver reference in the POM
    private WebDriver driver;

    private String url = "https://www.wikipedia.org/";

    /*
        We want these elements to be managed by the PageFactory so we can focus on writing our
        automation code without worrying about stale element references. To inform the PageFactory
        that the element needs to be managed and how to locate the element we can use the @FindBy
        annotation
     */
    @FindBy(id = "searchInput")
    private WebElement searchBar;

    @FindBy(className = "pure-button-primary-progressive")
    private WebElement searchButton;

    public WikiPage(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public void goToWikiHome(){
        driver.get(url);
    }

    public void enterSearchText(String input){
        searchBar.sendKeys(input);
    }

    public void clickSearchButton(){
        searchButton.click();
    }

}