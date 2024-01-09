package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {
    private WebDriver driver;


    public LoginTest(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//input[contains(@id, 'login-button')]")).click();
    }
}
