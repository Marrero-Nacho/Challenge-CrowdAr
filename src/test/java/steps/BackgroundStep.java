package steps;

import constants.Constant;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import webDriverConfig.WebDriverManager;

public class BackgroundStep {
    WebDriver driver;
    @Given("Ingreso a web SauceDemo")
    public void ingresoAWebSauceDemo()  {

    }

    @Given("Ingreso a web SauceDemo con navegador {string}")
    public void ingresoAWebSauceDemoConNavegador(String nav){
        driver = WebDriverManager.createDriver(nav);
        driver.get(Constant.URL_SAUCEDEMO);
        String url = driver.getCurrentUrl();
        Assert.assertEquals(Constant.URL_SAUCEDEMO,url);
    }
}
