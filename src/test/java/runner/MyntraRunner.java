package runner;


	
	import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/Features"
			,glue={"src/test/java/StepDef"}, plugin= {"pretty", "html:target/cucumber-reports/cucumberreport-pretty", "json:target/cucumber-reports/CucumberTextReport.json",
					"rerun:target/cucumber-reports/rerun.txt"}
			)
	public class MyntraRunner {
		

	}


