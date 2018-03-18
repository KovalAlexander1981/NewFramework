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


    public void  login(String  name, String password){
		driver.jsSetValue(inputLogin, name);
      //  inputLogin.sendKeys(name);
        driver.jsSetValue(inputPassword, password);
		//inputPassword.sendKeys(password);
        btnLogin.click();
    }

}
