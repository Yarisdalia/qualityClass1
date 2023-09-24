package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By btnRegister = By.xpath("//a[contains(text(),'REGISTER')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goRegisterPage() {
        click(btnRegister);
    }
 }