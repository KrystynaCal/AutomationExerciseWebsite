package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

public class EnterAccountInformationPage {
    WebDriver driver;
    By visibilityEnterAccountInformationBy = By.cssSelector(".title.text-center");
    By titleMrBy = By.id("id_gender1");
    By titleMrsBy = By.id("id_gender2");
    By nameBy = By.id("name");
    By passwordBy = By.id("password");
    By dayOfBirthBy = By.id("days");
    By monthOfBirthBy = By.id("months");
    By yearOfBirthBy = By.id("years");
    By newsletterBy = By.id("newsletter");
    By specialoffersBy = By.id("optin");
    By firstNameBy = By.id("first_name");
    By lastNameBy = By.id("last_name");
    By companyBy = By.id("company");
    By address1By = By.id("address1");
    By countryBy = By.id("country");
    By stateBy = By.id("state");
    By cityBy = By.id("city");
    By zipcodeBy = By.id("zipcode");
    By mobileNumberBy = By.id("mobile_number");
    By createAccountBy = By.cssSelector("button[data-qa='create-account']");

    public EnterAccountInformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void VisibilityofEnterAccountInformation() {
        WebElement visibilityEnterAccountInformation = driver.findElement(visibilityEnterAccountInformationBy);
        boolean isvisibleEnterAccountInformation = visibilityEnterAccountInformation.isDisplayed();
        System.out.println("Enter Account Information is Visible: " + isvisibleEnterAccountInformation);
    }

    public void fillUserData() {
        WebElement titleMr = driver.findElement(titleMrBy);
        WebElement titleMrs = driver.findElement(titleMrsBy);
        WebElement name = driver.findElement(nameBy);
        WebElement password = driver.findElement(passwordBy);
        Select dayOfBirth = new Select(driver.findElement(dayOfBirthBy));
        Select monthOfBirth = new Select(driver.findElement(monthOfBirthBy));
        Select yearOfBirth = new Select(driver.findElement(yearOfBirthBy));
        WebElement newsletter = driver.findElement(newsletterBy);
        WebElement specialoffers = driver.findElement(specialoffersBy);
        WebElement firstName = driver.findElement(firstNameBy);
        WebElement lastName = driver.findElement(lastNameBy);
        WebElement company = driver.findElement(companyBy);
        WebElement address1 = driver.findElement(address1By);
        Select country = new Select(driver.findElement(countryBy));
        WebElement state = driver.findElement(stateBy);
        WebElement city = driver.findElement(cityBy);
        WebElement zipcode = driver.findElement(zipcodeBy);
        WebElement mobileNumber = driver.findElement(mobileNumberBy);
        WebElement createAccount = driver.findElement(createAccountBy);


        titleMr.click();
        assertThat(titleMr.isSelected(), is(true));
        name.clear();
        name.sendKeys("NickName");
        assertEquals(name.getAttribute("value"), "NickName");
        password.sendKeys("password");
        dayOfBirth.selectByVisibleText("10");
        monthOfBirth.selectByVisibleText("August");
        yearOfBirth.selectByVisibleText("2021");
        newsletter.click();
        boolean newsletterIsSelected = newsletter.isSelected();
        System.out.println("Newsletter is selected: " + newsletterIsSelected);
        specialoffers.click();
        assertThat(specialoffers.isSelected(), is(true));
        firstName.sendKeys("Fist Name");
        lastName.sendKeys("Last Nama");
        company.sendKeys("Company");
        address1.sendKeys("address1");
        country.selectByVisibleText("Canada");
        state.sendKeys("State");
        city.sendKeys("City");
        zipcode.sendKeys("Zipcode");
        mobileNumber.sendKeys("123 456 789");
        createAccount.click();
    }
}
