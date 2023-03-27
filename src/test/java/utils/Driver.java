package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class Driver {


    private static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();

    private Driver() {
    }

    public static synchronized WebDriver getDriver() {

        String browser = System.getProperty("browser");

        if (browser == null) {
            browser = ConfigReader.getProperty("browser");
        }
        if (drivers.get() == null) {

            switch (browser) {
                case "chrome":
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    drivers.set(new ChromeDriver(chromeOptions));
                    break;
                case "headlessChrome":
                    ChromeOptions chromeOptions1 = new ChromeOptions();
                    chromeOptions1.addArguments("--remote-allow-origins=*");
                    chromeOptions1.addArguments("--headless");
                    drivers.set(new ChromeDriver(chromeOptions1));
                    break;
                case "edge":
                    EdgeOptions edgeOptions = new EdgeOptions();
                    drivers.set(new EdgeDriver(edgeOptions));
                    break;
                case "headlessEdge":
                    EdgeOptions edgeOptions1 = new EdgeOptions();
                    edgeOptions1.addArguments("--headless");
                    drivers.set(new EdgeDriver(edgeOptions1));
                    break;
                case "firefox":
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    drivers.set(new FirefoxDriver(firefoxOptions));
                    break;
                case "headlessFirefox":
                    FirefoxOptions firefoxOptions1 = new FirefoxOptions();
                    firefoxOptions1.addArguments("--headless");
                    drivers.set(new FirefoxDriver(firefoxOptions1));
                    break;
                case "safari":
                    SafariOptions safariOptions = new SafariOptions();
                    drivers.set(new SafariDriver(safariOptions));
                    break;
                default:
                    throw new RuntimeException("Invalid Browser");
            }
        }

        return drivers.get();
    }


    public synchronized static void quitDriver() {

        if (drivers.get() != null) {
            drivers.get().quit();
            drivers.remove();
        }

    }

}
