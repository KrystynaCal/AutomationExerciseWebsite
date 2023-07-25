package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    WebDriver driver;
    String url = "http://automationexercise.com";

    By SignupLoginButtonBy = By.cssSelector("a[href='/login']");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToUrl(){
        driver.get(url);
    }
    public void signupLoginButtonIsVisible(){
        WebElement SignupLoginButton = driver.findElement(SignupLoginButtonBy);
        Boolean Display = SignupLoginButton.isDisplayed();
        System.out.println("PageHome is Diplayed: " + Display);
    }
    public void clickSignupLoginButton(){
        WebElement SignupLoginButton = driver.findElement(SignupLoginButtonBy);
        SignupLoginButton.click();
    }


}
