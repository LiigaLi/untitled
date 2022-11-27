package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {


    private By continueButton = By.id("continue");

    private By errorText = By.cssSelector("h3");

    private By firstNameInputField = By.id("first-name");
    public void inputFirstName(String Username){
        driver.findElement(firstNameInputField).sendKeys(Username);
    }

    private By lastNameInputField = By.id("last-name");
    public void inputLastName(String lastname){
        driver.findElement(lastNameInputField).sendKeys(lastname);
    }

    private By postalCodeInputField = By.id("postal-code");
    public void inputPostalCode(String postalCode){
        driver.findElement(postalCodeInputField).sendKeys(postalCode);
    }

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public String getErrorText(){
        return driver.findElement(errorText).getText();
    }

    public void clickContinueButton(){
        driver.findElement((continueButton)).click();
    }

}
