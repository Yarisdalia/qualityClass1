import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercoryTours {

    private WebDriver driver;

    //localizadores de los elementos de la pagina
    By usernameLocator = By.name("userName");
    By passwordLocator = By.name("password");
    By sigInBtnLocator = By.name("submit");

    By loginSuccesfullyTitle = By.xpath("//h3[contains(text(),'Login')]");

    //localizadores para el registro
    By registerBtnLocator = By.xpath("//a[contains(text(),'REGISTER')]");
    By txtFirstName = By.name("firstName");
    By txtLastName = By.name("lastName");
    By txtPhone = By.name("phone");
    By txtEmail = By.name("userName");
    By txtUsername= By.name("email");
    By txtPassword = By.name("password");
    By txtConfirmPassowrd = By.name("confirmPassword");

    By btnEnviar = By.name("submit");

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        //maximizar la pantalla
        driver.manage().window().maximize();
        //indicar al driver a que URL quiero ir
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    @Test
    public void login() throws InterruptedException {
        if (driver.findElement(usernameLocator).isDisplayed()) {
            driver.findElement(usernameLocator).sendKeys("user1");
            driver.findElement(passwordLocator).sendKeys("pass1");
            driver.findElement(sigInBtnLocator).click();
            Thread.sleep(2000);
            driver.findElement(loginSuccesfullyTitle).isDisplayed();
        }
        else{
            System.out.println("La caja de texto no está presente");
        }
    }

    @Test
    public void register(){
        driver.findElement(registerBtnLocator).click();
        driver.findElement(txtFirstName).sendKeys("agustin");
        driver.findElement(txtLastName).sendKeys("galimberti");
        driver.findElement(txtPhone).sendKeys("234123123");
        driver.findElement(txtEmail).sendKeys("prueba@gmail.com");
        driver.findElement(txtUsername).sendKeys("agustin1");
        driver.findElement(txtPassword).sendKeys("pass1");
        driver.findElement(txtConfirmPassowrd).sendKeys("pass1");
        driver.findElement(btnEnviar).click();
    }

    @Test
    public void loginNoExitoso() throws InterruptedException {
        if (driver.findElement(usernameLocator).isDisplayed()) {
            driver.findElement(usernameLocator).sendKeys("user1");
            driver.findElement(sigInBtnLocator).click();
            Thread.sleep(2000);
            if(driver.findElement(loginSuccesfullyTitle).isDisplayed()){
                System.out.println("BUG - El usuario se logeo sin las credenciales correctas");
            }else{
                System.out.println("El usuario no se logeo");
            }
        }
        else{
            System.out.println("La caja de texto no está presente");
        }
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
