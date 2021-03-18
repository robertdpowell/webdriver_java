package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

//our class for this page
public class HoversPage {
    //define the fields that we want to use later in our methods
    private WebDriver driver;
    private By figureBox = By.className("figure"); //defining a field for our class
    private By boxCaption = By.className("figcaption"); //defining a field for our class

    //setup the webdriver
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    //create a method to allow our test to hover over a figure. It uses an Actions object and returns the FigureCaption web elemenet
    public FigureCaption hoverOverFigure(int index){
        //instantiate an object called figure from the Webelement class and assign it
        WebElement figure = driver.findElements(figureBox).get(index - 1); //find the element and retrieve the list of figures
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();//go to the figure we want and do something.
        return new FigureCaption(figure.findElement(boxCaption));//return the figure to the method.
    }

    //nested class for this page class
    public class FigureCaption {
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }
        public boolean isCaptionDisplayed() {
            return caption.isDisplayed();
        }
        public String getTitle() {
            return caption.findElement(header).getText();
        }
        public String getLink() {
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText() {
            return caption.findElement(link).getText();
        }
    }
}
