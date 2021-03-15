package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown"); //find the dropdown element and set as a variable.

    //construct the driver
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    //method that allows us to locate the dropdown on the page
    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }

    //method that allows us to select a dropdown element based on the option text.
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    //method to take all the options from the dropdown and put them into a list
    public List<String> getSelectedOption(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
}