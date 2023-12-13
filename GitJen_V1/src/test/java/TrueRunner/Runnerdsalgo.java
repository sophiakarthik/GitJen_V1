package TrueRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature",
		 glue= {"Stepdefinition","AppHooks"},
monochrome=true,plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Runnerdsalgo {
	

}
//"/src/test/resources/Feature/Signinbutton.feature"
//"html:target/htmlReports/reports.html"
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"