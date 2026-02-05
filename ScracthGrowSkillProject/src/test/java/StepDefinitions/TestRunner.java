package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/java/FeatureFiles",
	glue={"StepDefinitions"},
	tags="@smoke1",
	dryRun=false,
	monochrome = false,
	plugin= {"pretty", "html:target/htmlReport/index.html",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)

public class TestRunner {

}
