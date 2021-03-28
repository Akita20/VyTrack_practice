package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FleetPage extends BasePage{


    @FindBy(xpath = "//*[@id='main-menu']/ul/li[1]/a/span")
    public List<WebElement> listOfFleetCategories;
}

//
