package automation.loginTest;

import org.testng.annotations.Test;
import org.testng.Assert;
import automation.data.textAssert;
import automation.utils.waitUtils;
import automation.utils.allureUtils;
import automation.actions.loginActions;
import automation.base.BaseTestConfig;

//reporteria
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Epic;


@Epic("Autenticación")
@Feature("Login")
public class LoginTest extends BaseTestConfig {
@Test(description = "Login correcto con datos válidos") // Esto se mostrará como título del test
    @Story("Login exitoso")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Este test verifica que un usuario válido puede hacer login correctamente.")

    public void testLoginSuccess() {
        loginActions.login(driver); 
        waitUtils.waitForTitleContains(driver, textAssert.LOGIN_SUCCESS, 10);
        allureUtils.attachScreenshot(driver, "Pantalla después del login");
        Assert.assertTrue(driver.getTitle().contains(textAssert.LOGIN_SUCCESS));
    }
}
