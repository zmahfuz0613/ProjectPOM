package test;

import org.testng.annotations.Test;
import pages.NetflixLoginPage;
import util.TestBase;

public class LoginPageTest extends TestBase
{
    NetflixLoginPage page = new NetflixLoginPage()git ;
    @Test(priority = 2)
    public void NetflixTest() {
        page.goToLoginPage();
        page.inputUserName();
        page.inputPassword();
        page.clickLogin();
    }
}
