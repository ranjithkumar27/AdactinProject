package com.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Feature",glue="com.definition",dryRun=false,monochrome=true,
plugin= {"junit:src\\test\\resources\\Reports\\LoginPage.xml",
		"json:src\\test\\resources\\Reports\\LoginPageJ.json",
		"html:src\\test\\resources\\Reports"},tags= {"@reg"})




public class TestRunner {

}
