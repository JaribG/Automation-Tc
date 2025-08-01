package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.qameta.allure.Allure;

public class loginPage {
    private WebDriver driver;

    private By usernameField = By.id("un");
    private By passwordField = By.id("pw");
    private By loginButton = By.id("jsLoginButton");

    public By getModalLogin(int index) {
        Allure.step("Obtener el modal de login por índice");
        String xpath = String.format("//div[@id=\"selfSelectionPrompt\"]/following::div[@class=\"selfSelectionBlock\"][%d]/a", index);
        return By.xpath(xpath);
    }

    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        Allure.step("Ingresar usuario: " + username);
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        Allure.step("Ingresar contraseña" + password);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLogin() {
        Allure.step("Hacer clic en el botón de login");
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password, int modalIndex) {
        Allure.step("Iniciar sesión con usuario: " + username + ", contraseña: " + password + " y modal índice: " + modalIndex);
        driver.findElement(getModalLogin(modalIndex)).click();
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    
}
