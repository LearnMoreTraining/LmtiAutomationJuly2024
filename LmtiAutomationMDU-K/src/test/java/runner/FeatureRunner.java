package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
       features = {"src/test/resources/featurefile"},
       glue = {"stepdefinition","hooks"},
        plugin = {"pretty",
                "html:target/test-output/report.html",
                "json:target/test-output/report.json",
                "junit:target/test-output/junitreport.xml"},
       tags = "@Amazon01"
)

public class FeatureRunner {
}
