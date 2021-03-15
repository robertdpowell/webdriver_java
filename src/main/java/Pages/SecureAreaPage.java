package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    //we need a WebDriver
    private WebDriver driver; //field to store the webdriver
    private By statusAlert = By.id("flash");

    //constructor to set up the webdriver
    public SecureAreaPage (WebDriver driver){
        this.driver = driver;
    }

    //define a method to return some text on a page.
    public String getAlertText() {
        return driver.findElement(statusAlert).getText();
    }
}
