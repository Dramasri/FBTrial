package org.testrunner;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void reportGen(String json) {
		
		
		File f = new File("D:\\Photon\\FaceBookTrial\\targets\\jvm-report");
		
		Configuration con = new Configuration(f, "JVMReports");
		
		con.addClassifications("sprint", "22");
		
		con.addClassifications("browser", "chrome");
		
		con.addClassifications("windows", "os");
		
		List<String> li = new LinkedList<String>();
		
		li.add(json);
		
		ReportBuilder rb = new ReportBuilder(li, con);
		
		rb.generateReports();
		
	}

}
