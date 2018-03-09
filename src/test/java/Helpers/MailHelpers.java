package Helpers;

import Mail.Mail;
import Mail.MailFactory;
import Pages.AfterLoginPage;

/**
 * Created by Komp on 09.03.2018.
 */
public class MailHelpers extends AfterLoginPage{
    public void validMail(){
        Mail validNewMail = MailFactory.createMail();
        sendMail(validNewMail.getFiledTo(),validNewMail.getMailSubject(),validNewMail.getTextMessage());
    }
}
