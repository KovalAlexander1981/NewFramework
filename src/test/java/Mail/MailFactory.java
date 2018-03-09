package Mail;


import java.util.ResourceBundle;



    public class MailFactory {

        public static Mail createMail(){
            ResourceBundle resourceBundle = ResourceBundle.getBundle("mail");
            return new Mail(resourceBundle.getString("filedTo"),
                    resourceBundle.getString("mailSubject"),
                    resourceBundle.getString("textMessage"));
        }
    }


