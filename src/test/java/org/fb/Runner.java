package org.fb;

import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Facebook.feature",
    glue = "org.fb",
    monochrome = true, tags ="@FB", dryRun = false
)
public class Runner {
}
