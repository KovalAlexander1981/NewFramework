package Pages;


import Drivers.MyDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

  public  static MyDriver driver = MyDriver.getMyDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
        }
    }

