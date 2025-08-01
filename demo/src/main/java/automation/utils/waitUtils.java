package automation.utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import io.qameta.allure.Allure;
import io.qameta.allure.Step;


public class waitUtils {
    @Step("Esperar a que el título de la página contenga: {tituloEsperado} durante {timeoutSeconds} segundos")
    public static void waitForTitleContains(WebDriver driver, String tituloEsperado, int timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        wait.until(ExpectedConditions.titleContains(tituloEsperado));
    }

     public static WebElement waitForElementVisible(WebDriver driver, By locator, int timeoutSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (TimeoutException e) {
            Allure.step("El elemento no se hizo visible dentro del tiempo esperado: " + timeoutSeconds + " segundos");
            return null;
        }
    }
}
