package runner;

import core.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/", glue = "steps")
public class RunAllTest {
    @BeforeClass
    public static void setDriver() {
        DriverFactory.setDriver();
    }

    @AfterClass
    public static void closeDriver() {
        DriverFactory.closeDriver();
    }
}
