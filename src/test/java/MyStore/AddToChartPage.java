package MyStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
//        driver.get("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product#/1-size-s");
        driver.get("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=10&rewrite=brown-bear-printed-sweater&controller=product#/2-size-m");
        WebElement quantity = driver.findElement(By.id("quantity_wanted"));
        WebElement increaseItem = driver.findElement(By.className("bootstrap-touchspin-up"));
        increaseItem.click();
        increaseItem.click();
        increaseItem.click();
        increaseItem.click();
        driver.findElement(By.className("add-to-cart")).click();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=cart&action=show");
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=order");
        driver.findElement(By.name("confirm-addresses")).click();
        driver.findElement(By.name("confirmDeliveryOption")).click();
        driver.findElement(By.id("payment-option-1")).click();
        driver.findElement(By.id("conditions_to_approve[terms-and-conditions]")).click();
        driver.findElement(By.id("payment-confirmation")).click();

    }
}
