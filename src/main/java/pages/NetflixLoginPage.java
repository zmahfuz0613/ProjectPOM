package pages;

import org.openqa.selenium.By;
import util.TestUtil;

public class NetflixLoginPage {

    TestUtil ut = new TestUtil();
    String baseURL = "https://www.netflix.com/login";

    By inputUserName = By.id("id_userLoginId");
    By inputPassword = By.id("id_password");
    By clickSignIn = By.xpath("//div[@class=\"hybrid-login-form-main\"]//button[@class=\"btn login-button btn-submit btn-small\"]");

    public void goToLoginPage() {
        ut.navigateTo(baseURL);
    }

    public void inputUserName() {
        ut.insertUserName(inputUserName, "zunayed.eshna@gmail.com");
    }

    public void inputPassword() {
        ut.insertPassword(inputPassword, "eshna1357");
    }

    public void clickLogin() {
        ut.clickLogin(clickSignIn);
    }

}
