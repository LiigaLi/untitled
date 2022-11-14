package lekcijaSeptini.labDarbs;

import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
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
    static int counter;

    @BeforeMethod
        public void openBrowser(){

        parluks = new ChromeDriver();
        parluks.get("https://www.saucedemo.com");
        parluks.manage().window().maximize();
        counter++;
    }
    @AfterMethod
    public void quitBrowser(){
        parluks.quit();
        System.out.println("*** Tests pabeigts ***\n");
    }

    @Test
    public void testLoginPageObjectExample(){
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.getPasswordField().sendKeys("secret_sauce");
        loginPage.getUsernameField().sendKeys("asdadad");
        loginPage.getLoginButton().click();
        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username and password do not match any " +
                "user in this service");

    }

    @Test
    public void testRightLogin() throws InterruptedException {
        System.out.println("Selenium tests #" + counter + " - weblapas " + parluks.getCurrentUrl() + " pareiza login pārbaude");

        WebElement loginField = parluks.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");

        WebElement passwordField = parluks.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = parluks.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(1000);
    }

    @Test
    public void testWrongLogin() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + parluks.getCurrentUrl() + " nepareiza login pārbaude");

        WebElement loginField = parluks.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");

        WebElement passwordField = parluks.findElement(By.id("password"));
        passwordField.sendKeys("secret_sausage");

        WebElement loginButton = parluks.findElement(By.id("login-button"));
        loginButton.click();

        WebElement errorMessage = parluks.findElement(By.cssSelector("div.error-message-container h3"));
        String expectedText = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(errorMessage.getText(), expectedText);

        Thread.sleep(1000);
    }
    @Test
    public void testCorrectLogin() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + parluks.getCurrentUrl() + " pareiza login pārbaude");
        userLoginAndPassword("performance_glitch_user", "secret_sauce");

        Thread.sleep(1000);
    }

    @Test
    public void testWithoutLogin() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + parluks.getCurrentUrl() + " tukša login lauka pārbaude");
        userLoginAndPassword("", "secret_sauce");
        validateErrorMessage("Epic sadface: Username is required");

        Thread.sleep(1000);
    }

    @Test
    public void testWithoutPassword() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + parluks.getCurrentUrl() + " tukša paroles lauka pārbaude");
        userLoginAndPassword("problem_user", "");
        validateErrorMessage("Epic sadface: Password is required");

        Thread.sleep(1000);
    }

    @Test
    public void testEmptyLoginAndPassword() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + parluks.getCurrentUrl() + " tukšu login un paroles un lauku pārbaude");
        userLoginAndPassword("", "");
        validateErrorMessage("Epic sadface: Username is required");

        Thread.sleep(1000);
    }

    // metodes
    private void userLoginAndPassword(String login, String password){

        WebElement loginField = parluks.findElement(By.id("user-name"));
        loginField.sendKeys(login);

        WebElement passwordField = parluks.findElement(By.id("password"));
        passwordField.sendKeys(password);

        pressLoginButton();
    }

    private void validateErrorMessage(String expectedText){
        WebElement errorMessage = parluks.findElement(By.cssSelector("div.error-message-container h3"));
        Assert.assertEquals(errorMessage.getText(), expectedText);
    }

    private void pressLoginButton(){
        WebElement loginButton = parluks.findElement(By.id("login-button"));
        loginButton.click();
    }

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new LoginPage(parluks);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage produktuLapa = new ProductsPage(parluks);
        //wait.until(ExpectedConditions.visibilityOf(produktuLapa.getPageTitle()));
        Assert.assertEquals(produktuLapa.getPageTitle().getText(), "PRODUCTS");

    }

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
        testLogin("", "sfvsdtr", "Epic sadface: Username and password do not match" +
                " any user in this service");

    }
    //aizpildīts lietotājvārds, parole tukša - pārbaudām kļūdu
    @Test
    public void testLoginFilledUsernameAndEmptyPassword () {
        testLogin("testtest", "", "Epic sadface: Username and password do not match any user in this service");
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
