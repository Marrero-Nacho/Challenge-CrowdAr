package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import webDriverConfig.WebDriverManager;

public class Hooks {
    WebDriver driver = WebDriverManager.getDriver();

    @After
    public void tearDown(Scenario scenario) {
        if(driver!=null){
            if (scenario.isFailed()) {
                scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
            }
            driver.quit();
        }
    }
}
