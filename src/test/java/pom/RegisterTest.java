package pom;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pom.HomePage;
import pom.RegisterPage;

public class RegisterTest extends TestCase {
    private WebDriver driver;

    RegisterPage registerPage;
    HomePage homePage;

    @Before
    public void setUp(){
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
        driver = registerPage.chromeDriverConnection();
        registerPage.visit("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void registroExitoso() throws InterruptedException {
        homePage.goRegister();
        registerPage.registerUser();
    }

    @Test
    public void registroNoExitoso(){

    }

    @After
    public void tearDown(){
        driver.quit();
         }
}
