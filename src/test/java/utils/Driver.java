package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {


    private static WebDriver driver;

    private Driver(){}

    public static WebDriver getDriver() {

        String browser = System.getProperty("browser");

        if(browser == null) {
            browser = ConfigReader.getProperty("browser");
        }
        if(driver == null) {

            switch (browser) {
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    driver = new ChromeDriver(options);
                    break;
                case "headlessChrome":
                    ChromeOptions chromeOptionsoptions = new ChromeOptions();
                    chromeOptionsoptions.addArguments("--remote-allow-origins=*");
                    chromeOptionsoptions.addArguments("--headless");
                    driver = new ChromeDriver(chromeOptionsoptions);
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                case "headlessEdge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.addArguments("--headless");
                    driver = new EdgeDriver(edgeOptions);
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "safari":
                    driver = new SafariDriver();
                    break;
                default:
                    throw new RuntimeException("Invalid Browser");
            }
        }

        return driver;
    }


    public static void quitDriver(){

        if(driver != null){
            driver.quit();
            driver = null;
        }

    }

}
