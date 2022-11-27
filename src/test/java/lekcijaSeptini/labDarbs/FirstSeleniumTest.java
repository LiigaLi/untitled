package lekcijaSeptini.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSeleniumTest extends BaseTest {
    static WebDriver driver = new ChromeDriver();
    static int counter;

    @BeforeMethod
    public static void openBrowser(){

        driver.get("https://www.lu.lv");
        //browserChrome.navigate().to("https://www.lu.lv"); //alternatīva 'get'
        driver.manage().window().maximize();
        counter++;
    }

    @AfterMethod
    public static void quitBrowser(){
        driver.quit();
        System.out.println("*** Tests pabeigts ***\n");
    }

    @Test
    public void testFirstWebPage() {
        System.out.println("Selenium tests #" + counter + " - weblapas " + driver.getCurrentUrl() + " Title pārbaude");

        String expectedTitle = "Latvijas Universitāte";
        String actualTitle = driver.getTitle();
        System.out.println("Sagaidāmais rezultāts: " + expectedTitle + " ; aktuālais rezultāts: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);

    }

}
