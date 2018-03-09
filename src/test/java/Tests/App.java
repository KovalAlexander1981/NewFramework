package Tests;

import Helpers.AfterLoginHelper;
import Helpers.CommonHelper;
import Helpers.LoginHelpers;
import Helpers.MailHelpers;


public class App {
    public LoginHelpers login;
   public AfterLoginHelper afterLogin;
    public CommonHelper  common;
    public MailHelpers sendNewMassege;



    public App() {
        sendNewMassege = new MailHelpers();
        login = new LoginHelpers();
       afterLogin =  new AfterLoginHelper();
        common = new CommonHelper();
    }
}
