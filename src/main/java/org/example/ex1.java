package org.example;
/*Primeira atividade: inicializando teste de login no site sauce.demo
 Utilizando xpath como localizador
 enviando chaves de acesso(email e senha)*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ex1 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver("chrome");

        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();

    }
}
