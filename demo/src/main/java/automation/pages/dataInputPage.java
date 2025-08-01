package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import automation.utils.waitUtils;
import io.qameta.allure.Allure;

public class dataInputPage {
        private WebDriver driver;
        private By titleForm = By.xpath("//label[text()='Title']/following::input[1]");
        private By QuantityForm = By.xpath("//label[text()='Quantity']/following::input[1]");
        private By priceForm = By.xpath("//label[text()='Price']/following::input[1]");
        private By dateForm = By.xpath("//input[@data-testid=\"DatePickerWidget-textInput\"]");
        private By Time = By.xpath("//input[contains(@class, 'TimeWidget---dropdown_value')]");
        private By submitButton = By.xpath("//button[normalize-space()='Submit']");
        private By cancelButton = By.xpath("(//*[@data-testid=\"virtualButtonLayout-div\"])[1]");
        private By successMessage = By.xpath("//button[normalize-space()='Cancel']");

        public dataInputPage(WebDriver driver) {
                this.driver = driver;
        }

        public void setTitle(String title) {
                Allure.step("Ingresamos el título del formulario: " + title);
                driver.findElement(titleForm).sendKeys(title);
        }

        public void setQuantity(String quantity) {
                Allure.step("Ingresamos la cantidad del formulario en numeros: " + quantity);
                driver.findElement(QuantityForm).sendKeys(quantity);
        }

        public void setPrice(String price) {
                Allure.step("Ingresamos el precio del formulario: " + price);
                driver.findElement(priceForm).sendKeys(price);
        }

        public void setDate(String date) {
                Allure.step("Ingresamos la fecha del formulario: " + date);
                driver.findElement(dateForm).sendKeys(date);
        }

        public void setTime(String time) {
                Allure.step("Ingresamos la hora del formulario: " + time);
                driver.findElement(Time).sendKeys(time);
        }

        public void clickSubmit() {
                Allure.step("Hacemos clic en el botón de enviar del formulario");
                driver.findElement(submitButton).click();
        }

        public void clickCancel() {
                Allure.step("Hacemos clic en el botón de cancelar del formulario");
                driver.findElement(cancelButton).click();
        }

        public boolean isSuccessMessageDisplayed() {
                Allure.step("Verificamos si el mensaje de éxito está visible");
                return waitUtils.waitForElementVisible(driver, successMessage, 10) != null;
        }
}
