package com.qa.opencart.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.qa.opencart.factory.TempTest.driver;

public class ElementUtils {

    private WebDriver driver;

    public ElementUtils(WebDriver driver) {
        this.driver = driver;
    }

    public By getBy(String locatorType, String locatorValue){
        By locator = null;
        switch (locatorType.toLowerCase()){
            case "id"-> locator = By.id(locatorValue);
            case "name"-> locator = By.name(locatorValue);
            case "tagname"-> locator = By.tagName(locatorValue);
            case "xpath" -> locator = By.xpath(locatorValue);
            case "linktext"-> locator = By.linkText(locatorValue);
            case "partiallinktext"-> locator = By.partialLinkText(locatorValue);
            case "css" -> locator = By.cssSelector(locatorValue);
            case "classname" -> locator = By.className(locatorValue);
            default -> System.out.println("case not found");

        }
        return locator;
    }
    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }

    public String doElementGetText(By locator){
       return getElement(locator).getText();
    }

    public  void doSendKeys(By locator, String value){
        driver.findElement(locator).sendKeys(value);
    }


    public void doClick(By locator){
        getElement(locator).click();
    }
    public String getPageTitle() {
        return driver.getTitle();
    }


    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public void closeBrowser() {
        driver.close();
    }

    public void quitBrowser() {
        driver.quit();
    }


}
