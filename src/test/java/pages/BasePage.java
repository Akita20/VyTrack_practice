package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage extends PageGenerator{
    @FindBy(id = "login-form")
    public WebElement loginPage;
    @FindBy (xpath = "//a[@title='Fleet Management']")
    public WebElement fleetManagement;


    @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleet;

    @FindBy (xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement Customers;

    @FindBy (xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement Activities;

    @FindBy (xpath = "(//span[@class='title title-level-1'])[4]")
    public WebElement System;

    @FindBy (xpath = "//h1[@class='oro-subtitle']")
    public WebElement QuickLaunchpad;

}
