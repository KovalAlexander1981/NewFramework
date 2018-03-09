package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AfterLoginPage extends BasePage{

	@FindBy(xpath = "//li/span[@class='sn_menu_title']")
	private WebElement userEmail;

	@FindBy(xpath = "//p[@class='make_message']/a")
	private WebElement createMessage;

	@FindBy(xpath = "//div[@class='to']//textarea")
	private WebElement filedTo;

	@FindBy(xpath = "//span[@class='field']/input[@type='text']")
	private WebElement mailSubject;

	@FindBy(xpath = "//div[@class='text_editor_browser']//textarea[@name='body']")
	private WebElement textMessage;

	@FindBy(xpath = "//input[@name='send']")
	private WebElement btnSend;

	public void  sendMail(String  name, String subject, String topic){
		createMessage.click();
		filedTo.sendKeys(name);
		mailSubject.sendKeys(subject);
		textMessage.sendKeys(topic);
		btnSend.click();

	}
	@FindBy(xpath = "//div[@class='block_confirmation']//div[@class='content clear']")
	private WebElement afterSendMessage;



	public String getUserEmail(){
        return userEmail.getText();
    }

    public String getMessage(){return afterSendMessage.getText();}
}
