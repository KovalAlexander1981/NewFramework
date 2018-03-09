package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
  protected   static WebDriver driver;
    static {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.i.ua/");
    }
    public BasePage(){
        PageFactory.initElements(driver, this);
        }
    }

