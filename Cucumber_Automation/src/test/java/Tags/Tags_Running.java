package Tags;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



	@RunWith(Cucumber.class)
	@CucumberOptions(
			monochrome = true, //monochrome use  for remove garbage characters and junk character present inside the Blog
			// dryRun= true, //dryrun checks the all code are syntactically correct there is no configuration issue there is no missing step_def with respact to ur featurefile
            
			tags= {"@Regression,@Smoke"},
			features = {"src/test/resources/com/basic/TagsFF"},	
			glue = {"Tags"},
            plugin= {"pretty",
        		   "html:target/cucumber-html report",
        		   "json:target/cucumber-report10.json",
           		   "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"})
           
	public class Tags_Running 
	{
			
				
					
	}
