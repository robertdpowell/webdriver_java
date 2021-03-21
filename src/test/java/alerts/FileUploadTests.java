package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/rob/IdeaProjects/webdriver_java/resources/chromedriver");
    }
}
