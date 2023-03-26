package tests;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.ConfigReader;
import utils.Driver;
import utils.SeleniumUtils;

import java.io.IOException;

import java.lang.reflect.Method;
import java.time.Duration;




public class TestBase {


    protected static ExtentReports extentReport;
    protected static ExtentSparkReporter htmlReport;
    protected static ExtentTest logger;



    @BeforeSuite(alwaysRun = true)
    public void setupReport(){

        extentReport = new ExtentReports();
        htmlReport = new ExtentSparkReporter(System.getProperty("user.dir") + "/target/extentReports/report.html");
        extentReport.attachReporter(htmlReport);
        extentReport.setSystemInfo("Name", "Web Orders Automated Tests");
        extentReport.setSystemInfo("SDET", "Team_C");
        extentReport.setSystemInfo("Environment", ConfigReader.getProperty("env"));
        extentReport.setSystemInfo("Browser", ConfigReader.getProperty("browser"));
        extentReport.setSystemInfo("OS", System.getProperty("os.name"));
        extentReport.setSystemInfo("URL", ConfigReader.getProperty("homepage"));
    }



    @BeforeMethod(alwaysRun = true)
    public void setUpEachMethod(Method method) throws IOException {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().get(ConfigReader.getProperty("homepage"));
        logger = extentReport.createTest(method.getName());

    }




    @AfterMethod (alwaysRun = true)

    public void tearDownMethod(ITestResult testResult){

        if(testResult.getStatus() == ITestResult.SUCCESS){
            logger.pass("TEST PASSED");
        }else if(testResult.getStatus() == ITestResult.FAILURE){
            logger.fail("TEST FAILED");
            logger.fail(testResult.getThrowable());
            logger.addScreenCaptureFromPath(SeleniumUtils.getScreenshot("failed"));
        }else {
            logger.skip("TEST SKIPED");
        }

        Driver.quitDriver();
    }



    @AfterSuite(alwaysRun = true)
    public void tearDownReport(){
       extentReport.flush();
    }


}
