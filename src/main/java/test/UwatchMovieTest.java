package test;

import org.testng.annotations.Test;
import pages.UwatchMoviePage;
import util.TestBase;

public class UwatchMovieTest extends TestBase {
    UwatchMoviePage page = new UwatchMoviePage();

    @Test
    public void MovieTest() {
        page.goToHomePage();
        page.clickSignIn();
    }
}
