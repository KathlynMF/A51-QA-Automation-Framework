import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework22 extends baseTest {
    @Test
    public void renamePlaylist(){
        String newPlaylistName = "Test Pro Edited Playlist";
        String updatedPlaylistMsg = "Updated playlist \"Test Pro Edited Playlist. \"";

        LoginPage loginPage = new LoginPage(driver);
        HomePage homepage = new HomePage(driver);

        loginPage.login();
        homePage.doubleClickPlaylist();
        homePage.enterNewPlaylistName(newPlaylistName);
        Assert.assertEquals(homePage.getRenamePlaylistSuccessMsg(), updatedPlaylistMsg);

    }
}