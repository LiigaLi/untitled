package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BasePage{


    public WebElement getCartButton(){
        return driver.findElement(cartButton);
    }

    private By cartButton = By.id("shopping_cart_container");


    public ProductsPage(WebDriver driver){
        super(driver);
    }

    private By inventoryItems = By.id("inventory_item");

    private By productItem = By.id("add-to-cart-sauce-labs-bike-light");
    public WebElement getProductItem(){
        return driver.findElement(productItem);
    }



    private By getProductCartButton = By.id("shopping_cart_badge");
    public WebElement getProductCartButton(){
        return driver.findElement(cartButton);
    }







}
