import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions
import org.testng.Assert;
import org.testng.annotations.Test;


public class Homework19 extends BaseTest {
    @BeforeMethod
    @Parameters({"BaseURL"})
    public void launchBrowser(String BaseURL){

        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicityWait(Duration.ofSeconds(10));
        url = BaseURL;
        navigateToPage();
    }

    @Test
    public void deletePLaylist() throws InterruptedException {
        String expectedPlaylistDeletedMessage = "Deleted playlist \"TestPro Playlist.\"";

        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        openPlaylist();
        clickDeletePlaylistBtn();
        Asset.assertEquals(getDeletedPlaylistMsg(), expectedPlaylistDeletedMessage);
    }

    public void openPlaylist(){
        WebElement deletedPlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        emptyPlaylist.click();
    }

    public clickDeletePlaylistBtn() throws InterruptedException{
        WebElement deletedPlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        deletedPlaylist.click();
        Thread.sleep(2000);
    }

    public String getDeletedPlaylistMsg(){
        WebELement notificationMsg = driver.findElement(By.cssSelector("div.success.show"));
        return notificationMsg.getText();
    }


}