package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    WebDriver driver;
    private By pageTitle = By.className("title");
    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");
    public void inputFirstName(String Liga){
        driver.findElement(firstNameInputField).sendKeys(Liga);
    }



    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getErrorText(){
        return driver.findElement(errorText).getText();
    }

    public void clickContinueButton(){
        driver.findElement((continueButton)).click();
    }
    public WebElement getPageTitle(){
        return driver.findElement(pageTitle);
    }
}
