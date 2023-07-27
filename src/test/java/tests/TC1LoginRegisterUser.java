package tests;

import Pages.*;
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
        homePage.navigateToUrl(); //2. Navigate to url 'http://automationexercise.com'
        homePage.signupLoginButtonIsVisible(); //3. Verify that home page is visible successfully
        homePage.clickSignupLoginButton(); //4. Click on 'Signup / Login' button
        LoginPage loginPage = new LoginPage(driver);
        loginPage.newUserSignupIsVisible(); //5. Verify 'New User Signup!' is visible
        loginPage.registerNewUser(); //6. Enter name and email address //7. Click 'Signup' button
        EnterAccountInformationPage enterAccountInformationPage = new EnterAccountInformationPage(driver);
        enterAccountInformationPage.VisibilityofEnterAccountInformation(); //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        enterAccountInformationPage.fillUserData(); //9. 10. 11. 12. 13. Fill all details.
        AccountCreatedPage accountCreatedPage = new AccountCreatedPage(driver);
        accountCreatedPage.accountCreated(); //14. Verify that 'ACCOUNT CREATED!' is visible //15. Click 'Continue' button
        LoggedInAsUserPage loggedInAsUserPage = new LoggedInAsUserPage(driver);
        homePage.navigateToUrl();
        loggedInAsUserPage.deletedAccount(); //16. Verify that 'Logged in as username' is visible //17. Click 'Delete Account' button
        AccountDeletedPage accountDeletedPage = new AccountDeletedPage(driver);
        accountDeletedPage.checkAccountDeleted(); // 18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

    }

    @After
    public void teardown() {
        driver.close();
        driver.quit();
    }
}
