package pom.signin;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import pom.BasePage;


public class SignInPage extends BasePage {

    //localizadores
    By username = By.name("userName");
    By password = By.name("password");
    By submit = By.name("submit");

    public SignInPage(WebDriver driver) {
        super(driver);
    }


    //metodos de la pagina
    public void SignIn(){
        type("user1", username);
        type("pass1", password);

        click(submit);
    }

}
