package Tests;

import com.company.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;


public class loginMailTest extends BaseTest {

    @Test
    public void loginTest() throws Exception {
       app.login.loginValidUser();
        Assert.assertEquals(app.afterLogin.getUserEmail(), validUser.getEmail());
    }

    @Test
    public void sendLetter() throws Exception {
        app.sendNewMassege.validMail();
        String a = app.afterLogin.getMessage();
        String newString = new String(a.getBytes("UTF-8"), "UTF-8");
        Assert.assertEquals(newString, Constants.BASE_MESSAGE);
    }

}
