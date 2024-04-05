package co.com.services.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = "src/test/resources/features/user.feature",
        glue = {"co.com.practice.stepDefinitions.hook",
                "co.com.services.stepDefinitions"
        }
)

public class Runner {
}
