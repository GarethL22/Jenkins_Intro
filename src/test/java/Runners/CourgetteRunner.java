package Runners;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.CucumberOptions;
import courgette.api.junit.Courgette;
import org.junit.runner.RunWith;

@RunWith(Courgette.class)
@CourgetteOptions(
        threads = 2,
        runLevel = CourgetteRunLevel.FEATURE,
        rerunFailedScenarios = true,
        rerunAttempts = 1,
        reportTargetDir = "target",
        classPath = {"target/libs/*", "target/test-classes/"},
        cucumberOptions = @CucumberOptions(
                features = {"src/test/resources/Features"},
                glue = {"StepDefinition"},
                tags = {"@MyFeatureTag"}
        ))
public class CourgetteRunner {
}
