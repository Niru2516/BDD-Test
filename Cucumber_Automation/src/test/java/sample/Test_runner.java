package sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome = true, //monochrome use  for remove garbage characters and junk character present inside the Blog
			// dryRun= true, //dryrun checks the all code are syntactically correct there is no configuration issue there is no missing step_def with respact to ur featurefile
            
			

					features = {"src/test/resources/com/basic/FirstFeatureFile"},	
					glue = {"sample"},
		            plugin= {"pretty",
		        		   "html:target/cucumber-html report",
		        		   "json:target/cucumber-report8.json",
		           		   "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"})
           
	
	public class Test_runner
	{
		
		
	}
