package org.flip;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Fb.feature", 
glue = "org.flip", monochrome = true, dryRun = false , 
tags="@Fb", snippets = SnippetType.CAMELCASE

)
public class TestRunnerClass {

}
