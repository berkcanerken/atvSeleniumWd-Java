package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Classe para por métodos relacionados ao manuseio de Cookies
public class Cookies {
    private WebDriver driver;

    public Cookies(WebDriver driver) {
        this.driver = driver;
    }
    public void aceitandoCookies(String itemText){
        String itemXpath = String.format("//button[text()='%s']", itemText);
        driver.findElement(By.xpath(itemXpath)).click();
    }
}
