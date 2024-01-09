package org.example;

import org.openqa.selenium.WebDriver;

public class MainTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver("chrome");
        LoginTest testLogin = new LoginTest(driver);

    }
}
