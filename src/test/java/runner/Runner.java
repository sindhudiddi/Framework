package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features = {"src/test/java/Features"},format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},glue = "steps")
public class Runner extends AbstractTestNGCucumberTests  {

}
//,format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},




