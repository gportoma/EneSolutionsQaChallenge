package runner;

import core.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/", tags = "@busca", glue = "steps")
public class BuscaTest {
    @BeforeClass
    public static void setDriver() {
        DriverFactory.setDriver();
    }

    @AfterClass
    public static void closeDriver() {
        DriverFactory.closeDriver();
    }
}
