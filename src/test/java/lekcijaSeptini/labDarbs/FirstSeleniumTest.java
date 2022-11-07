package lekcijaSeptini.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest extends BaseTest {
    WebDriver parluks;


    @Test
    public void testFirstWebPage(){
        System.out.println("Pirmais Selenium tests");
        parluks.quit();
    }
    @Test
    public void testPageTitle(){
        String nosaukums = parluks.getTitle();
        Assert.assertEquals(nosaukums, "Latvijas Universitāte");


    }

}
