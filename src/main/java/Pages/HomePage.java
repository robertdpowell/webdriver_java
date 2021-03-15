package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver; //field to store the webdriver
    public HomePage (WebDriver driver){
        this.driver = driver;
    } //constructor to set up the webdriver

    //generic method to find any link on page by its text so we don't need to declare each link as a variable
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    //method to return the corresponding page for a specific link.
    public LoginPage clickFormAuthenticationLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    //method to return the corresponding page for a specific link.
    public DropdownPage clickDropdownLink(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    //method to return the corresponding page for a specific link.
    public InputsPage clickInputsLink(){
        clickLink("Inputs");
        return new InputsPage(driver);
    }



}
