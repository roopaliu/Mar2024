package com.qa.opencart.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TempTest {
    public static WebDriver driver;
    public static void main(String[] args){
//        System.setProperty("webdriver.chrome.driver", "/Users/roopali/Downloads/chromedriver_mac_arm64/chromedriver");
//        if (browsrName.equalsIgnoreCase("chrome")){
//        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://opencart.antropy.co.uk/index.php?route=account/login");
        String title = driver.getTitle();
    System.out.println(title);
    }
}
