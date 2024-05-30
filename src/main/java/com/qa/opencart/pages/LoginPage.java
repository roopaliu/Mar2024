package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

//    private By locators
    private By emailId = By.id("");
    private By password = By.id("");
    private By loginBtn = By.id("");
    private By forgotPswd = By.id("");

//    public page constatnt
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

//    public page actions


    public String getPageTitle(){
        return driver.getTitle();
    }

    public String getLoginPageUrl(){
        return driver.getCurrentUrl();
    }

    public boolean isFgtPswdLinkExist(){
      return  driver.findElement(forgotPswd).isDisplayed();
    }

    public void doLogin(String un, String pwd){

    }
}
