import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;



public class ProfileTests extends BaseTest {

    @Test
    public void changeProfileName() throws InterruptedException {

        navigateToPage();

        provideEmail("dem@class.com");
        providePassword("te$t$tudent");
        clickSubmit();

        String randomName = generateRandomName();

        provideCurrentPassword("te$t$tudent");
        provideProfileName(randomName);
        clickSaveButton();

        Thread.sleep(2000);
        WebElement actualProfileName = driver.findElement(By.cssSelector("a.view-profile>span"));
         Assert.assertEquals(actualProfileName.getTect(). randomName);



    }
}

