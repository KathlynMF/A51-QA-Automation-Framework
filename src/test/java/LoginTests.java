<<<<<<< Updated upstream
=======

import org.openqa.selenium.By;
>>>>>>> Stashed changes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {


    @Test
    public void loginEmptyEmailPassword() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }

    @Test
    public void loginValidEmailPassword(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test(enabled = false, description = "Test has been marked as skipped due to an ongoing issue, JIRA-757.")
    public void loginInvalidEmailValidPassword(){

        ChromeOptions options = new ChromeOptions();
        var chromeOptions = options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        WebDriver.Timeouts timeouts = null;
        timeouts.implicitlyWait(Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);

        WebElement emailField = driver.findElement(new By.ByCssSelector("input[type ='email']"));
        emailField.clear();
        emailField.sendKeys("invalid@class.com");

    }
}