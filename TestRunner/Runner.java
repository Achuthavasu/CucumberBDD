package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\IdeaProjects\\CucumberBDD\\src\\test\\java\\Feature",
        glue = "stepDefinition",
        dryRun = false,
        tags = "@sanity",
        monochrome = true,
        plugin = {"pretty", "html:target/CucumberReport.html"})
public class Runner {
//    this class will be empty
}
