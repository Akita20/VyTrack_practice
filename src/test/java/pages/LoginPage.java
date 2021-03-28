package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage extends BasePage {
//public LoginPage(){
//    PageFactory.initElements(Driver.getDriver(), this);
//}
    WebDriver driver= Driver.getDriver();

//    @FindBy(id = "login-form")
//    public WebElement loginPage;
    @FindBy(xpath ="//input[@name='_username']")
    public WebElement inputUsername;
    @FindBy(xpath ="//input[@name='_password']")
    public WebElement inputPassword;
    @FindBy(id ="_submit")
    public WebElement loginButton;


    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();
    }
    public void loginAsDriver(){


        inputUsername.sendKeys("user165");
        inputPassword.sendKeys("UserUser123");
        loginButton.click();
//        inputUsername.sendKeys(ConfigurationReader.getProperty("user165"));
//        inputPassword.sendKeys(ConfigurationReader.getProperty("UserUser123"));
//        loginButton.click();
    }
    public void loginAsSalesManager(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("salesmanager261"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("UserUser123"));
        loginButton.click();
    }
    public void loginAsStoreManager(){
        inputUsername.sendKeys(ConfigurationReader.getProperty("storemanager98"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("UserUser123"));
        loginButton.click();
    }


    }



