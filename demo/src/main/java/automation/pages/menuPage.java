package automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class menuPage {
    private WebDriver driver;
    private By automatedTestGrid = By.xpath("//*[@data-testid=\"VirtualNavigationHeaderLayout-tabs-wrapper\"]//*[@title=\"Automated Test Grid\"]");
    private By dataInput = By.xpath("//*[@data-testid=\"VirtualNavigationHeaderLayout-tabs-wrapper\"]//*[@title=\"Data Input\"]");
    private By allFields = By.xpath("//*[@data-testid=\"VirtualNavigationHeaderLayout-tabs-wrapper\"]//*[@title=\"All Fields\"]");
    private By view = By.xpath("//*[@data-testid=\"VirtualNavigationHeaderLayout-tabs-wrapper\"]//*[@title=\"View\"");
    private By report = By.xpath("//*[@data-testid=\"VirtualNavigationHeaderLayout-tabs-wrapper\"]//*[@title=\"Report\"]");
    private By mail = By.xpath("//*[@data-testid=\"VirtualNavigationHeaderLayout-tabs-wrapper\"]//*[@title=\"Mail\"]");


    public menuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void automatedTestGrid() {
        driver.findElement(automatedTestGrid).click();
    }
    public void dataInput() {
        driver.findElement(dataInput).click();
    }
    public void allFields() {
        driver.findElement(allFields).click();
    }
    public void view() {
        driver.findElement(view).click();
    }   
    public void report() {
        driver.findElement(report).click();
    }
    public void mail() {
        driver.findElement(mail).click();
    }

}
