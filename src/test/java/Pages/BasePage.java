package Pages;


import Drivers.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

  public  static MyDriver driver = MyDriver.getMyDriver();
    protected  Logger log = Logger.getLogger(this.getClass().getSimpleName());


    public BasePage(){
        PageFactory.initElements(driver, this);
        }
    }

