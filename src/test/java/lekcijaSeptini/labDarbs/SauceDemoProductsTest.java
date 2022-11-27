package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoProductsTest extends BaseTest {
    @Test
    public void testAddProductToCart(){
        WebElement lietotajVardsIevadesLauks = driver.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginPoga = driver.findElement(By.id("login-button"));
        loginPoga.click();
        WebElement productPageTitle = driver.findElement(By.cssSelector("span.title"));
        String actualPageTitleText = productPageTitle.getText();
        Assert.assertEquals(actualPageTitleText,"PRODUCTS");
        
    }



}
