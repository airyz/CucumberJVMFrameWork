package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Eraclis Hadjiarapis on 2/1/2017.
 */

//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/features/", tags = "@Signup-DataDriven, @Signup-Simple")

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"},
        glue = { "steps" })
public class RunFeaturesTest {

}

