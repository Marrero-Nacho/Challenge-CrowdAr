package steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/sauceDemoLogin.feature",
                "src/test/resources/features/webServiceML.feature",
                "src/test/resources/features/sauceDemoShoppingCart.feature"
        },
        glue = {"steps"},
        //plugin = { "html:target/reports.html"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@Test"
)

public class RunClass {
}
