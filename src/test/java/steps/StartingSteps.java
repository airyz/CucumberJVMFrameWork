package steps;

import cucumber.api.java.en.Given;
import util.DriverFactory;
import util.PropertyReader;

/**
 * Created by Eraclis Hadjiarapis on 2/1/2017.
 */



public class StartingSteps extends DriverFactory {
    @Given("^the user is on landing page$")
    public void setup() throws Throwable {
        String url = new PropertyReader().readProperty("url");
        driver.get(url);
        driver.manage().window().maximize();
    }

}