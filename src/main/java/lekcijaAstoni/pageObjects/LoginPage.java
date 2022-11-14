package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver parluks;
    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("password");

    private By loginButton = By.id("login-button");

    private By errorTextField = By.cssSelector("div.error-message-container h3");

    public void login(String username, String password){
        getUsernameField().sendKeys(username);
        getPasswordField().sendKeys(password);
        getLoginButton().click();

    }

    public String getErrorText() {
        return parluks.findElement(errorTextField).getText();
    }




    public WebElement getLoginButton() {
        return parluks.findElement(loginButton);
    }



    public WebElement getUsernameField(){
        return parluks.findElement(usernameInputField);
            }

    public WebElement getPasswordField(){
        return parluks.findElement(passwordInputField);
    }



    public LoginPage(WebDriver parluks) {
        this.parluks = parluks;
    }
}
