package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Nessa atividade estarei
public class CarrinhoTest {
    private WebDriver driver;

    public CarrinhoTest(WebDriver driver) {
        this.driver = driver;
    }

    public void addAoCarrinho(String itemId){
        String itemXPath = String.format("//*[@id='%s']", itemId);
        driver.findElement(By.xpath(itemXPath)).click();
    }
    public void verCarrinho(){
        driver.findElement(By.xpath("//a[contains(@class, 'shopping_cart_link')]")).click();
    }
}
