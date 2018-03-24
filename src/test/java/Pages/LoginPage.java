package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{
	@FindBy(name = "login")
	private WebElement inputLogin;

	@FindBy(name = "pass")
	private WebElement inputPassword;

	@FindBy(xpath = "//form[@name='lform']//input[@type='submit']")
	private WebElement btnLogin;

	@FindBy(name = "domn")
	private WebElement domn;



    public void  login(String  name, String password){
		log.info("set input name - " + name);
		driver.jsSetValue(inputLogin, name);
       //inputLogin.sendKeys(name);
		log.info("set input password - " + password);
        driver.jsSetValue(inputPassword, password);
		//inputPassword.sendKeys(password);
		//Select select = new Select(domn);
		//select.selectByVisibleText("");

        btnLogin.click();
    }

}
