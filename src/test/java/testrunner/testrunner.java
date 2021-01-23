package testrunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.baseclass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import stepdefinition.stepbulider;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\feature",glue="src\\test\\java\\stepdefinition",strict=true,dryRun=false)


public class testrunner extends baseclass {
	//public static WebDriver driver;
@BeforeClass
public static void brower() {
	// TODO Auto-generated method stub
browerlaunch();
}
}
