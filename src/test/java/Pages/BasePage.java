package Pages;


import Drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

  public  static WebDriver driver = DriverFactory.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
        }
    }

