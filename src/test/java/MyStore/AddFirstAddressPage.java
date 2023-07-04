package MyStore;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddFirstAddressPage {
    private WebDriver driver;

    @Given("I'm logged to account")
    public void loginToAccount() {
/*        MyStoreLoginSteps myStoreLoginSteps = new MyStoreLoginSteps();
        myStoreLoginSteps.openMyStoreLoginPage();
        myStoreLoginSteps.loginAs();
        myStoreLoginSteps.signInBtn();*/
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-course.coderslab.com/index.php?controller=authentication&back=my-account");
        WebElement loginInput = driver.findElement(By.name("email"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys("jannowak@jannowak.pl");
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("123456");
        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();

    }

    @When("I'm adding first address")
    public void iMAddingFirstAddress() {

        driver.findElement(By.id("address-link")).click();
    }

    @And("I enter alias {string} address {string} city {string} postcode {string} phone {string}")
    public void iEnterAliasAddressCityPostcodePhone(String alias, String address, String city, String postcode, String phone) {
        driver.findElement(By.id("field-alias")).sendKeys(alias);
        driver.findElement(By.id("field-address1")).sendKeys(address);
        driver.findElement(By.id("field-city")).sendKeys(city);
        driver.findElement(By.id("field-postcode")).sendKeys(postcode);
        driver.findElement(By.id("field-phone")).sendKeys(phone);
    }


    @Then("I save the form")
    public void iSaveTheForm() {
        driver.findElement(By.className("form-control-submit"));
    }
}
