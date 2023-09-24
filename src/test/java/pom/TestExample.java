package pom;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestExample extends TestCase {

    //declarar el driver
    private WebDriver driver;

    @Before
    public void setUp(){
        //instanciar la page
    }

    @Test
    public void test(){
        assertTrue(true);
    }

    @After
    public void tearDown(){
//        driver.quit();
    }

}