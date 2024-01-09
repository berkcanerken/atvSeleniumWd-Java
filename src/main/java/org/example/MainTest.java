package org.example;

import org.openqa.selenium.WebDriver;

public class MainTest {
    public static String urlBase = "https://www.saucedemo.com";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver("chrome");
        WebDriverConfig config = new WebDriverConfig(urlBase);
        LoginTest testLogin = new LoginTest(driver);

        //Abrindo Site
        config.openUrl();
        //Teste de login
        testLogin.login("standard_user", "secret_sauce");
    }
}
