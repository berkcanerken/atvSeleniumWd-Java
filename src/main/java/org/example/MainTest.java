package org.example;

import org.openqa.selenium.WebDriver;

public class MainTest {
    public static String urlBase = "https://www.saucedemo.com";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver("chrome");
        WebDriverConfig config = new WebDriverConfig(urlBase);
        LoginTest testLogin = new LoginTest(driver);

        // Abrindo Site
        config.openUrl();
        // Teste de login
        testLogin.login("standard_user", "secret_sauce");

        // Inicializando CarrinhoTest com o driver
        CarrinhoTest carrinho = new CarrinhoTest(driver);

        // Adiciona ao carrinho
        carrinho.addAoCarrinho("add-to-cart-sauce-labs-backpack");
        carrinho.verCarrinho();

        // Espera para ver a tela
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Fechando aplicação
        driver.quit();
    }
}
