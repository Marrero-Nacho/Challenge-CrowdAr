package webDriverConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebDriverManager {
    private static WebDriver driver;

    public static WebDriver createDriver(String webDriver){
        switch (webDriver.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("El navegador seleccionado no se encuentra contemplado");
                System.out.println("Se selecciona inicia navegador Chrome");
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }
    public static WebDriver getDriver(){
        return driver;
    }
}
