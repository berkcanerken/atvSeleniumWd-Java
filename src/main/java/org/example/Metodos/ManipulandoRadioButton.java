package org.example.Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManipulandoRadioButton {
    private WebDriver driver;

    public ManipulandoRadioButton(WebDriver driver) {
        this.driver = driver;
    }
    public void checkRadioButton(String itemId){
        String itemXpath = String.format("//input[contains(@id, '%s')]", itemId);
        WebElement radio = driver.findElement(By.xpath(itemXpath));
        radio.click();
        System.out.println(radio.isSelected());
    }
}
