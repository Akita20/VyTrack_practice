package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BrowserUtils {

    public static void sleep(int seconds){

        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    /*
   Method to assert title
    */
    public static void titleVerification(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals(expectedTitle));

    }
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elementText = new ArrayList<>();
        for (WebElement el : list) {
            elementText.add(el.getText());
        }
        return elementText;

    }

    public static void switchToWindows(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    //this method accepts List<WebElement> and returns List<String>
    public static List<String> convertWebElementToString_andGetText(List<WebElement> elements) {
        List<String> textsOfWebElement = new LinkedList<>();

        for (WebElement element : elements) {
            textsOfWebElement.add(element.getText());
        }
        return textsOfWebElement;
    }

}
