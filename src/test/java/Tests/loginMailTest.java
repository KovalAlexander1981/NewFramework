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
        Assert.assertEquals((new String(Constants.BASE_MESSAGE.getBytes("windows-1251"), "UTF-8")), app.afterLogin.getMessage());
    }
}
