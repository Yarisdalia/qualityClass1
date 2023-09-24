package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Base{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    By txtFirstName = By.xpath("//tbody/tr[2]/td[2]/input[1]");
    By txtLastName = By.xpath("//tbody/tr[3]/td[2]/input[1]");
    By txtPhone = By.xpath("//tbody/tr[4]/td[2]/input[1]");
    By txtEmail = By.xpath("//input[@id='userName']");
    By txtUsername= By.name("email");
    By txtPassword = By.name("password");
    By txtConfirmPassowrd = By.name("confirmPassword");
    By btnEnviar = By.name("submit");

    public void registerUser() throws InterruptedException {
        Thread.sleep(2000);
        type("agustin", txtFirstName);
        type("gonzalez", txtLastName);
        type("6383678232", txtPhone);
        type("ejemplo@gmail.com", txtEmail);
        type("agustin1", txtUsername);
        type("agustin1", txtPassword);
        type("agustin1", txtConfirmPassowrd);
    }
}
