import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {


    WebDriver driver;
    @Test
    public void openLoginPageTest(){
        driver.get("http://bbb.koel.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("/"));

    }

    @FindBy (css = "[type='email']")
    private WebElement emailField;
    @FindBy (css = "[type='password']")
    private WebElement passwordField;
    @FindBy(css = "type[='submit']")
    private WebElement submitButtonLocator;

    public LoginPage (WebDriver givenDriver){
        super(givenDriver);
    }
    public LoginPage clickSubmitBtn(){
        submitButtonLocator.click();
        return this;
    }
    public LoginPage provideEmail(String email){
        emailField.sendKeys(email);
        return this;
    }
    public LoginPage providePassword(String password){
        passwordField.sendKeys(password);
        return this;
    }



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
}