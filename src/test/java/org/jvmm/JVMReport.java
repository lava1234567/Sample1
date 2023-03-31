package org.jvmm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JVMReport {

	public static void generateJVMReport(String json) {
     File des=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\JVMreports");
     Configuration con=new Configuration(des, "WhatsApp");
     con.addClassifications("BrowserName","Chrome");
     con.addClassifications("AppliationName", "WhatsApp");
     con.addClassifications("Enviroment", "QA");
     List<String> jsonFiles=new LinkedList<String>();
     jsonFiles.add(json);
     ReportBuilder r=new ReportBuilder(jsonFiles, con);
     r.generateReports();
     
	}	
	
}
