package input;

import Pages.InputsPage;
import base.BaseTests;
import org.testng.annotations.Test;

//the base test launches the driver, gets us to the website - D-R-Y
public class InputTests extends BaseTests {   //inherits from base tests

    @Test
    public void testInputNumber(){
        InputsPage inputsPage = homePage.clickInputsLink();
        inputsPage.setInput("123");
    }
}
