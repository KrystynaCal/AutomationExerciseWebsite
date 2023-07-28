package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;

    @Before
    public void setupAll() {
        driver = new ChromeDriver();
    }

    @After
    public void teardown() {
        driver.close();
        driver.quit();
    }
}
