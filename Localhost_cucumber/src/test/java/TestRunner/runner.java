package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="D:\\suvarna_eclipse\\Localhost_cucumber\\src\\test\\java\\features\\get.feature",
        glue =  {"StepDefination"},
        dryRun = false
)
public class runner {
	

}
