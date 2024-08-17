package steps;

import constants.Constant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SauceDemoLoginPage;
import pages.SauceDemoShoppingCartPage;
import webDriverConfig.WebDriverManager;

public class SauceDemoShoppingCartStep {
    WebDriver driver = WebDriverManager.getDriver();
    SauceDemoShoppingCartPage sauceDemoShoppingCartPage = new SauceDemoShoppingCartPage(driver);

    @When("Presiono boton Add to cart en algun producto")
    public void presionoBotonAddToCartEnAlgunProducto() {
        sauceDemoShoppingCartPage.presionarBotonAddToCartBackpack();
    }

    @Then("El boton cambia de estado con texto {string}")
    public void elBotonCambiaDeEstadoConTexto(String texto) {
        Assert.assertEquals(texto,sauceDemoShoppingCartPage.getTextBotonRemoveBackpack());
    }

    @And("El icono del carro en la esquina superior derecha posee un numero {string}")
    public void elIconoDelCarroEnLaEsquinaSuperiorDerechaPoseeUnNumero(String numero) {
        Assert.assertEquals(numero,sauceDemoShoppingCartPage.getSizeShoppingCart());
    }

    @When("Presiono boton Carro de compras")
    public void presionoBotonCarroDeCompras() {
        sauceDemoShoppingCartPage.presionarBotonCarroDeCompras();
    }

    @Then("Visualizo producto agregado en el carro de compras")
    public void visualizoProductoAgregadoEnElCarroDeCompras() {
        Assert.assertTrue(sauceDemoShoppingCartPage.visualizoElementoEnCarro());
    }
}
