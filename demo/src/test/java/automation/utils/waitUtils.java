package automation.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import io.qameta.allure.Step;


public class waitUtils {
    @Step("Esperar a que el título de la página contenga: {tituloEsperado} durante {timeoutSeconds} segundos")
    public static void waitForTitleContains(WebDriver driver, String tituloEsperado, int timeoutSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
        wait.until(ExpectedConditions.titleContains(tituloEsperado));
    }
}
