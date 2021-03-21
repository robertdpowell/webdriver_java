package alerts;

import Pages.HomePage;
import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "Results text incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPrompt();
        String text = "TAU";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You entered: " + text, "Results text incorrect");
    }

}
