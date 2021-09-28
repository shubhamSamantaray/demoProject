package base;
import com.aventstack.extentReports.ExtentReports;
import com.aventstack.extentReports.reporter.ExtentSparkReporter;
import com.aventstack.extentReports.reporter.configuration.Theme;

public class ExtentReportingClass {
  static ExtentReports report;
  
  public static ExtentReports extentReportingInitialiZation(){

    String path = System.getProperty("user.dir");

    ExtentSparkReporter htmlReporter;

    //Reporting
    htmlReporter = new ExtentSparkReporter(path +"\\test-output\\reports\\TestReport.html");

    htmlReporter.config().setDocumentTitle("Report Demo");
    htmlReporter.config().setReportName("Test Report");
    htmlReporter.config().setTheme(Theme.STANDARD);
    htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd,YYYY,hh:mm a '('zzz')'");

    report = new ExtentReports();
    report.attach

  }
  
}
