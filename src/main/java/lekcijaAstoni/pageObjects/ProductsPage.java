package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    WebDriver parluks;

    private By pageTitle = By.cssSelector("span.title");
    private By cartButton = By.id("shopping_cart_container");


    public ProductsPage(WebDriver parluks){
        this.parluks = parluks;
    }
    public WebElement getCartButton(){
        return parluks.findElement(cartButton);
    }

    public WebElement getPageTitle(){
        return parluks.findElement(pageTitle);
    }



}
