package automation.login;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test extends reporter {

    @Test
    public void sampleTest() throws InterruptedException {
        ExtentTest test = extentReports.createTest("Sample Test", "This is a sample test case");
        test.info("This is an info message for the sample test.");

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");
        System.out.println("Page title is: " + driver.getTitle());
        Thread.sleep(10000); // se detiene por 10 segundos

        test.pass("Navigated to Facebook successfully.");
        Thread.sleep(2000); // Espera 2 segundos antes de cerrar
        driver.quit();

    }
}
