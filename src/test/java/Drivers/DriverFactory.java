package Drivers;

import com.company.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverFactory {
    public static WebDriver driver;

    public static WebDriver getDriver() {

        String property = System.getProperty("driver");
        if ("firefox".equals(property)) {
            System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
            DriverFactory.driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            DriverFactory.driver = new ChromeDriver();
        }
        DriverFactory.driver.get(Constants.BASE_URL);
        DriverFactory.driver.manage().window().maximize();
        return DriverFactory.driver;

    }
}