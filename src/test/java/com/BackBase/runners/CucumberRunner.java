package com.BackBase.runners;
import com.BackBase.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/BackBase/step_definitions",
        dryRun = false,
        tags = "",
        plugin = "json:target/cucumber.json"
)
public class CucumberRunner {
}