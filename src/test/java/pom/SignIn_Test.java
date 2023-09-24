package pom;

import junit.framework.TestCase;

import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import pom.SignInPage;



public class SignIn_Test extends TestCase {

    //declarar el driver

    private WebDriver driver;

    SignInPage signInPage;



    @Before

    public void setUp(){

        //instanciar la page

        signInPage = new SignInPage(driver);

        driver = signInPage.chromeDriverConnection();

        signInPage.visit("https://demo.guru99.com/test/newtours/");

    }

    @After

    public void tearDown(){

        driver.quit();

    }



    @Test

    public void test(){

        signInPage.SignIn();

    }

}