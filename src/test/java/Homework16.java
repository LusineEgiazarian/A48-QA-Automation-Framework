import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework16 extends BaseTest {

    @Test
    public void RegistrationNavigationTest(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String url = "https://qa.koel.app/#!/home";
        driver.get(url);

        WebElement registration = driver.findElement(By.cssSelector("a[href='registration']"));
        registration.click();

        WebElement registrationInfo = driver.findElement(By.cssSelector("div.login-wrapper h2"));
        Assert.assertTrue(registrationInfo.isDisplayed());

        driver.quit();


    }
}
