 package runner;




import io.cucumber.testng.CucumberOptions;
import tests.testbase;
@CucumberOptions(features ={"src/test/java/features"},glue = {"steps"},plugin = {"pretty","html:target/cucumber-html-report"}) 
public class TestRunner extends testbase 
{
	
	 

}
