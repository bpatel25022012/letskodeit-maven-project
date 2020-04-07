package learn.com.letskodeit.testsuit;

import learn.com.letskodeit.pages.HomePage;
import learn.com.letskodeit.pages.LoginPage;
import learn.com.letskodeit.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
Created By Bhavesh
*/public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test

    public void userShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedText = "Log In to Let's Kode It";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(expectedText, actualText);
    }
}