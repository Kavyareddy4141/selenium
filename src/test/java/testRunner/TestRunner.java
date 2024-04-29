package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\Features\\Tags.feature",
                glue="stepdefinition",
                plugin= {"pretty","html:target/cucumber-reports"},
                dryRun=true,
                monochrome=false,
                tags="@smoke"
                )

public class TestRunner {

}
