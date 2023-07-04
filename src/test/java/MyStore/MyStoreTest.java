package MyStore;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features", plugin = {"pretty", "html:Testlog.html"}, tags = "@firstaddress")
public class MyStoreTest {
}
