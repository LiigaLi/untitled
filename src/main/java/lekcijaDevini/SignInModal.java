package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SignInModal {
    WebDriver driver;
    WebDriverWait wait;

    public SignInModal(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By modalWindow = By.cssSelector("div.b-login-modal");
    private By closeButton = By.cssSelector("div.b-login-modal button.close");

    public void closeButtonClick(){
        driver.findElement(closeButton).click();
    }

    public List<WebElement> getModalWindow(){
        return driver.findElements(modalWindow);
    }

    public void waitForSignInModalToAppear(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalWindow));
    }

    public void waitForSignInModalToDisappear(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(modalWindow));
    }
}
