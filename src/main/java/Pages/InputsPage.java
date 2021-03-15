package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputsPage {
    //we need a WebDriver
    private WebDriver driver;

    //find the page elements by locating them
    private By inputField = By.cssSelector("#content input");

    //constructor to set up the webdriver
    public InputsPage (WebDriver driver){
        this.driver = driver;
    }

    //use the driver to do something - put some input in a field.
    public void setInput(String input){
        driver.findElement(inputField).sendKeys(input);
    }
}
