package DemoSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true, 
		

				features = {"src/test/resources/Demo"},	
				glue = {"DemoSD"},
	            plugin= {"pretty",
	        		   "html:target/cucumber-html report",
	        		   "json:target/cucumber-report8.json",
	           		   "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport8.html"})
       
public class Demo_running 
{

}
