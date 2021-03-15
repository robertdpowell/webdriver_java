package Dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropdownLink();

        String option = "Option 1"; //set up as a variable as used more than once. commit test2 go

        dropDownPage.selectFromDropDown(option);//choose option 1 using our variable above
        var selectedOptions = dropDownPage.getSelectedOption(); //get all the selected options
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections"); //check only one is selected
        assertTrue(selectedOptions.contains(option), "Option not selected");//check the one we have selected is option 1.
    }
}