package step_Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FleetPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Login_StepDefination extends LoginPage {

    LoginPage loginPage= new LoginPage();
    FleetPage fleetPage= new FleetPage();
    Actions actions= new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

   @Given("user is on the login page")
   public void userIsOnTheLoginPage() {
//    String url= ConfigurationReader.getProperty("VyTrackUrl");
//       Driver.getDriver().get(url);
    //   loginPage.loginAsDriver();
    }


    @Given("user login with {string} and {string}")
    public void userLoginWithAnd(String username, String password) {
        loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty(username));
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty(password));
        loginPage.loginButton.click();

    }

    @Given("truck driver login with {string} and {string}")
    public void truckDriverLoginWithAnd(String username, String password) {
//       loginPage.inputUsername.sendKeys(ConfigurationReader.getProperty(username));
//     loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty(password));
//      loginPage.loginButton.click();
        loginPage.loginAsDriver();

    }

    @When("truck driver see all Vehicle information")
    public void truckDriverSeeAllVehicleInformation() {
//Basically we are comparing  list of strings and webElements
        //expected: List<String> expectedList
        //actual : BrowserUtils.getElementsText(monthDropdown.getOptions()) --> Returns List <String>
//fleetPage.fleet.click();
//select= new Select((WebElement) fleetPage.listOfFleetCategories);
//        List<WebElement> webElements= select.getOptions();
//        List<String> actualText= BrowserUtils.convertWebElementToString_andGetText(webElements);
//
//        Assert.assertEquals(options,actualText);
        BrowserUtils.hover(fleetPage.fleet);
        BrowserUtils.sleep(3);
        actions.moveByOffset(0, 50).click().perform();//
       // BrowserUtils.sleep(3);




    }

    @And("truck driver can  see general information by clicking any car")
    public void truckDriverCanSeeGeneralInformationByClickingAnyCar() {
      //fleetPage.listOfFleetCategories.
    }

    @And("truck driver can  add Event")
    public void truckDriverCanAddEvent() {
    }

    @Then("Truck driver can  reset the setting")
    public void truckDriverCanResetTheSetting() {
    }


}
