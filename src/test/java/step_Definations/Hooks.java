package step_Definations;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {

    @Before(order = 1)// make shore get annotation import from  cucumber one

    public void setUpScenario() {
        String url= ConfigurationReader.getProperty("VyTrackUrl");
        Driver.getDriver().get(url);
        System.out.println("----Setting up browser with further details...");
    }

//    @Before(value = "@db", order = 1)
//    public void setUpDatabase() {
//        System.out.println("------Connecting to Database");
//    }

    @After(value = "@db", order = 2)
    public void closeDBConnection() {

        System.out.println("-----Take a screenshot");
        System.out.println("-------Closing browser");
    }

    @After(order = 1)
    public void tearDownScenario(Scenario scenario){
        //if my scenario failed
        // go and take screen shot

        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }

        // BrowserUtils.sleep(1);
        Driver.closeDriver();

    }

    @BeforeStep
    public void runBeforeSteps(){
        System.out.println("________________Running Before Each STEP ________________");

    }

    @AfterStep
    public void runsAfterSteps(){
        System.out.println("________________Running AFTER Each STEP ________________");
    }

}


