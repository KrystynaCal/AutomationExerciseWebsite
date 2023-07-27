package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountDeletedPage {
    WebDriver driver;
    By accountDeletedElementBy = By.cssSelector("[data-qa='account-deleted']");
    By continueButtonBy = By.cssSelector("a[data-qa='continue-button']");

    public AccountDeletedPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkAccountDeleted() {
        WebElement accountDeletedElement = driver.findElement(accountDeletedElementBy);
        WebElement continueButton = driver.findElement(continueButtonBy);
        boolean isAccountDeletedDisplayed = accountDeletedElement.isDisplayed();
        System.out.println("'Account Deleted!' is displayed on the page: " + isAccountDeletedDisplayed);
        continueButton.click(); //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
    }
}


