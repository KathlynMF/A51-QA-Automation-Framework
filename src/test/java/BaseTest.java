import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseTest {

    public void navigateToPage(){
        driver.get(url);
    }
   public void provideEmail(String email){
       WebElement emailField = driver.findElement(By.cssSelector("input{type='email"));
       emailField.clear();
       emailFiled.sendKeys(email);
   }

   public void providePassword(String password){
       WebElement passwordField = driver.findELement(By.cssSelector("input[type='password'"));
       passwordField.clear();
       passwordField.sendKeys(password);
   }

   public void clickSubmit(){
       WebElement submit = driver.findElement(By.cssSelector("button['type ='submit']"));
       submit.click();
   }





}