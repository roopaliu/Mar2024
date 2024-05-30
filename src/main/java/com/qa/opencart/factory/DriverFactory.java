package com.qa.opencart.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {

    public WebDriver driver;
    public Properties prop;
    /**
     * This method will take care of browser initialization
     * @param browsrName
     * @return
     */


    public WebDriver initDriver(String browsrName){
        System.setProperty("webdriver.chrome.driver", "Users/roopali/Downloads/chromedriver_mac_arm64");
//        if (browsrName.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

//        else if (browsrName.equalsIgnoreCase("firefox")){
//            WebDriverManager.firefoxdriver().setup();
//            driver = new FirefoxDriver();
//        }
//        else if (browsrName.equalsIgnoreCase("safari")){
//            driver = new SafariDriver();
//        }
//        else
//            System.out.println("Give the right browser");

        driver.manage().deleteAllCookies();
        driver.manage().window().fullscreen();
        driver.get("");
        return driver;
    }

    /**
     * This method is used to initialise the properties based on environment
     * @return
     */

    public Properties initProp(){
    prop = new Properties();
        try {
            FileInputStream fileInputStream =  new FileInputStream("src/tests/resources/config/config.properties");
            prop.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }
}
