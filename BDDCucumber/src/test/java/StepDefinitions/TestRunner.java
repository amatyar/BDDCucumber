package StepDefinitions;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",glue= {"StepDefinitions"}
//plugin= {"pretty", 
//		"junit:target/JUnitReports/report.xml",
//"json:target/JSONReports/report.json",
//"html:target/HtmlReports"},
//tags = "@smoketest"		
//		
		)
public class TestRunner {
	
}
