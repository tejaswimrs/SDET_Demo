package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\Login"},
glue={"definition"},
monochrome=true,
plugin = {"html:testoutput/output.html","junit:testoutput/output.xml","json:testoutput/output.json"})

public class Test_Runner {

}
