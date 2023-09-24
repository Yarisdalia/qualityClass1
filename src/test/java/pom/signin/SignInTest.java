package pom.signin;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pom.WebBrowser;

public class SignInTest extends TestCase {
    WebBrowser web;
    SignInPage signInPage;

    @Before
    public void setUp(){
        web = new WebBrowser();
        signInPage = new SignInPage(web.getDriver());
        signInPage.visit("https://demo.guru99.com/test/newtours/");
    }

    @Test
    public void test(){
        signInPage.SignIn();
    }

    @After
    public void tearDown(){
        web.quitWebWindow();
    }
}