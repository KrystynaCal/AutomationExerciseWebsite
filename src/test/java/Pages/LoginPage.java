package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    By newUserSignupBy = By.cssSelector(".signup-form");
    By nameBy = By.cssSelector("input[placeholder=Name]");
    By emailNewUserBy = By.cssSelector("form[action='/signup'] input[placeholder='Email Address']");
    By signupButtonBy = By.cssSelector("button[data-qa='signup-button'].btn-default");
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void newUserSignupIsVisible(){
        WebElement newUserSignup = driver.findElement(newUserSignupBy);
        boolean newUserSignupIsVisible = newUserSignup.isDisplayed();
        System.out.println("New User Signup! is visible: " + newUserSignupIsVisible);
    }

    public void registerNewUser(){
        WebElement name = driver.findElement(nameBy);
        WebElement emailNewUser = driver.findElement(emailNewUserBy);
        name.sendKeys("FirstName");
        emailNewUser.sendKeys("LastName@gmail.com");
        WebElement signupButton = driver.findElement(signupButtonBy);
        signupButton.click();
    }


}
