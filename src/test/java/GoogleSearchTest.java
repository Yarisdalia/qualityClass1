import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static junit.framework.TestCase.assertEquals;

public class GoogleSearchTest {
    //instanciar webdriver
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        //maximizar la pantalla
        driver.manage().window().maximize();
        //indicar al driver a que URL quiero ir
        driver.get("https://google.com");
    }

    //mi caso de prueba automatizado
    @Test
    public void busqueda() throws InterruptedException {
        //localizar el text box del buscador de google
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.clear();
        searchbox.sendKeys("campera deportiva");
        //dar enter a la caja de busqueda
        searchbox.submit();
        //parar la ejecucion 2 segundos
        Thread.sleep(2000);
        assertEquals("campera deportiva - Buscar con Google", driver.getTitle());
    }

    //luego de ejecutar mi test, este metodo es de cierre, y cierra el navegador
    @After
    public void tearDown() {
        driver.quit();
    }
}