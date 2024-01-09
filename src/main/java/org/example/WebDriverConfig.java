package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverConfig {
    public static WebDriver driver;
    private String url;

    public WebDriverConfig(String url) {
        this.url = url;
    }

    public static WebDriver getDriver(String browser){
        if (driver == null){
            initializeWebDriver(browser);
        }
        return driver;
    }
    public  void openUrl(){
        driver.manage().window().maximize();
        driver.get(url);
    }
    public static void initializeWebDriver(String browser){
        switch (browser.toLowerCase()) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Invalid browser name: " + browser);
        }
    }
}
