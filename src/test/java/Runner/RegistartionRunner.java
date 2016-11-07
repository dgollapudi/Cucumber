package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by dgollapudi on 03/11/2016.
 */
    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/",
            glue = "definitions",
            plugin = { "html:target/cucumber-html-report"},
            tags = {"@COM","@desktop"}

    )

    public class RegistartionRunner {
    }

