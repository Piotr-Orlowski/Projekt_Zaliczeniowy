package MyStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToChartPage {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
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
        WebElement searchInput = driver.findElement(By.name("s"));
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys("Hummingbird Printed Sweater");
        searchInput.submit();
        driver.get("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product#/1-size-s");
        WebElement sizeComboBox = driver.findElement(By.id("group_1"));
        sizeComboBox.clear();
        sizeComboBox.sendKeys("M");
        sizeComboBox.submit();
    }
}
