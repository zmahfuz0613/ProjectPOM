package test;

import org.testng.annotations.Test;
import pages.UwatchMoviePage;
import util.TestBase;

public class UwatchMovieTest extends TestBase {
    UwatchMoviePage page = new UwatchMoviePage();

    @Test(priority = 1)
    public void UwatchMovieTest() {
        page.goToHomePage();
        page.clickSignIn();
    }

    @Test(priority = 2)
    public void NetflixTest() {
        page.goToLoginPage();
        page.inputUserName();
        page.inputPassword();
        page.clickLogin();
    }
}
