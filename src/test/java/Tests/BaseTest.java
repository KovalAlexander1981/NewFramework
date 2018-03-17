package Tests;

import Users.User;
import Users.UserFactory;
import org.testng.annotations.AfterSuite;


public class BaseTest {
   protected static User validUser= UserFactory.getValidUser();
    protected  static App app  = new App();

    @AfterSuite
    public void tearDownSuite() throws Exception {
  // app.common.stopApp();
    }

}
