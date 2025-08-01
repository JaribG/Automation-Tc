package automation.base;

import automation.data.Url;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.qameta.allure.Allure;


public class BaseTestConfig {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        Allure.step("Inicialización del proyecto");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(Url.baseUlr);
    }

    @AfterMethod
    public void tearDown() {
        Allure.step("Cerramos el navegador");
        if (driver != null) {
            driver.quit();
        }
    }
}
