package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage {
    WebDriver driver;
    WebDriverWait wait;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By searchResultList = By.cssSelector("div.b-product--wrap2");

    public List<WebElement> getSearchResultList(){
        return driver.findElements(searchResultList);
    }
}
