package steps;

import cucumber.api.java.en.Given;
import util.DriverFactory;

/**
 * Created by Eraclis Hadjiarapis on 2/1/2017.
 */



public class StartingSteps extends DriverFactory {
    @Given("^the user is on landing page$")
    public void setup() throws Throwable {
        driver.get("http://accountsdemo.herokuapp.com");
        driver.manage().window().maximize();
    }

}