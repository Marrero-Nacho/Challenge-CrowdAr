package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import webDriverConfig.WebDriverManager;

import java.time.Duration;

public class MetodosGenericos {
    public static boolean visualizarObjeto(WebElement element,int timeout){
        try {
            System.out.println("Esperando elemento");
            WebDriverWait wait = new WebDriverWait(WebDriverManager.getDriver(), Duration.ofSeconds(timeout));
            wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("Es visible el elemento: "+element.getText());
            return true;
        }catch (Exception e){
            System.out.println("No es visible el elemento");
            return false;
        }
    }
}
