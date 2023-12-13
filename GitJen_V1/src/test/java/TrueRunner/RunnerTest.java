package TrueRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",
		 glue= {"Stepdefinition","AppHooks"},
monochrome=true,plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunnerTest extends AbstractTestNGCucumberTests{
	@Override
	@DataProvider(parallel=true)
	public Object [][] scenarios(){
		return super.scenarios();
		}
	}
	


//"/src/test/resources/Feature/Signinbutton.feature"
//"html:target/htmlReports/reports.html"