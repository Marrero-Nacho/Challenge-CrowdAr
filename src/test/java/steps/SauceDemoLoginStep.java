package steps;

import constants.Constant;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.SauceDemoLoginPage;
import webDriverConfig.WebDriverManager;

public class SauceDemoLoginStep {
    WebDriver driver = WebDriverManager.getDriver();
    SauceDemoLoginPage sauceDemoLoginPage = new SauceDemoLoginPage(driver);

    @When("Ingreso usuario correcto")
    public void ingresoUsuarioCorrecto() {
        sauceDemoLoginPage.ingresarUsuario(Constant.USUARIO);
    }

    @And("Ingreso contraseña correcta")
    public void ingresoContraseñaCorrecta() {
        sauceDemoLoginPage.ingresarContrasena(Constant.CONTRASENA);
    }

    @And("Presiono boton Login")
    public void presionoBoton() {
        sauceDemoLoginPage.presionarBotonLogin();
    }

    @Then("Visualizo pantalla {string}")
    public void visualizoPantalla(String pantalla) {
        Assert.assertEquals(pantalla,sauceDemoLoginPage.getTituloHome());
        System.out.println("Se visualiza pantalla esperada: "+sauceDemoLoginPage.getTituloHome());
    }

    @Then("Visualizo cartel de error {string}")
    public void visualizoCartelDeError(String cartel) {
        Assert.assertEquals(cartel,sauceDemoLoginPage.getCartelError());
        System.out.println("Se visualiza cartel de error esperado: "+sauceDemoLoginPage.getCartelError());
    }

    @And("Realizo login exitoso")
    public void realizoLoginExitoso() {
        sauceDemoLoginPage.ingresarUsuario(Constant.USUARIO);
        sauceDemoLoginPage.ingresarContrasena(Constant.CONTRASENA);
        sauceDemoLoginPage.presionarBotonLogin();
    }
}
