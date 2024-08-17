package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.MetodosGenericos;

public class SauceDemoShoppingCartPage {
    WebDriver driver;
    public SauceDemoShoppingCartPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement btnAddToCartBackpack;
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement btnRemoveBackpack;
    @FindBy(xpath = "//span[@class=\"shopping_cart_badge\"]")
    WebElement shoppinCartSize;
    @FindBy(xpath = "//a[@class=\"shopping_cart_link\"]")
    WebElement btnCarroDeCompras;
    @FindBy(id = "item_4_title_link")
    WebElement titleElementoEnCarro;

    public void presionarBotonAddToCartBackpack(){
        try {
            if (MetodosGenericos.visualizarObjeto(btnAddToCartBackpack,10)) {
                btnAddToCartBackpack.click();
            }
        }catch (Exception e){
            System.out.println("No se pudo interactuar con el boton");
            System.out.println(e);
        }
    }
    public String getTextBotonRemoveBackpack(){
        String text;
        if (MetodosGenericos.visualizarObjeto(btnRemoveBackpack,10)) {
            text = btnRemoveBackpack.getText();
            return text;
        }
        return null;
    }
    public String getSizeShoppingCart(){
        String text;
        if (MetodosGenericos.visualizarObjeto(shoppinCartSize,10)) {
            text = shoppinCartSize.getText();
            return text;
        }
        return null;
    }
    public void presionarBotonCarroDeCompras(){
        try {
            if (MetodosGenericos.visualizarObjeto(btnCarroDeCompras,10)) {
                btnCarroDeCompras.click();
            }
        }catch (Exception e){
            System.out.println("No se pudo interactuar con el boton");
            System.out.println(e);
        }
    }
    public boolean visualizoElementoEnCarro(){
        if (MetodosGenericos.visualizarObjeto(titleElementoEnCarro,10)){
            return true;
        }
        return false;
    }
}
