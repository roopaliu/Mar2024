package com.qa.opencart.base;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public DriverFactory df;
    public WebDriver driver;
    public LoginPage loginPage;


    @BeforeTest
    public void setup(){
        df.initDriver("Chrome");
        loginPage = new LoginPage(driver);
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
