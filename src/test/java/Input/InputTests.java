package Input;

import Pages.InputsPage;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

//the base test launches the driver, gets us to the website - D-R-Y
public class InputTests extends BaseTests {   //inherits from base tests

    @Test
    public void testInputNumber(){
        InputsPage inputsPage = homePage.clickInputsLink();
        inputsPage.setInput("123");
    }
}
