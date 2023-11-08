import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Homework20 extends BaseTest {

    String new PlaylistName = "Sample Edited Playlist";

    @Test
    public void renamePlaylist(){

        String updatedPlaylistMsg = "Updated playlist \"Sample Edited Playlist.\"";

        provideEmail("demo@class.com");
        providePassword("te$t$udent");
        clickSubmit();
        doubleClickPlaylist();
        enterNewPlaylistName();
        Assert.assertEquals(getRenamePlaylistSuccessMsg(), updatedPlaylistMsg);
    }

}