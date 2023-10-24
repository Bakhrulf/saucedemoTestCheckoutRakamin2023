package saucedemoOtomasiRakamin.cucumber.runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/saucedemoOtomasiRakamin/cucumber/feature",
        glue = "saucedemoOtomasiRakamin.cucumber.stepDef",
        plugin = {"html:target/HTML_report.html"}

)
public class runTestCheckout  {
}
