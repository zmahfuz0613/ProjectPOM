package pages;

import org.openqa.selenium.By;
import util.TestUtil;

public class UwatchMoviePage extends NetflixLoginPage{
    TestUtil ut = new TestUtil();
    String baseURL = "https://www.netflix.com";
    //Click login
    By signIn = By.xpath("//div[@class=\"our-story-container\"]/div/div/a[@data-uia=\"header-login-link\"]");

    public void goToHomePage() {
        ut.navigateTo(baseURL);
    }

    public void clickSignIn() {
        ut.clickElement(signIn);
    }

}
