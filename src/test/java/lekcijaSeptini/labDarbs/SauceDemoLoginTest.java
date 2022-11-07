package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest {
    WebDriver parluks;


    @Test
    public void testLoginWrongUsernameAndPassword() {
        testLogin("", "", "Epic sadface: Username and password do not match any user in this service");

    }

    //TDD - test driven development

    @Test
    public void testLoginEmptyUsernameAndPassword() {
        testLogin("","", "Epic sadface: Username and password do not match any user in this service");
    }

    //tukš lietotājVārds, parole aizpildīta - pārbaudām kļūdu

    @Test
    public  void testEmptyUsernameFilledPassword(){
        testLogin("", "sfvsdtr", "Epic sadface: Username and password do not match any user in this service");

    }
        //aizpildīts lietotājvārds, parole tukša - pārbaudām kļūdu
        @Test
        public void testLoginFieldUsernameAndEmptyPasword() {
            testLogin("asjdnklsaj", "", "Epic sadface: Username and password do not match any user in this service");
        }




    private void testLogin(String username, String password, String expectedErrorMessage){
        WebElement lietotajVardsIevadesLauks = parluks.findElement(By.id("user-name"));
        lietotajVardsIevadesLauks.sendKeys("Bubulis");

        WebElement lietotajParolesLauks = parluks.findElement(By.id("password"));
        lietotajParolesLauks.sendKeys("zxccvvv");

        WebElement loginPoga = parluks.findElement(By.id("login-button"));
        loginPoga.click();

        WebElement errorTextField = parluks.findElement(By.cssSelector("div.error-message-container h3"));
        String errorText = errorTextField.getText();
        Assert.assertEquals(errorText,expectedErrorMessage);

    }


}
