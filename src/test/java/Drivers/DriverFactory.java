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
            driver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
           driver = new ChromeDriver();
        }
      driver.get(Constants.BASE_URL);
      driver.manage().window().maximize();
        return driver;

    }
}