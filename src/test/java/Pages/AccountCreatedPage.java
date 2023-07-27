package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountCreatedPage {

    WebDriver driver;
    By accountCreatedBy = By.cssSelector("h2[data-qa='account-created']");
    By continuebuttonBy = By.cssSelector("a[data-qa='continue-button']");

    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
    }

    public void accountCreated() {
        WebElement accountCreated = driver.findElement(accountCreatedBy);
        WebElement continuebutton = driver.findElement(continuebuttonBy);
        boolean visibility = accountCreated.isDisplayed();
        System.out.println("Account created is visible: " + visibility);
        continuebutton.click();
    }
}
