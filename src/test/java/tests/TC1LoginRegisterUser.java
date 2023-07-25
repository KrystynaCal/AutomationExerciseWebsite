package tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1LoginRegisterUser {
    WebDriver driver;

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
        HomePage homePage = new HomePage(driver);
        homePage.navigateToUrl();
        homePage.signupLoginButtonIsVisible();
        homePage.clickSignupLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.newUserSignupIsVisible();
        loginPage.registerNewUser();
    }


    @After
    public void teardown() {
        driver.close();
        driver.quit();
    }
}
