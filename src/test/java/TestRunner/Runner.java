package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Feature/Login.feature",
		glue="Test",	
		plugin= {"pretty","html:target/HtmlReports.html"},
		dryRun=false,
		monochrome=true
		)
public class Runner {

}
