package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Classe para por métodos relacionados ao manuseio de cookies
public class cookies {
    private WebDriver driver;

    public cookies(WebDriver driver) {
        this.driver = driver;
    }
    public void aceitandoCookies(String itemText){
        String itemXpath = String.format("//button[text()='%s']", itemText);
        driver.findElement(By.xpath(itemXpath)).click();
    }
}
