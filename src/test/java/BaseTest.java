<<<<<<< Updated upstream
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
=======

import org.openqa.selenium.WebDriver;
>>>>>>> Stashed changes
import org.testng.annotations.BeforeSuite;


public class BaseTest {

    public WebDriver driver = null;

    //@Test(dataProvider = "LoginData")
    public void navigateToPage(String url){
        driver.get(url);
    }

    @BeforeSuite
    static void setupClass() {
<<<<<<< Updated upstream
        WebDriverManager.chromedriver().setup();
=======
        Object WebDriverManager = new Object();
        WebDriverManager.toString()

>>>>>>> Stashed changes
    }
}