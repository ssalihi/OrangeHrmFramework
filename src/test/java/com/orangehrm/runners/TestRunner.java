package com.orangehrm.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;//is framework that similar to testNG, but very simple
// we will be specifying two annotation to run our test cases
@RunWith (Cucumber.class)
@CucumberOptions (features="src/test/resources/features/GoogleSearch.feature" , glue ="com/orangehrm/step")

public class TestRunner {

}
