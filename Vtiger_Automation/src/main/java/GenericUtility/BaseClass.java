package GenericUtility;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	public static ExtentReports eReport;

	public JavaUtility jUtil=new JavaUtility();
	
	@BeforeSuite
	public void reportConfig() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/extentReport_"+jUtil.getSystemtTime()+".html");
		eReport=new ExtentReports();
		eReport.attachReporter(spark);
	}
	
	@AfterSuite
	public void reportBackup() {
		eReport.flush();
	}
}
