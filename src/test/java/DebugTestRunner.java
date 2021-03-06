import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features = {"./src/test/resources/features/LogInJenkins.feature"},
        format = { "pretty"},
        monochrome = true,
        glue = { "com.automation.steps" }
)
public class DebugTestRunner {
}
