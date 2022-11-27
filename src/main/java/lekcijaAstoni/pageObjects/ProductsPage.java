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

    private By productItem = By.id("iitem_0_ttle_link");
    public WebElement getProductItem(){
        return driver.findElement(productItem);
    }
    public void clickOnProductItem(){
        driver.findElement((productItem)).click();
    }


    private By addToCart = By.id("add-to-cart-sauce-labs-bike-light");
    public WebElement getAddToCart(){
        return driver.findElement(addToCart);
    }
    public void clickOnAddToCart(){
        driver.findElement(addToCart).click();
    }






}
