package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PageGenerator {
    // created Constructor of Class Itself to be able to call the Elements and do some actions
    public PageGenerator(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
