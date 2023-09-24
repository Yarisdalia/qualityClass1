package pom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;



public class SignInPage extends Base{

    public SignInPage(WebDriver driver) {

        super(driver);

    }



    //localizadores

    By username = By.name("userName");

    By password = By.name("password");

    By submit = By.name("submit");





    //metodos de la pagina

    public void SignIn(){

        type("user1", username);

        type("pass1", password);

        click(submit);

    }

}
