package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\CV\\eclipse-workspace\\CucumberProj\\src\\main\\java\\Features\\hooks.feature",glue= {"StepDefinitions"}
, plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml",
		 "html:target/cucumber-reports"},
		 monochrome = true, dryRun=false, strict=true 
		 //,tags = {"@SmokeTest", "~@Regressiontest"}
)
public class TestRunner {

}
