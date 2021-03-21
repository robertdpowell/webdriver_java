package contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testModalBox() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.triggerModal();
        assertEquals(contextMenuPage.getModalText(), "You selected a context menu", "text incorrect");
    }
}
