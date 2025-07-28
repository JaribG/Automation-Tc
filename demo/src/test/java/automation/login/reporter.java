package automation.login;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class reporter {

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter sparkReporter;

    @BeforeSuite
    public void setup() {
        sparkReporter = new ExtentSparkReporter("target/extent-reports/extent.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
    }

    @AfterSuite
    public void tearDown() {
        if (extentReports != null) {
            extentReports.flush();
        }
    }
}
