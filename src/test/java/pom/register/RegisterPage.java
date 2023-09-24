package pom.register;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pom.BasePage;

public class RegisterPage extends BasePage {
    By txtFirstName = By.name("firstName");
    By txtLastName = By.name("lastName");
    By txtPhone = By.name("phone");
    By txtEmail = By.name("userName");
    By txtUsername= By.name("email");
    By txtPassword = By.name("password");
    By txtConfirmPassowrd = By.name("confirmPassword");
    By btnEnviar = By.name("submit");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void registerUser() {
        type("agustin", txtFirstName);
        type("gonzalez", txtLastName);
        type("6383678232", txtPhone);
        type("ejemplo@gmail.com", txtEmail);
        type("agustin1", txtUsername);
        type("agustin1", txtPassword);
        type("agustin1", txtConfirmPassowrd);

        click(btnEnviar);
    }
}
