package automation.actions;

import org.openqa.selenium.WebDriver;

import automation.pages.loginPage;
import io.github.cdimascio.dotenv.Dotenv;

public class loginActions {
    
    private static final Dotenv dotenv = Dotenv.load();

    public static void login(WebDriver driver) {
        String user = dotenv.get("USER");
        String password = dotenv.get("PASSWORD");

        loginPage loginPage = new loginPage(driver);
        loginPage.login(user, password, 2);
    }
}
