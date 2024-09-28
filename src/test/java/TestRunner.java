import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/features",
//        glue = "stepdefinitions",
//        plugin = {"pretty","json:target/cucumber.json"},
//        monochrome = true,
//        tags = "~@ignore")
@CucumberOptions(publish = true,
        features = {"src/test/resources/features"},
        glue = {"stepdefinitions"},
        plugin = {"json:target/cucumber.json"})
public class TestRunner {


}
