package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By hotSpot = By.id("hot-spot");
    private By modal = By.id("modal");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void triggerModal (){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hotSpot)).perform();
    }

    public String getModalText() {
        return driver.switchTo().alert().getText();
    }

    public void closeModal() {
        driver.switchTo().alert().accept();
    }
}



