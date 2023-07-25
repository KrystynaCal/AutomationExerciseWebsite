package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void First_test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        driver.quit();
    }
}
