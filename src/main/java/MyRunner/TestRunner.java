package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "H:\\Selenium_Practice\\((Java&Selenium))\\Projects\\Eclipse\\BDD_CucumberFramework\\src\\main\\java\\Features", glue = {
		"stepDefinitions" }, monochrome = true, strict = true, dryRun = false)

public class TestRunner {

}