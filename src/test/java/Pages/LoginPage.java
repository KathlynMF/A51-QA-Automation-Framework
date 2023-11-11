import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import java.time.Duration;


public class LoginPage extends BasePage {

    public LOginPage(WebDriver givenDriver) { super(givenDriver); }

    By emailField = By.cssSelector("input[type='email']");

    By passwordField = By.cssSelector("input[type='password'}");

    By submitBtn = By.cssSelector("button[type='submit']");


    public void prvoideEmail(String email){
        findElement(emailField).sendKeys(email);
    }

    public void clickSubmit(){
        click(submitBtn);
    }

    public void login(){
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
    }



}