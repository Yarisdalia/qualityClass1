package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowser {
    private final WebDriver driver;

    public WebBrowser(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void quitWebWindow () {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
