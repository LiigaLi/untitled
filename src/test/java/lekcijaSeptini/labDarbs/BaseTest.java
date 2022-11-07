package lekcijaSeptini.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    public WebDriver parluks;

    @BeforeMethod
    public void setupBrowser() {
        parluks = new ChromeDriver();
        parluks.manage().window().maximize();
        parluks.navigate().to("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDownBrowser() {
        parluks.quit();
    }

}

