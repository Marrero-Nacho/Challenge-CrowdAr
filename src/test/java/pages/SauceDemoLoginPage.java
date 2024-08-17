package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.MetodosGenericos;

public class SauceDemoLoginPage {
    WebDriver driver;
    public SauceDemoLoginPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "user-name")
    WebElement inputUsuario;
    @FindBy(id = "password")
    WebElement inputContrasena;
    @FindBy(id = "login-button")
    WebElement btnLogin;
    @FindBy(xpath = "//span[@data-test=\"title\"]")
    WebElement txtProducts;
    @FindBy(xpath = "//h3[@data-test=\"error\"]")
    WebElement cartelError;

    public void ingresarUsuario(String usuario){
        try {
            if (MetodosGenericos.visualizarObjeto(inputUsuario,10)){
                inputUsuario.click();
                inputUsuario.sendKeys(usuario);
                System.out.println("Se ingresa usuario de manera exitosa");
            }
        }catch (Exception e){
            System.out.println("No se pudo ingresar el usuario");
            System.out.println(e);
        }
    }
    public void ingresarContrasena(String contrasena){
        try {
            if (MetodosGenericos.visualizarObjeto(inputContrasena,10)){
                inputContrasena.click();
                inputContrasena.sendKeys(contrasena);
                System.out.println("Se ingresa contraseña de manera exitosa");
            }
        }catch (Exception e){
            System.out.println("No se pudo ingresar el usuario");
            System.out.println(e);
        }
    }
    public void presionarBotonLogin(){
        try {
            if (MetodosGenericos.visualizarObjeto(btnLogin,10)) {
                btnLogin.click();
            }
        }catch (Exception e){
            System.out.println("No se pudo interactuar con el boton");
            System.out.println(e);
        }
    }
    public String getTituloHome(){
        String titulo;
        if (MetodosGenericos.visualizarObjeto(txtProducts,10)) {
            titulo = txtProducts.getText();
            return titulo;
        }
        return null;
    }
    public String getCartelError(){
        String cartel;
        if (MetodosGenericos.visualizarObjeto(cartelError,10)) {
            cartel = cartelError.getText();
            return cartel;
        }
        return null;
    }
}
