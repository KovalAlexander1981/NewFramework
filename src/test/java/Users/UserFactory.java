package Users;


import java.util.ResourceBundle;

public class UserFactory {

  public static User  getValidUser(){
      ResourceBundle resourceBundle = ResourceBundle.getBundle("user");
     return new User(resourceBundle.getString("login"),
             resourceBundle.getString("password"),
             resourceBundle.getString("email"));
  }
}
