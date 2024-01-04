package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    private static WebDriver driver;
    public static WebDriver getDriver(String browser){
        if (driver == null){
            //initializeWebDriver(browser);
        }
        return driver;
    }

}
