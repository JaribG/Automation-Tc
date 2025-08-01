package automation.dataInputTest;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import automation.pages.menuPage;
import automation.pages.dataInputPage;
import automation.utils.allureUtils;
import automation.actions.loginActions;
import automation.base.BaseTestConfig;
import automation.data.inputDate;

//reporteria
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Epic;

@Epic("Autenticación")
@Feature("Data Input")
public class createDataTest extends BaseTestConfig {

    @Test(description = "Formulario de entrada de datos")
    @Story("Data Input Form")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Este test verifica que se puede llenar un formulario de entrada de datos correctamente.")
    public void formFill() {
        loginActions.login(driver);
        menuPage menu = new menuPage(driver);
        dataInputPage dataInput = new dataInputPage(driver);
        menu.dataInput();
        dataInput.setTitle(inputDate.setTitle);
        dataInput.setQuantity(inputDate.setQuantity);
        dataInput.setPrice(inputDate.setDate);
        dataInput.setDate(inputDate.setQuantitydata);
        dataInput.setTime(inputDate.setTime);
        dataInput.clickSubmit();
        Assert.assertTrue(dataInput.isSuccessMessageDisplayed(), "El mensaje de éxito no disponible");
        //Esperamos a que este disponible visible, para que se tome la captura de pantalla con el mensaje de éxito
        try {
            TimeUnit.SECONDS.sleep(1); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        allureUtils.attachScreenshot(driver, "Pantalla después del llenado del formulario");
    }

}
