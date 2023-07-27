package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedInAsUserPage {
    WebDriver driver;
    By loggedInasBy = By.cssSelector("i.fa-user");
    By deleteAccountBy = By.cssSelector("a[href='/delete_account']");

    public LoggedInAsUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void deletedAccount() {
        WebElement loggedInas = driver.findElement(loggedInasBy);
        boolean LoggedInasIsVisible = loggedInas.isDisplayed();
        System.out.println("'Logged in as username' is visible" + LoggedInasIsVisible);
        WebElement deleteAccount = driver.findElement(deleteAccountBy);
        deleteAccount.click();
    }
}