package org.example;

import org.openqa.selenium.WebDriver;
//Nessa atividade estarei
public class ex2 {
    public static void main(String[] args) {
        //caso você utilize o drive de outro navegador apenas digite
        //o nome dele no parametro da função abaixo

        //Chrome, edge, firefox

        WebDriver driver = WebDriverConfig.getDriver("chrome");
    }
}
