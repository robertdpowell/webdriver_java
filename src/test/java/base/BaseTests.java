package base;

import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.List;

//this is a class - remember a class is a template from which we can instantiate objects. So we will instantiate
//an instance from the class BaseTests and call it something, to do some work.
public class BaseTests {
    private WebDriver driver; //our driver
    protected HomePage homePage; //a page object - protected so test classes that inherit from this will have access to it

    @BeforeClass //setup method that runs before any of the test classes
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");//find my interface tool
        driver = new ChromeDriver();// instantiate my interface tool
        driver.get("https://the-internet.herokuapp.com/");//launch website
        homePage = new HomePage(driver); //provide a handle in our test layer to our application.
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}




