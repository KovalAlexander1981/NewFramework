package Users;


import java.util.ResourceBundle;

public class UserFactory {

  public static User  getValidUser(){
      ResourceBundle resourceBundle = ResourceBundle.getBundle("user");
     return new User(resourceBundle.getString("login"),
             resourceBundle.getString("password"),
             resourceBundle.getString("email"));
  }
 // public static List<Object> getValidUserList(int count){
   //   return generate(UserFactory::getValidUser).limit(count).collect(Collectors.toList());
  //}  создание рандомного колва юзеров
}
