package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class LoginPage {
    WebDriver driver;
    By newUserSignupBy = By.cssSelector(".signup-form");
    By nameNewUserBy = By.cssSelector("input[placeholder=Name]");
    By emailNewUserBy = By.cssSelector("input[data-qa='signup-email']");
    By signupButtonBy = By.cssSelector("button[data-qa='signup-button']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void newUserSignupIsVisible() {
        WebElement newUserSignup = driver.findElement(newUserSignupBy);
        boolean newUserSignupIsVisible = newUserSignup.isDisplayed();
        System.out.println("New User Signup! is visible: " + newUserSignupIsVisible);
    }

    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        return salt.toString();
    }

    public void registerNewUser() {
        WebElement name = driver.findElement(nameNewUserBy);
        WebElement emailNewUser = driver.findElement(emailNewUserBy);
        name.sendKeys("FirstName");
        emailNewUser.sendKeys(getSaltString() + "@gmail.com");
        WebElement signupButton = driver.findElement(signupButtonBy);
        signupButton.click();
    }
}
