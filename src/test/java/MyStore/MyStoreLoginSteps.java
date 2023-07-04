package MyStore;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStoreLoginSteps {
    private WebDriver driver;

    @Given("I'm on MyStore main page")
    public void openMyStoreLoginPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-course.coderslab.com/index.php?controller=authentication&back=my-account");
    }

    @When("I enter valid username and password")
    public void loginAs() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement loginInput = driver.findElement(By.name("email"));
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys("jannowak@jannowak.pl");

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("123456");

    }

    @Then("I'm logged in")
    public void signInBtn() {
        WebElement signInButton = driver.findElement(By.id("submit-login"));
        signInButton.click();

    }

}
