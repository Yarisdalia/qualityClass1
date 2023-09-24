package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BasePage {
    //declaramos objeto webdriver
    public WebDriver driver;

    //creamos el contructor de la clase
    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    //creamos un envoltorio de los comandos de selenium
    public WebElement findElement( By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    //clase para obtener el texto de un elemento
    public String getText(WebElement element){
        return element.getText();
    }

    //ahora hacemos una sobre carga del metodo para que reciba por localizador
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    //escribir texto
    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    //click al elemento por localizador
    public void click(By locator){
        driver.findElement(locator).click();
    }

    //metodo para validar si el localizador se encuentra
    public Boolean isDisplayed(By locator){
        try{
            return driver.findElement(locator).isDisplayed();
            //vamos a capturar la excepcion
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }

    //metodo para ir a una URL
    public void visit(String url){
        driver.get(url);
    }

}