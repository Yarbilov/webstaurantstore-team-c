package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.Driver;

import java.io.IOException;

import java.time.Duration;




public class TestBase {




    @BeforeMethod(alwaysRun = true)
    public void setUpEachMethod() throws IOException {
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.getDriver().get(ConfigReader.getProperty("homepage"));

    }



    @AfterMethod (alwaysRun = true)

    public void tearDownMethod(){
        Driver.quitDriver();
    }


}
