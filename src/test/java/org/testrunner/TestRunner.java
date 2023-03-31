package org.testrunner;

import org.jvmm.JVMReport;
import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src\\test\\resources\\Features", 
glue="org.stepdefinition",monochrome=true,
dryRun=false,
                          
plugin= {"pretty","junit:src\\test\\resources\\junitreport\\report.xml",
		"json:src\\test\\resources\\jsonReport\\report.json",
		 "html:src\\test\\resources\\htmlreport"
         }
)

public class TestRunner extends AbstractTestNGCucumberTests {
	
//	@AfterClass
//	private void jvmReport() {
//
//		JVMReport.generateJVMReport("src\\test\\resources\\jsonReport\\report.json");
//	    System.out.println(".............Report Generated......");
//	}

}
