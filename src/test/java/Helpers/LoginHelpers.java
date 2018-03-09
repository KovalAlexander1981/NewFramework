package Helpers;

import Pages.LoginPage;
import Users.User;
import Users.UserFactory;

/**
 * Created by Komp on 04.03.2018.
 */
public class LoginHelpers extends LoginPage {
    public void loginValidUser(){
        User validUser = UserFactory.getValidUser();
      login(validUser.getLogin(),validUser.getPassword());
    }

}
