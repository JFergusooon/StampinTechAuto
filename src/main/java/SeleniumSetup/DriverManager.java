package SeleniumSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private static ChromeDriver driver;

    private DriverManager() {} // prevent creating objects of this class

    public static void startDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "C:/Program Files/chromedriver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    }

    public static ChromeDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("Driver not started. Call startDriver() first.");
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}

