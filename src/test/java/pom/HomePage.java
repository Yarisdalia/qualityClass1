package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By btnRegister = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]");

    public void goRegister() {
        click(btnRegister);
    }
 }