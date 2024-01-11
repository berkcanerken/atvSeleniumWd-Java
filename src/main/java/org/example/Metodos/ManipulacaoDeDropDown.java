package org.example.Metodos;
//nesse package adicionarei os métodos que estou aprendendo


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//Manipulando um dropDown

public class ManipulacaoDeDropDown {
    private WebDriver driver;

    public ManipulacaoDeDropDown(WebDriver driver) {
        this.driver = driver;
    }
    //Criando o elemento
    public void ManipulandoDDown(String nome, String tipoSelecao,String valor){
        WebElement ddown = localizarElementoWeb(nome);
        selecionarOpcaoDDown(ddown, tipoSelecao, valor);

    }
    public WebElement localizarElementoWeb(String nome){
        String itemXpath = String.format("//select[contains(@name, '%s')]", nome);
        return driver.findElement(By.xpath(itemXpath));
    }
    public void  selecionarOpcaoDDown(WebElement ddown, String tipoSelecao, String valor){
        Select select = new Select(ddown);
        tipoSelecao = tipoSelecao.toLowerCase();
        switch (tipoSelecao){
            case "valor":
                select.selectByValue(valor);
                break;
            case "texto":
                select.selectByVisibleText(valor);
                break;
            case "index":
                int novoValor = Integer.parseInt(valor);
                select.selectByIndex(novoValor);
                break;
            default:
                throw new IllegalArgumentException("O valor: " + valor+" é inválido!");
        }
    }


}
