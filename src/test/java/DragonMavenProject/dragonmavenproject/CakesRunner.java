package DragonMavenProject.dragonmavenproject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty" }, features = { "src/test/resources" })

public class CakesRunner
{

}
