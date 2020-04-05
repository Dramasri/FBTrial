package org.testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources",glue="com.step", plugin= {"json:targets\\cucumber-report1.json"})


public class TestRun {
	
	@AfterClass
	
	public static void reports() {
		
		
		JVMReport.reportGen("D:\\Photon\\FaceBookTrial\\targets\\cucumber-report1.json");
		
	}

}
