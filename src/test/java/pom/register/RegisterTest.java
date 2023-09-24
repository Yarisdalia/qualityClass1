package pom.register;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pom.HomePage;
import pom.WebBrowser;

public class RegisterTest extends TestCase {
    WebBrowser web;
    RegisterPage registerPage;
    HomePage homePage;

    @Before
    public void setUp(){
        web = new WebBrowser();
        homePage = new HomePage(web.getDriver());
        registerPage = new RegisterPage(web.getDriver());
    }

    @Test
    public void test(){
        homePage.visit("https://demo.guru99.com/test/newtours/index.php");
        homePage.goRegisterPage();
        registerPage.registerUser();
    }

    @After
    public void tearDown(){
        web.quitWebWindow();
    }
}
