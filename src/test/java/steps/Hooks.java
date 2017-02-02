package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import util.DriverFactory;

/**
 * Created by Eraclis Hadjiarapis on 2/2/2017.
 */
public class Hooks extends DriverFactory {
//    @Before("@Signup-DataDriven")
//    public void beforeScenario(){
//        System.out.println("this will run before the actual scenario");
//    }

    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
        System.out.println("this will run before the actual scenario");
    }
    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
        System.out.println("this will run after scneario is finished, even if it failed");
    }

}
